import java.util.Scanner;

class BankAccount{
    static Scanner sc = new Scanner(System.in);

    public static void Process() {
        double bal = 0;
        System.out.println("your balance: " + bal);
        System.out.println("Add the amount to the account.");
        double Deposit = sc.nextDouble();
        bal += Deposit;
        System.out.println("Your balance: " + bal);

        //Withdraw process
        System.out.println("Enter the amount you want to withdraw");
        double Withdraw = sc.nextDouble();
        bal -= Withdraw;

        try {
            if(Withdraw<=Deposit) {
                System.out.println("Your balance: " + bal);
            }
            else {
                throw new InsufficientFundsException(bal - Withdraw);
            }
        }
        catch (InsufficientFundsException e) {
            System.out.println("not enough balance");
        }
    }
}
