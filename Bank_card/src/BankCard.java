import java.util.Scanner;
import java.text.NumberFormat;
public class BankCard {
    private long numberAccount;
    private String name;
    private double total;
    public BankCard() {
    }

    public BankCard(long numberAccount, String name, double total) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.total = total;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    Scanner sc = new Scanner(System.in);
    public void Recharge() {
        double money;
        do {
            System.out.print("Enter amount to recharge:  ");
            money = sc.nextDouble();
        }while(money < 0);
        if (money > 0) {
            total = money + total;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str = currencyEN.format(money);
            System.out.println("The amount you have just deposited into your account is : " + str);
        } else {
            System.out.println("The amount Invalid ! ");
        }
    }
    void ShowBankCard() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str = currencyEN.format(total);
        System.out.println("Information BankCard : ");
        System.out.printf("%-10s %-20s %-20s\n", "Number Account |", "Name Bank Card | ", "Total Money|");
        System.out.printf("%-12d %-20s %-20s \n", numberAccount, name, str);
    }
    public void Withdrawal() {
        double moneyGet;
        System.out.print("Enter amount to withdrawal : ");
        moneyGet = sc.nextDouble();
        if (moneyGet <= total) {
            total = total - moneyGet;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str = currencyEN.format(moneyGet);
            System.out.println("The amount you have just withdrawal " + str);
        } else {
            System.out.println("The amount Invalid !");
        }
    }
}


