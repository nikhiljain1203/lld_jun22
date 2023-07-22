package Prototype;

public class InteligentStudent extends Student {
    int IQ;

    InteligentStudent() {

    }

    InteligentStudent(InteligentStudent student) {
        super(student);
        this.IQ = student.IQ;
    }

    @Override
    public InteligentStudent clone() {
//        InteligentStudent st = new InteligentStudent();
//        st.setName(this.getName());
//        st.setAge(this.getAge());
//        st.setBatchName(this.getBatchName());
//        st.setAverageBatchPsp(this.getAverageBatchPsp());
//        st.setPsp(this.getPsp());
//        st.IQ = this.IQ;
//        return st;
        return new InteligentStudent(this);
    }
}
