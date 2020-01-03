package inheritance;

public class Policeman extends Employee {

    private final int experience;

    public Policeman(double salary, String name, int experience) {
        super(salary, name);
        this.experience = experience;
    }

    @Override
    public double getSalary() {
        return salary + (salary * 0.1 * experience);
    }
}
