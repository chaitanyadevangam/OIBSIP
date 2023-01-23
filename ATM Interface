//**InfoByte Internship Task-3(ATM Interface), done by Devangam Ravula Cheruvu Sai Chaitanya**
import java.util.*;

class Atm {
    int balance = 100000;
    int realpass = 2233;
    int count = 0;
    String transaction_history = "";

    public void pin() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your userid: ");
        String name = sc.nextLine();
        System.out.print("Enter your pin: ");

        int pass = sc.nextInt();

        if (pass == realpass) {
            System.out.println(
                    "----------------------------------------Log in Successful------------------------------------------");
            menu();
        } else {
            System.out.println("Invalid Password, Please try again");

        }
    }

    public void menu() {
        System.out.println("1.Transaction history");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Transfer");
        System.out.println("5.Quit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Option :");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                transaction_history();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposit();
                break;
            case 4:
                Transfer();
                break;
            case 5:
                System.out.println(
                        "----------------------------------------Logged Out Successfully!--------------------------------------");
                break;
            default:
                System.out.println("enter a valid option!");
                menu();

        }
    }

    public void transaction_history() {
        if (count == 0) {
            System.out.println("-----------------No transactions done!----------------");
            menu();
        } else {
            System.out.print("Transaction History:");
            System.out.println("\n" + transaction_history + "\n");
            menu();
        }
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money > balance) {
            System.out.println("Insufficient Balance");

            menu();

        } else {
            balance -= money;
            System.out.println("Withdrawal Successful, your balance is: " + balance);
            count += 1;
            String transact = count + ". " + money + " " + "/- has been withdrawn, balance is " + balance;
            transaction_history = transaction_history.concat(transact + "\n");

            menu();
        }

    }

    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        balance += money;
        System.out.println("Deposit Successful, your balance is: " + balance);
        count += 1;
        String transact = count + ". " + money + " " + "/- has been deposited, balance is " + balance;
        transaction_history = transaction_history.concat(transact + "\n");

        menu();
    }

    public void Transfer() {
        System.out.print("Enter amount to transfer: ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money > balance) {
            System.out.println("Insufficient Balance");
            menu();

        } else {
            balance -= money;
            System.out.println("Transfer Successful, your balance is: " + balance);
            count += 1;
            String transact = count + ". " + money + " " + "/- has been transfered, balance is " + balance;
            transaction_history = transaction_history.concat(transact + "\n");
            menu();
        }

    }

}

public class Atm_interface {
    public static void main(String[] args) {

        Atm obj = new Atm();
        obj.pin();

    }
}
//**InfoByte Internship Task-3(ATM Interface), done by Devangam Ravula Cheruvu Sai Chaitanya**
