package inheritance;

public class Engineer extends Employee {

    private int grade;

    public Engineer(double salary, String name, int grade) {
        super(salary, name);
        int maxGrade = 3;
        this.grade = Math.min(grade, maxGrade);
    }

    @Override
    public double getSalary() {
        return salary + (salary * 0.5 * grade);
    }
}
