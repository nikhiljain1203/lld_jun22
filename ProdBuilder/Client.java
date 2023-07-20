package ProdBuilder;


public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                        .setAge(31)
                        .setName("Nikhil")
                        .build();

        //Student st = builder.build();

        System.out.println("Debug");
    }
}
