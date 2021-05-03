package compareTo;

public class Student implements Comparable{
    int age;
    String name;
    double height;

    public Student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Object o) {
        //按照年龄比较
        Student other = (Student)o;
        //return this.age- ((Student) o).age;
        //按照身高比较
        //return ((Double)this.height).compareTo((Double)other.height);
        //按照姓名
        //return this.name.compareTo(other.name);
        if(this.age-((Student) o).age!=0){
            return this.age-other.age;
        }else{
            return ((Double)this.height).compareTo((Double)other.height);
        }
        //这就叫内部比较器

        //外部比较器

    }
}
