class Student {
    String name;
    int roll_no;
    double percentage;
}

public class DemoArrayOfObjects {
    public static void main(String a[]) {
        Student stu1 = new Student();
        stu1.name = "Tom";
        stu1.roll_no = 01;
        stu1.percentage = 60.5;

        Student stu2 = new Student();
        stu2.name = "Drek";
        stu2.roll_no = 02;
        stu2.percentage = 80.5;

        Student stu3 = new Student();
        stu3.name = "Harry";
        stu3.roll_no = 03;
        stu3.percentage = 90;

        Student students[] = new Student[3];
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;

        for (Student s : students) {
            System.out.println(s.name + ":" + s.percentage);
        }

    }

}