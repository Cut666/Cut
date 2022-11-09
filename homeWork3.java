package homeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class homeWork3 {

//    2160. Minimum Sum of Four Digit Number After Splitting Digits

//    public static int minimumSum(int num) {
//        int arr[]=new int[4];
//        for (int j = 0; j < arr.length; j++) {
//            arr[j] = num%10;
//            num = num/10;
//        }
//        Arrays.sort(arr);
//        int n1=arr[3]+10*arr[0];
//        int n2=arr[2]+ 10*arr[1];
//        return n1+n2;
//    }

                    //1365. How Many Numbers Are Smaller Than the Current Number

//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int [] small = new int[101];
//        for (int i = 0; i < nums.length; i++) {
//            small[nums[i]]++;
//        }
//        for (int i = 1; i < small.length; i++) {
//            small[i] += small[i-1];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int t = nums[i];
//            if(t==0){
//                nums[i]=0;
//            }
//            else {
//                nums[i] = small[t-1];
//            }
//        }
//        return nums;
//    }


                    //1329. Sort the Matrix Diagonally
//    public int[][] diagonalSort(int[][] mat) {
//        int m = mat.length;
//        int n = mat[0].length;
//        for (int i = 0; i < n; i++) {
//            sort(mat,0,i,m,n);
//        }
//        for (int i = 0; i < m; i++) {
//            sort(mat,i,0,m,n);
//        }
//        return mat;
//    }
//    void sort(int[][]mat, int row, int col, int m, int n){
//        List<Integer> values = new ArrayList<>();
//        int r = row, c=col;
//        while (r<m && c<n){
//            values.add(mat[r][c]);
//            r++;
//            c++;
//        }
//        Collections.sort(values);
//        r=row;
//        c=col;
//        int j = 0;
//        while (r<m && c<n){
//            mat[r][c] = values.get(j++);
//            r++;
//            c++;
//        }
//    }

                    //    2418. Sort the People
//    private class People {
//    private String name;
//    private int height;
//
//    public People(String name, int height) {
//                            this.name = name;
//                            this.height = height;
//        }
//    }
//    public String[] sortPeople(String[] names, int[] heights) {
//        List<People> peoples = new ArrayList<>();
//        for (int i = 0; i < names.length; i++) {
//            peoples.add(new People(names[i],heights[i]));
//        }
//        peoples.sort((a, b) -> (b.height - a.height));
//        String[] ans = new String[names.length];
//        for (int i = 0; i < names.length; i++) {
//            ans[i] = peoples.get(i).name;
//        }
//        return ans;
//    }

//                    2037. Minimum Number of Moves to Seat Everyone
//    public int minMovesToSeat(int[] seats, int[] students) {
//        Arrays.sort(seats);
//        Arrays.sort(students);
//        int moves = 0;
//        for (int i = 0; i < seats.length; ++i) {
//            moves += Math.abs(seats[i] - students[i]);
//        }
//        return moves;
//    }


    //    1913. Maximum Product Difference Between Two Pairs
//    public int maxProductDifference(int[] nums) {
//        Arrays.sort(nums);
//        int a = nums[nums.length-1];
//        int b = nums[nums.length-2];
//        int c = nums[0];
//        int d = nums[1];
//        return (a*b) - (c*d);
//    }

                //    1877. Minimize Maximum Pair Sum in Array
//    public int minPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int res =0;
//        for (int i = 0; i < nums.length/2; i++) {
//            int sum = nums[i]+nums[nums.length-1-i];
//            res= Math.max(res,sum);
//        }
//        return res;
//    }

            //    1464. Maximum Product of Two Elements in an Array
//    public int maxProduct(int[] nums) {
//        Arrays.sort (nums);
//        int a = nums[nums.length-1] -1;
//        int b = nums[nums.length-2] -1;
//        return a*b;
//    }


            //    1561. Maximum Number of Coins You Can Get
//    public static int maxCoins(int[] piles) {
//        Arrays.sort(piles);
//        int sum=0;
//        int i = piles.length-2;
//        for (int j = 0; j < piles.length/3; j++) {
//            sum +=piles[i];
//            i-=2;
//        }
//        return sum;
//    }


}
