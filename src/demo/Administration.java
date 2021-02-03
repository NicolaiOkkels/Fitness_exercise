package demo;

public class Administration extends Employee{
    private int vacation = 5;

    public Administration(String name, String cpr) {
        super(name, cpr);
    }

    public int getVacation() {
        return vacation;
    }

    @Override
    public int getSalary() {
        return 33000;
    }

    @Override
    public int getHours() {
        return 37;
    }
}
