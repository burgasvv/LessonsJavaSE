package Classes_OOP;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Date> dates;
    private String[] weekdays = {"Понедельник", "Вторник", "Среда",
            "Четверг", "Пятница", "Суббота", "Воскресение"};
    private int couuntDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Calendar(int year, int dow){
        dates = new ArrayList<Date>();
        dow -= 1;
        int countMonth = 12;
        boolean leap = (year % 4 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leap)couuntDays[1] += 1;
        for (int i = 0; i < countMonth; i++){
            for (int j = 0; j < couuntDays[i]; j++){
                dates.add(new Date(j+1, i+1, year, weekdays[dow]));
                dow += 1;
                dow %= 7;
            }
        }
    }
}