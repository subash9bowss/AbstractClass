/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.day2;

import com.lfa.day2.util.MathCommand;
import com.lfa.day2.util.AddCommand;
import com.lfa.day2.util.DivideCommand;
import com.lfa.day2.util.Factorial;
import com.lfa.day2.util.MultiplyCommand;
import com.lfa.day2.util.Power;
import com.lfa.day2.util.SubtractCommand;

/**
 *
 * @author Real
 */
public class MainClass {
    public static void main(String[] args) {
        MathCommand a = new AddCommand();
        MathCommand s = new SubtractCommand();
        MathCommand d = new DivideCommand();
        MathCommand m = new MultiplyCommand();
        MathCommand f = new Factorial();
        MathCommand p = new Power();
        
        System.out.println(a.calculate(3, 4));
        System.out.println(s.calculate(5, 3));
        System.out.println(d.calculate(4, 2));
        System.out.println(m.calculate(5, 3));
        System.out.println(p.calculate(5, 3));
        System.out.println(f.factorial(5));
        
    }
}
