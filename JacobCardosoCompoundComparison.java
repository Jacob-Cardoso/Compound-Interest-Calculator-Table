import java.io.*;
import java.util.Scanner;

 class InterestCompound {
    Scanner scan = new Scanner(System.in);
    String cont;
    int time;
    double balance, interest, interestRate, principal;
    double yearly, monthly, biweekly;

    void invInterest() {
        while (true) {

            System.out.print("What is the principal you plan on investing?: ");     
            principal = scan.nextDouble();
    
            System.out.print("What is the interest rate of this investment?: ");       
            interestRate = scan.nextDouble();
            interestRate /= 100;
            
            System.out.print("What term are you looking to find the investment value at?: ");
            time = scan.nextInt();
            System.out.println();
            
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", "Principal", "Term", "Interest", "Yearly", "Monthly", "Bi-Weekly");

            interest = 1 + (interestRate / 1);
            yearly = principal * (Math.pow(interest, 1 * time));
            interest = 1 + (interestRate / 12);
            monthly = principal * (Math.pow(interest, 12 * time));
            interest = 1 + (interestRate / 24);
            biweekly = principal * (Math.pow(interest, 24 * time));
            System.out.printf("$%-14.2f%-15d$%-14.2f$%-14.2f$%-14.2f$%-14.2f%n", principal, time, interestRate * 100, yearly, monthly, biweekly);

        }
    }
}

public class JacobCardosoCompoundComparison {
    public static void main(String[] args) throws IOException{
        InterestCompound myInvestment = new InterestCompound();
        myInvestment.invInterest();
    }
}
