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
public class zadanie_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a,c: ");
        double a = in.nextInt();
        double c = in.nextInt();
        double b = Math.sqrt(c*c - a*a);
        System.out.println(b);
    } 
}
