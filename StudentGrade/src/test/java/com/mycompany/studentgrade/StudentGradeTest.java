/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentgrade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows.10
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    /***
     all tests all made here
     * first test: to make sure the 90 works fine for grade A
     * second test: to make sure the 90 works for fine for grades B and F
     * third test: to make sure 82 works fine for grade B
     * fourth test: to make sure 70 works fine for grade F
     * fifth test: to make sure 101 works fine for grade F
     * final test: to make sure 100 works fine for grade A
     ***/
    @Test
    public void testGrade90A(){
        System.out.println("test for grade 90 with grade A");
        int mark = 90;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);        
        
    }
    @Test
    public void testGrade90B(){
        System.out.println("test for grade 90 with grade B");
        int mark = 90;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade90F(){
        System.out.println("test for grade 90 with grade F");
        int mark = 95;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade82B(){
        System.out.println("test for grade 82 with grade B");
        int mark = 82;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade70F(){
        System.out.println("test for grade 70 with grade F");
        int mark = 70;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade101F(){
        System.out.println("test for grade 101 with grade F");
        int mark = 101;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @Test
    public void testGrade100A(){
        System.out.println("test for grade 100 with grade A");
        int mark = 100;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);                
    }
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  
    
}
