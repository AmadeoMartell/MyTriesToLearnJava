package UniversityHW3;

import java.text.DecimalFormat;

/*
ATM Management: Write an ATM class that has methods
to check the balance, withdraw, and deposit funds into an account.
 */
public class task15 {
    public static void main(String[] args) {
        ATM deposit = new ATM();
        deposit.CheckBalance();
        deposit.fund(2324.99f);
        deposit.withdraw(9999f);
        deposit.withdraw(999.99f);
    }
}
class ATM{
    DecimalFormat dF = new DecimalFormat("#.##");
    private float balance = 0;

    public void fund(float money){
        balance += money;
        System.out.printf("Счет пополнен на %s$ !%n", dF.format(money));
    }

    public void withdraw(float money) {
        if (money > balance){
            System.out.println("Недостаточно средств для вывода!");
        }
        else {
            balance -= money;
            System.out.println("Средства выведены! Текущий баланс: " + dF.format(balance) + "$");
        }
    }

    public void CheckBalance() {
        System.out.println("Текущий баланс: " + dF.format(balance) + "$");
    }
}
