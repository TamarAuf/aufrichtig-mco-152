package aufrichtig.cashier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayTest {
    @Test
    public void pay() throws NotEnoughChangeException{
        //given
        Cash custCash = new Cash();
        custCash.setDollar(1);
        custCash.setQuarter(1);

        Cashier cashier = new Cashier();

        Cash change;
        //when
        change = cashier.pay(1.10, custCash);
        //then
        assertEquals(.15, cashier.getChange());
        assertEquals(1, change.getDime());
        assertEquals(1, change.getNickel());
    }
}