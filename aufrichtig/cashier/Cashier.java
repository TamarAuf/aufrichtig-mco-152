package aufrichtig.cashier;

import aufrichtig.chashier.RegisterFrame;

import java.util.Random;

/**
 * @author Tamar Aufrichtig
 */
public class Cashier {

    public Cashier() throws NotEnoughChangeException {
    }

    private double originalPrice;
    private double moneySpent;

    private int twentsLeft;
    private int tensLeft;
    private int fivesLeft;
    private int onesLeft;
    private int quartsLeft;
    private int dimesLeft;
    private int nicksLeft;
    private int pennsLeft;

    private int twentsChange;
    private int tensChange;
    private int fivesChange;
    private int onesChange;
    private int quartsChange;
    private int dimesChange;
    private int nicksChange;
    private int pennsChange;

    private int twentsAvail;
    private int tensAvail;
    private int fivesAvail;
    private int onesAvail;
    private int quartsAvail;
    private int dimesAvail;
    private int nicksAvail;
    private int pennsAvail;

    private int regTwents;
    private int regTens;
    private int regFives;
    private int regOnes;
    private int regQuarts;
    private int regDimes;
    private int regNicks;
    private int regPenns;

    private double change = 0.0;
    private double regAmount;



    public Cash pay(double price, Cash custCash) throws NotEnoughChangeException {

        originalPrice = price;
        twentsLeft = custCash.getTwentyDollar();
        tensLeft = custCash.getTenDollar();
        fivesLeft = custCash.getFiveDollar();
        onesLeft = custCash.getDollar();
        quartsLeft = custCash.getQuarter();
        dimesLeft = custCash.getDime();
        nicksLeft = custCash.getNickel();
        pennsLeft = custCash.getPenny();

        int count = 0;
        while (price >= .01 || count == 2) {
            count += 1;
            while ((price >= 20 || count > 1) && twentsLeft > 0) {
                price -= 20;
                twentsLeft -= 1;
                moneySpent += 20;
            }

            while ((price >= 10 || count > 1) && tensLeft > 0) {
                price -= 10;
                tensLeft -= 1;
                moneySpent += 10;
            }

            while ((price >= 5 || count > 1) && fivesLeft > 0) {
                price -= 5;
                fivesLeft -= 1;
                moneySpent += 5;
            }

            while ((price >= 1 || count > 1) && onesLeft > 0) {
                price -= 1;
                onesLeft -= 1;
                moneySpent += 1;
            }

            while ((price >= .25 || count > 1) && quartsLeft > 0) {
                price -= .25;
                quartsLeft -= 1;
                moneySpent += .25;
            }

            while ((price >= .1 || count > 1) && dimesLeft > 0) {
                price -= .1;
                dimesLeft -= 1;
                moneySpent += .1;
            }

            while ((price >= .05 || count > 1) && nicksLeft > 0) {
                price -= .05;
                nicksLeft -= 1;
                moneySpent += .05;
            }

            while ((price >= .01 || count > 1) && pennsLeft > 0) {
                price -= .01;
                pennsLeft -= 1;
                moneySpent += .01;
            }
        }
        /*if(moneySpent < originalPrice){
            System.exit(0);
        }
        else{*/
        change = moneySpent - originalPrice;

        Random rand = new Random();

        regTwents = rand.nextInt(100);
        regTens = rand.nextInt(100);
        regFives = rand.nextInt(100);
        regOnes = rand.nextInt(100);
        regQuarts = rand.nextInt(100);
        regDimes = rand.nextInt(100);
        regNicks = rand.nextInt(100);
        regPenns = rand.nextInt(100);

        Cash register = new Cash();

        register.setTwentyDollar(regTwents);
        regAmount += regTwents;
        register.setTenDollar(regTens);
        regAmount += regTens;
        register.setFiveDollar(regFives);
        regAmount += regFives;
        register.setDollar(regOnes);
        regAmount += regOnes;
        register.setQuarter(regQuarts);
        regAmount += regQuarts;
        register.setDime(regDimes);
        regAmount += regDimes;
        register.setNickel(regNicks);
        regAmount += regNicks;
        register.setPenny(regPenns);
        regAmount += regPenns;

        twentsAvail = register.getTwentyDollar();
        tensAvail = register.getTenDollar();
        fivesAvail = register.getFiveDollar();
        onesAvail = register.getDollar();
        quartsAvail = register.getQuarter();
        dimesAvail = register.getDime();
        nicksAvail = register.getNickel();
        pennsAvail = register.getPenny();

        regAmount += 20 * twentsAvail;
        regAmount += 10 * tensAvail;
        regAmount += 5 * fivesAvail;
        regAmount += onesAvail;
        regAmount += .25 * quartsAvail;
        regAmount += .1 * dimesAvail;
        regAmount += .05 * nicksAvail;
        regAmount += .01 * pennsAvail;

        while (change >= 20 && twentsAvail > 0) {
            change -= 20;
            twentsAvail -= 1;
            twentsChange += 1;
        }

        while (change >= 10 && tensAvail > 0) {
            change -= 10;
            tensAvail -= 1;
            tensChange += 1;
        }

        while (change >= 5 && fivesAvail > 0) {
            change -= 5;
            fivesAvail -= 1;
            fivesChange += 1;
        }

        while (change >= 1 && onesAvail > 0) {
            change -= 1;
            onesAvail -= 1;
            onesChange += 1;
        }

        while (change >= .25 && quartsAvail > 0) {
            change -= .25;
            quartsAvail -= 1;
            quartsChange += 1;
        }

        while (change >= .1 && dimesAvail > 0) {
            change -= .1;
            dimesAvail -= 1;
            dimesChange += 1;
        }

        while (change >= .05 && nicksAvail > 0) {
            change -= .05;
            nicksAvail -= 1;
            nicksChange += 1;
        }

        while (change >= .01 && pennsAvail > 0) {
            change -= .01;
            pennsAvail -= 1;
            pennsChange += 1;
        }

        try {
            if (change >= .01) {
                System.out.println("Not Enough Change");
                ;
            } else {
                register.setTwentyDollar(twentsAvail - twentsChange);
                register.setTenDollar(tensAvail - tensChange);
                register.setFiveDollar(fivesAvail - fivesChange);
                register.setDollar(onesAvail - onesChange);
                register.setQuarter(quartsAvail - quartsChange);
                register.setDime(dimesAvail - dimesChange);
                register.setNickel(nicksAvail - nicksChange);
                register.setPenny(pennsAvail - pennsChange);
            }
        } catch (Exception NotEnoughChangeException) {
            NotEnoughChangeException.printStackTrace();
        }

        twentsAvail = register.getTwentyDollar();
        tensAvail = register.getTenDollar();
        fivesAvail = register.getFiveDollar();
        onesAvail = register.getDollar();
        quartsAvail = register.getQuarter();
        dimesAvail = register.getDime();
        nicksAvail = register.getNickel();
        pennsAvail = register.getPenny();

        regAmount += 20 * twentsAvail;
        regAmount += 10 * tensAvail;
        regAmount += 5 * fivesAvail;
        regAmount += onesAvail;
        regAmount += .25 * quartsAvail;
        regAmount += .1 * dimesAvail;
        regAmount += .05 * nicksAvail;
        regAmount += .01 * pennsAvail;

        Cash changeCash = new Cash();

        changeCash.setTwentyDollar(twentsChange);
        changeCash.setTenDollar(tensChange);
        changeCash.setFiveDollar(fivesChange);
        changeCash.setDollar(onesChange);
        changeCash.setQuarter(quartsChange);
        changeCash.setDime(dimesChange);
        changeCash.setNickel(nicksChange);
        changeCash.setPenny(pennsChange);

        return changeCash;
    }

    public double getChange() {
        return change;
    }

    public double getRegAmount() {
        return regAmount;
    }
}