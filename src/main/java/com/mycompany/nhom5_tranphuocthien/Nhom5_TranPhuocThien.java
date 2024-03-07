/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nhom5_tranphuocthien;

/**
 *
 * @author Thien
 */
public class Nhom5_TranPhuocThien {
        
    public int divide(int dividend, int divisor){
        if(divisor == 0){
            throw new ArithmeticException("Không thể chia cho số 0");
        }
        return dividend / divisor;
    }
}
