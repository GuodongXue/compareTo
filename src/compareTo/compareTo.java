package compareTo;

public class compareTo {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        double c = 9.4;
        double d = 2.2;
        System.out.println(a.compareTo(b));
        System.out.println(((Double)c).compareTo((Double)d));

        Student st = new Student(18, "lili", 168.5);
        Student st1 = new Student(18, "alili", 171.5);
        System.out.println(st.compareTo(st1));

        CompareTool ct = new CompareTool();
        int num = ct.compare(a, b);
        System.out.println(num);
    }
}
