package DesignPatterns.PrototypeAndRegistry.Example1;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent() {
        super();
    }
    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
