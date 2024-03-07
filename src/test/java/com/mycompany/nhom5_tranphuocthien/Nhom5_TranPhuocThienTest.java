/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.nhom5_tranphuocthien;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thien
 */
public class Nhom5_TranPhuocThienTest {
    
    @Test
    public void testDividePassed() {
        int dividend = 10;
        int divisor = 2;
        Nhom5_TranPhuocThien instance = new Nhom5_TranPhuocThien();
        int expResult = 5;
        int result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDividefail() {
       
        int dividend = 40;
        int divisor = 0;
        Nhom5_TranPhuocThien instance = new Nhom5_TranPhuocThien();
        int expResult = 40;
        int result = instance.divide(dividend, divisor);
        assertEquals(expResult, result);
   
    }
    
}
