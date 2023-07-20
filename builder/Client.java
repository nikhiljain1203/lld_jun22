package builder;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.name = "Nikhil";
        helper.age = 131;
        helper.universityName = "NIT Jaipur";

        Student st = new Student(helper);

        System.out.println("Debug");
    }
}
