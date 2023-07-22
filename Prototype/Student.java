package Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    double averageBatchPsp;
    String batchName;

    Student() {

    }

    Student(Student student) {
        this.batchName = student.batchName;
        this.averageBatchPsp = student.averageBatchPsp;
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

//    public void setPsp(double psp) {
//        this.psp = psp;
//    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student clone() {
//        Student st = new Student();
//        st.name = this.name;
//        st.age = this.age;
//        st.batchName = this.batchName;
//        st.averageBatchPsp = this.averageBatchPsp;
//        st.psp = this.psp;
//        return st;
        return new Student(this);
    }
}
