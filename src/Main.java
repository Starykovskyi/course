import inheritance.Employee;
import inheritance.Engineer;
import inheritance.Policeman;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        System.out.println(account1.money);

        account1.deposit(20);

        System.out.println(account1.money);

        BankAccount account2 = account1;
        account2.withdraw(10);

//        System.out.println(account1.money);
//        System.out.println(account2.money);

        Employee employee = new Engineer(1000.0, "Peter", 1);
        Employee employee2 = new Engineer(1000.0, "Mark", 2);
        Employee employee3 = new Engineer(1000.0, "John", 3);

        Employee policeman = new Policeman(1000.0, "BadBoy", 10);

        System.out.println(employee.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());

        System.out.println(policeman.getSalary());
    }
}
