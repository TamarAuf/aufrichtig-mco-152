package aufrichtig.cashier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PayTest {
    @Test
    public void pay() throws NotEnoughChangeException{
        //given
        Cash register = new Cash();
        register.setDollar(10);
        register.setQuarter(10);
        register.setDime(10);
        register.setNickel(10);
        register.setPenny(10);

        Cash custCash = new Cash();
        custCash.setDollar(1);
        custCash.setQuarter(1);

        Cashier cashier = new Cashier();

        Cash change = new Cash();
        //when
        change = cashier.pay(1.10, custCash);
        //then
        /*assertEquals(11, register.getDollar());
        assertEquals(11, register.getQuarter());
        assertEquals(9, register.getDime());
        assertEquals(9, register.getNickel());*/

        assertEquals(1, change.getDime());
        assertEquals(1, change.getNickel());
    }
}