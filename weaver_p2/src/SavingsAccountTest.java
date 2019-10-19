import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {
    SavingsAccount saver1 = new SavingsAccount(2000);
    SavingsAccount saver2 = new SavingsAccount(3000);

    @Test
    void testCalculateMonthlyInterest() {
        assertEquals(8.3333, saver1.calculateMonthlyInterest(),.0001 );
        assertEquals(12.5000, saver2.calculateMonthlyInterest(),.0001 );
    }

    @Test
    void testModifyInterestRate() {
        assertEquals(0.04, SavingsAccount.modifyInterestRate(0.04), 0.00001);
        assertEquals(0.05, SavingsAccount.modifyInterestRate(0.05), 0.00001);
    }

}