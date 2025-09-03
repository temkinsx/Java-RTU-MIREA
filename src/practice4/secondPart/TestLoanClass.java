package practice4.secondPart;

import java.util.Scanner;

public class TestLoanClass {
    /**
     * Main method
     */
    public static void main(String[] args) throws IllegalArgumentException {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите процентную ставку, например, 8.25: ");
            double annualInterestRate = input.nextDouble();
            if(annualInterestRate <= 0) throw new IllegalArgumentException("процентная ставка должна быть больше нуля");

            // Enter number of years
            System.out.print("Введите срок кредита: ");
            int numberOfYears = input.nextInt();
            if(numberOfYears <= 0) throw new  IllegalArgumentException("срок кредита должен быть больше 0");

            // Enter loan amount
            System.out.print("Введите сумму кредита, например: 120000.95: ");
            double loanAmount = input.nextDouble();
            if(loanAmount <= 0) throw new IllegalArgumentException("сумма кредита должна быть больше 0");

            // Create Loan object
            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

            // Display loan date, monthly payment, and total payment
            System.out.printf("Кредит был выдан %s\nМесячный платеж: %.2f рублей\nСумма кредита: %.2f рублей\n",
                    loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                    loan.getTotalPayment());
        } catch (IllegalArgumentException e) {
            System.out.print("Ошибка: " + e.getMessage());
        }
    }
}