package DataStructures;

public class Phone {
    private int kod;
    private int number;
    public Phone(){}
    public String PhoneCall(){
        return "Ring";
    }
    public int getKod() {
        return kod;
    }
    public void setKod(int kod) {
        this.kod = kod;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Phone(int kod, int number) {
        this.kod = kod;
        this.number = number;
    }
    public String toString(){
        return "+7("+ getKod()+")" + getNumber();
    }
}