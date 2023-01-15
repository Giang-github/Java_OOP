
import java.util.Scanner;public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choose;
        BankCard bankCard = new BankCard();
        System.out.println("Enter Information ");
        System.out.println("Enter Number Bank Card : ");
        bankCard.setNumberAccount(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Name Bank Card : ");
        bankCard.setName(sc.nextLine());
        System.out.println("Enter Money : ");
        bankCard.setTotal(sc.nextDouble());
        sc.nextLine();
        do
        {
            System.out.println("________________Main Menu______________");
            System.out.println("1. Recharge");
            System.out.println("2. Withdrawal ");
            System.out.println("3. Show information ");
            System.out.println("4. Exit");
            System.out.println("________________________________________");
            System.out.println("Your choose : ");
            choose = sc.nextInt();
            switch(choose)
            {
                case 1:
                {
                   bankCard.Recharge();
                    break;
                }
                case 2:
                {
                    bankCard.Withdrawal();
                    break;
                }
                case 3:
                {
                    bankCard.ShowBankCard();
                    break;
                }
                case 4:
                {
                    System.out.println("Exit !");
                    System.exit(0);
                }
                default:
                    System.out.println("Invalidate choose !!! ");
            }
        }
        while(choose!=0);
    }
}