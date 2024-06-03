package Classes_OOP;

public class Date {
    private int day;
    private String weekDay;
    private int month;
    private int year;
    public Date( int day, int month, int year, String weekDay){
        this.day = day;
        this.weekDay = weekDay;
        this.month = month;
        this.year = year;
    }
    public int getDay() {return day;}
    public int getYear() {return year;}
    public int getMonth() {return month;}
    public String getWeekDay() {return weekDay;}
    public void ShowInfo(){
        System.out.println("Дата: "
                + weekDay + " "
                + day + " "
                + month + " "
                + year + " года.");
    }
    public void Show(){
        if (day < 10)
            System.out.println(0);
        System.out.println(day +" ");
        if (month < 10)
            System.out.println(0);
        System.out.println(day + "." + month + "." + year + "." + weekDay);
    }
}