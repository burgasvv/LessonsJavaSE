package ArrayList;

import java.util.*;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("John", 15),
                new Student("Sam", 25),
                new Student("Will", 20),
                new Student("Dan", 20),
                new Student("Joe", 10)));
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int c = 0;
                while (o1.getName().charAt(c) == o2.getName().charAt(c) &&
                        c < o1.getName().length() && c < o2.getName().length()-1)c++;
                return o1.getName().charAt(c) - o2.getName().charAt(c);
            }
        });
        System.out.println(studentList);
        System.out.println(studentList.stream().max(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge().compareTo(o1.getAge());
            }
        }));
    }
}