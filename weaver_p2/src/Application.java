public class Application {
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver1.updateSavingsBalance();

            saver2.calculateMonthlyInterest();
            saver2.updateSavingsBalance();

            System.out.printf("Month " + (i + 1) + ": $%.2f\n", saver1.getSavingsBalance());
            System.out.printf("Month " + (i + 1) + ": $%.2f\n", saver2.getSavingsBalance());
            System.out.println();
        }

        SavingsAccount.modifyInterestRate(0.05);
        System.out.printf("Next month's interest earned: $%.2f and $%.2f\n", saver1.calculateMonthlyInterest(),
                + saver2.calculateMonthlyInterest());
        saver1.updateSavingsBalance();
        saver2.updateSavingsBalance();
        System.out.printf("Balances: $%.2f and $%.2f", saver1.getSavingsBalance(), saver2.getSavingsBalance());


    }
}
