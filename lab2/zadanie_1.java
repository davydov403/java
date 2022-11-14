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
public class zadanie_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = in.nextInt();
        int rez = 0;
        for (int i = 0; i < n; i++) {
            rez = (int) Math.pow (2, n);
        }
        System.out.println(rez);
    }
    
}
