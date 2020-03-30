package aufrichtig.cashier;

/**
 *
 * @author Tamar Aufrichtig
 */
public class Cash {
    private int twentyDollar;
    private int tenDollar;
    private int fiveDollar;
    private int dollar;
    private int quarter;
    private int dime;
    private int nickel;
    private int penny;

    public Cash() throws NotEnoughChangeException{
        if(twentyDollar < 0 || tenDollar < 0 || fiveDollar < 0 || dollar < 0
                || quarter < 0 || dime < 0 || nickel < 0 || penny < 0) {
            throw new NotEnoughChangeException();
        }
    }

    public int getTwentyDollar() {
        return twentyDollar;
    }

    public void setTwentyDollar(int twentyDollar) {
        this.twentyDollar = twentyDollar;
    }

    public int getTenDollar() {
        return tenDollar;
    }

    public void setTenDollar(int tenDollar) {
        this.tenDollar = tenDollar;
    }

    public int getFiveDollar() {
        return fiveDollar;
    }

    public void setFiveDollar(int fiveDollar) {
        this.fiveDollar = fiveDollar;
    }

    public int getDollar() {
        return dollar;
    }

    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getDime() {
        return dime;
    }

    public void setDime(int dime) {
        this.dime = dime;
    }

    public int getNickel() {
        return nickel;
    }

    public void setNickel(int nickel) {
        this.nickel = nickel;
    }

    public int getPenny() {
        return penny;
    }

    public void setPenny(int penny) {
        this.penny = penny;
    }
}