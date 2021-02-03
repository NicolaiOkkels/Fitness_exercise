package demo;

public class Instructor extends Employee {


    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours);
    }

    @Override
    public int getSalary() {
        return (getHours() * 199) * 4;
    }
}
