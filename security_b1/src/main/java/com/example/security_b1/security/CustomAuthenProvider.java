package com.example.security_b1.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//lớp CustomAuthenProvider triển khai interface AuthenticationProvider, có định nghiac một contract cho các lớp có thể thực hiện xác thực (authentication) cho thông tin đăng nhập của người dùng
public class CustomAuthenProvider implements AuthenticationProvider {
//    @Autowired để tự động liên kết đối tượng InMemoryUserDetailsManager vào đối tượng hiện tại.
//InMemoryUserDetailsManager là một lớp trong Spring Security được sử dụng để quản lý danh sách các người dùng và thông tin đăng nhập của họ. Nó được sử dụng trong trường hợp cần thực hiện xác thực (authentication) người dùng bằng cách so sánh thông tin đăng nhập của họ với thông tin đã được lưu trữ trong bộ nhớ.
    @Autowired
    private InMemoryUserDetailsManager inMemoryUserDetailsManager;
    @Autowired
//    PasswordEncoder là 1 interface được dùng để mã hóa mật khẩu người dùng, PasswordEncoder cung cấp các phương thức để mã hóa mật khẩu người dùng, kiểm tra tính hợp lệ của mật khẩu sau khi người dùng đăng nhập và cập nhật mật khẩu của người dùng khi họ thay đổi mật khẩu
    private PasswordEncoder encoder;
//Phương thức authenticate() được ghi đè trong lớp CustomAuthenProvider để xác thực thông tin đăng nhập của người dùng.
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        sử dụng đối tượng authentication để lấy tên đăng nhập
        String username = authentication.getName();
//        sử dụng đối tượng authentication để lấy tên mật khẩu, vì getCredentials()trả về 1 đối tượng object nên sự dụng String.valueOf để chuyển đối đối tượng đó thành chuỗi String
        String rawPassword =String.valueOf(authentication.getCredentials());
        try {
//      inMemoryUserDetailsManager được sử dụng để lấy thông tin người dùng từ bộ nhớ dựa trên tên đăng nhập (username)
//phương thức loadUserByUsername() để lấy thông tin người dùng
            UserDetails userDetails = inMemoryUserDetailsManager.loadUserByUsername(username);
//  kiểm tra mật khẩu người dùng có khớp với mật khẩu đã lưu trữ trong userDetails không
//  encoder.matches dùng để mã hóa mật khẩu và so sánh với mật khẩu đã lưu trữ
            if (encoder.matches(rawPassword,userDetails.getPassword())){
//  tạo ra đối tượng UsernamePasswordAuthenticationToken với các tham số
//                username: tên đăng nhập
//                userDetails.getPassword(): mật khẩu đã được mã hóa
//                userDetails.getAuthorities(): danh sách các quyên được cấp cho người dùng
//  sau đó sẽ được chuyển đến AuthenticationManager để xác thực đăng nhập của người dùng. Nếu đăng nhập thành công, AuthenticationManager sẽ trả về một đối tượng Authentication mới, xác định rằng đăng nhập đã được xác thực thành công và chứa thông tin về người dùng và các quyền được cấp cho họ.
                return new UsernamePasswordAuthenticationToken(username,userDetails.getPassword(),userDetails.getAuthorities());
            }else {
                return null;
            }
        }catch (UsernameNotFoundException e) {
            return null;
        }
    }

    @Override
//kiểm tra xem loại đối tượng Authentication được truyền vào có phải là UsernamePasswordAuthenticationToken hay không bằng cách sử dụng phương thức isAssignableFrom của lớp Class
//    Nếu loại đối tượng Authentication là UsernamePasswordAuthenticationToken  phương thức sẽ trả về true để xác định rằng AuthenticationProvider có thể xử lý yêu cầu xác thực đối với loại đối tượng Authentication này.
//    Nếu phương thức supports trả về false cho một loại đối tượng Authentication cụ thể, AuthenticationProvider sẽ bỏ qua yêu cầu xác thực đối với loại đối tượng này và chuyển yêu cầu đến AuthenticationProvider khác trong chuỗi xác thực.
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
