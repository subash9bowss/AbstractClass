/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.day2.util;

/**
 *
 * @author Real
 */
public class Power extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        if(y==0){
            return 1;
        }
        else
            return x * calculate(x, y-1);
         }

    @Override
    public int factorial(int x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
