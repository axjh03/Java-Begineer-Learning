class Student{
    String name;
    static String school;
}
public class OOPS{

public static void main(String[] args){
    Student.school = "Arlington High School";
    Student std1= new Student();
    System.out.println(std1.school);
    }
}