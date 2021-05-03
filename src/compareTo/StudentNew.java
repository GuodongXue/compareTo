package compareTo;

import java.util.Comparator;

public class StudentNew {
    int age;
    String name;
    double height;

    public StudentNew(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
}

class  CompareTool implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        //比较两个人的年龄
        StudentNew a = ((StudentNew) o1);
        StudentNew b = ((StudentNew) o2);
        return a.age-b.age;
    }
}