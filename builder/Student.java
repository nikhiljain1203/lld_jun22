package builder;

public class Student {
    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;

    public Student(Helper helper) {
        // validation
        if(helper.age > 100) {
            throw new IllegalArgumentException("Age can't be greater than 100");
        }

        this.name = helper.name;
        this.age = helper.age;
        this.universityName = helper.universityName;
        this.cgpa = helper.cgpa;
    }
}
