package lab6;

import java.util.Scanner;

/**
 *
 * @author Davydov
 */
public class Task_4 {
    public static void main(String[] args) {
        double dollars, rub;
        final double course = 72.12;
        Scanner input = new Scanner(System.in);
        System.out.println("dollars: ");
        dollars = input.nextDouble();
        rub = dollars*course;
        System.out.println("Rub from dollars: " + Math.ceil(rub));

    }
}
