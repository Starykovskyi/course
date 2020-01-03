public class BankAccount {
    String number;
    String ownerName;
    double money;

    public double withdraw(double money) {//снять деньги
        return this.money-=money;
    }

    public void deposit(double money) {//положить деньги на счет
        this.money += money;
    }
}
