package Prototype;



public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student julyBatch = new Student();
        julyBatch.setBatchName("july22");
        julyBatch.setAverageBatchPsp(90);
        registry.register("july22", julyBatch);

        Student augBatch = new Student();
        augBatch.setBatchName("aug22");
        augBatch.setAverageBatchPsp(98);
        registry.register("aug22", augBatch);

        InteligentStudent septBatch = new InteligentStudent();
        septBatch.setBatchName("sept22");
        //augBatch.setAverageBatchPsp(98);
        septBatch.IQ = 100;
        registry.register("sept22", septBatch);

    }


    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student saketh = registry.get("july22").clone();
        saketh.setName("saketh");
        //saketh.setPsp(90);
        saketh.setAge(30);

        Student suyash = registry.get("july22").clone();
        suyash.setName("suyash");
        //suyash.setPsp(90);
        suyash.setAge(30);

        Student swraj = registry.get("aug22").clone();
        swraj.setName("swraj");
        //swraj.setPsp(90);
        swraj.setAge(30);

        Student sneha = registry.get("sept22").clone();
        swraj.setName("sneha");
        //swraj.setPsp(90);
        swraj.setAge(30);

        System.out.println("Debug");
    }
}
