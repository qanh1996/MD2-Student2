package bt;

public class Student {
    private String name = "John";
    private String classes ="C02";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anh");
        student.setClasses("co3");
        System.out.println(student);
    }
}
