import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
}

class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate = 0.05;

    SavingsAccount (int initialSavings){
        savingsBalance = initialSavings;
    }
    
    double calculateMonthlyInterest(){
        double monthlyInterest = this.savingsBalance * annualInterestRate / 12;
        return monthlyInterest;
    }
    
    static double modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
        return annualInterestRate;
    }

    double getSavingsBalance(){
        return this.savingsBalance;
    }

    double getAnnualInterestRate(){
        return annualInterestRate;
    }

    void updateSavingsBalance(){
        this.savingsBalance += calculateMonthlyInterest();
    }
}