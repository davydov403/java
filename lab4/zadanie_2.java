/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;
import java.util.Scanner;
/**
 *
 * @author Davydov
 */
public class zadanie_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 2; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(Math.pow(i, -1) + " minus ");
                sum -= Math.pow(i, -1);
            }
            else {            
            System.out.println(Math.pow(i, -1) + " plus ");
            sum += Math.pow(i, -1);
            }
        }
        System.out.println(sum);
    }
    
}
