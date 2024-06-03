package Inheritance;
import DataStructures.Phone;

public class Smartphone extends Phone {
    private int charge = 100;
    private double balance;
    public int getCharge() {
        if (charge > 100)
            charge = 100;
        else if (charge < 0)
            charge = 0;
        return charge;
    }
    public void setCharge(int charge) {
        this.charge = charge;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String PhoneCall(int time){
        balance /= time;
        charge = time/100;
        return "Balance: " + balance + "\n" +
                "Charge: " + charge;
    }
}