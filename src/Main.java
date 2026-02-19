//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Inimai", 1000);

        account1.showBalance();
        System.out.println("-----------");

        account1.deposit(500);
        account1.showBalance();
        System.out.println("-----------");

        account1.withdraw(300);
        account1.showBalance();
        System.out.println("-----------");

        account1.withdraw(2000);
        account1.showBalance();
    }
}
