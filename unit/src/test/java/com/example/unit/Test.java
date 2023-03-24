package com.example.unit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.Arrays;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class Test {
//    @org.junit.jupiter.api.Test
//    void demoTestMethod1(){
//        assertTrue(true,"1");
//        assertFalse(true,"2");
//        assertTrue(true,"3");
//    }
//    @org.junit.jupiter.api.Test
//    void demoTestMethod2(){
//        assertTrue(true,"1");
//    }
//
//    @org.junit.jupiter.api.Test
//    void testMultiplier(){
//        UnitApplication test = new UnitApplication();
//        int data = test.multiplier(5,6);
//        assertEquals(10,data);
//    }
//
//        UnitApplication unitApplication;
//        @BeforeEach
//        void test() throws Exception{
//            unitApplication = new UnitApplication();
//
//        }
//        @org.junit.jupiter.api.Test
//    void testMultiplier1(){
//            assertEquals(unitApplication.multiplier(5,7),35);
//        }
//    @org.junit.jupiter.api.Test
//    void testMultiplier2(){
//        assertEquals(unitApplication.multiplier(5,0),0);
//    }
//    @org.junit.jupiter.api.Test
//    @DisplayName("thai test")
//    void testMultiplier3(){
//        assertEquals(unitApplication.multiplier2(5),0);
//    }
//
//    @RepeatedTest(5)
//    void testMultiplier4(){
//        assertEquals(unitApplication.multiplier2(5),0);
//    }
//    @org.junit.jupiter.api.Test
//    void testMultiplier5() {
//            assertThrows(Exception.class, () ->unitApplication.multiplier3(99999,5), "sfsdf");
//        ;
//    }
//    @org.junit.jupiter.api.Test
//    void testA(){
//            assertTrue('a'<'b', ()->"sdfksfk" +"ldfsfsldfk");
//    }
//    @org.junit.jupiter.api.Test
//    void testB(){
//            assertAll("multiplier3",
//                    () ->assertThrows(Exception.class,()->unitApplication.multiplier3(9,5)),
//                    () ->assertThrows(Exception.class,()->unitApplication.multiplier3(99,5)));
//    }
//
//    @TestFactory
//    Stream<DynamicTest> testDifferentMultiplyOperations(){
//
//            int[][] data = new int[][] {{1,2,2},{5,3,15},{121,4,286}};
//            return Arrays.stream(data).map(entry ->{
//                int m1 = entry[0];
//                int m2 = entry[1];
//                int expected = entry[2];
//                return dynamicTest(m1+"*"+m2+"*"+expected, ()->{
//                    assertEquals(expected,unitApplication.multiplier(m1,m2));
//                });
//            });
//    }
//
//    public static int [][] data(){
//            return new int [][]{{2,2,4},{1,25,6},{4,52,5}};
//    };
//        @ParameterizedTest
//    @MethodSource(value = "data")
//    void test6(int [] data){
//            int m1 = data[0];
//            int m2 = data[1];
//            int expected = data[2];
//            assertEquals(expected,unitApplication.multiplier(m1,m2));
//        }

//        bài về nhà của em ạ
    @org.junit.jupiter.api.Test
    public void testWriteFile(@TempDir Path tempDir) throws Exception {
        String[] inputArray = {"input1", "input2", "input3"};
        File outputFile = tempDir.resolve("output.txt").toFile();
        FileWriter fileWriter = new FileWriter(outputFile);
        for (String input : inputArray) {
            fileWriter.write(input + "\n");
        }
        fileWriter.close();
        assertTrue(outputFile.exists());
    }
}
