package lab6;

import java.util.Scanner;

/**
 *
 * @author Davydov
 */
public class Task_3 {
    public static void main(String[] args) {
        final int months_per_year = 12;

        double annual_interest_rate, monthly_interest_rate, loan_amount, monthly_payment, total_payment;
        int number_of_years;

        Scanner input = new Scanner(System.in);
        System.out.println("ставка по кредиту: ");
        annual_interest_rate = input.nextDouble();

        System.out.println("период кредитования(года): ");
        number_of_years = input.nextInt();

        System.out.println("Сумма кредита (рубли): ");
        loan_amount = input.nextDouble();

        monthly_interest_rate = annual_interest_rate / 12 / 100;

        monthly_payment = loan_amount * monthly_interest_rate / (1 - 1 / Math.pow(1 + monthly_interest_rate, number_of_years * months_per_year));
        total_payment = monthly_payment * number_of_years * months_per_year;

        System.out.println("ежемесячный платеж: " + (int)(monthly_payment * 100) / 100.0 + "руб.");
        System.out.println("стоимость кредита: " + (int)(total_payment * 100) / 100.0 + "руб.");


    }

}
