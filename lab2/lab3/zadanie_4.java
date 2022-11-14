/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;

import java.util.Scanner;

/**
 *
 * @author Davydov
 */
public class zadanie_4 {
    public static void main(String[] args) {
        double g = 9.8;
        Scanner in = new Scanner(System.in);
        System.out.println("enter h: ");
        double h = in.nextInt();
        double t = Math.sqrt(2*h/g);
        System.out.println(t);
        
    }
}
