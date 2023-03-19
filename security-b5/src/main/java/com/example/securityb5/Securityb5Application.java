package com.example.securityb5;

import com.example.securityb5.model.Book;
import com.example.securityb5.model.Role;
import com.example.securityb5.model.User;
import com.example.securityb5.repository.BookRepository;
import com.example.securityb5.repository.RoleRepository;
import com.example.securityb5.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Set;

@SpringBootApplication
public class Securityb5Application implements CommandLineRunner {
    public static void main(String[] args) {

        SpringApplication.run(Securityb5Application.class, args);
    }
@Autowired
private BookRepository bookRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
//        Book book = new Book();
//        book.setTitle("sach1");
//        book.setDescription("tài liệu1");
//        Book book1 = new Book();
//        book1.setTitle("sach2");
//        book1.setDescription("tài liệu2");
//        bookRepository.saveAll(Arrays.asList(book1,book));
//
//        User user = new User();
//        user.setUserName("thai1");
//        user.setPassWork("123");
//
//        User user1 = new User();
//        user1.setUserName("thai2");
//        user1.setPassWork("123");
//        userRepository.saveAll(Arrays.asList(user1,user));

//        Role role = new Role();
//        role.setName("admin");
//        role.setUsers(Set.of(user));

//        Role role1 =new Role();
//        role1.setName("user");
//        role1.setUsers(Set.of(user,user1));
//        roleRepository.saveAll(Arrays.asList(role,role1));
//

    }
}
