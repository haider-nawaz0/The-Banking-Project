import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);
    public static int counter = 0;

    public static void main(String[] args) {
       
        boolean isQuit = false;
        boolean QuitSubMenu = false;
        CreateNewAccount[] accounts = new CreateNewAccount[10];
        Security[] sec = new Security[10];
        Payments[] payment = new Payments[10];
        //SignIn[] sign = new SignIn[10];

        System.out.println("\n\t\t*****Wellcome to the Bank*****");

        while (isQuit == false) {
            System.out.println("\n1. Create a new Acount.");
            System.out.println("2. Sign in.");
            System.out.println("3. Quit.");

            int logIN_choice = scanner.nextInt();

            while (!(logIN_choice == 1 || logIN_choice == 2 || logIN_choice == 3)) {
                System.out.println("Choose between 1,2 and 3.");
                logIN_choice = scanner.nextInt();
            }
            if (logIN_choice == 3) {
                isQuit = true;
                System.out.println("\nProgram Terminated.");
            } else if (logIN_choice == 2) {
                QuitSubMenu = false;
                System.out.println("\nEnter you Credit Card Number?");
                String userCard = scanner.next();
                System.out.println("\nEnter you PIN?");
                String userPin = scanner.next();
                while(!(SignIn.verifyCardNo(sec, userCard) && SignIn.verifyPin(sec, userPin))){
                    System.out.println("\n\t***Incorrect Credit Card Number or Pin.***");
                    System.out.println("\nEnter you Credit Card Number?");
                    userCard = scanner.next();
                    System.out.println("\nEnter you PIN?");
                    userPin = scanner.next();
                }
                System.out.println("\n\t***Hi, "+accounts[SignIn.signIN_index].getFullName()+"!, Wellcome to your Account.***");

                while (QuitSubMenu == false) {
                    System.out.println("\n1. Deposit money to your account.");
                    System.out.println("2. Your Profile.");
                    System.out.println("3. Go to the main Menu.");
                    System.out.println("4. Send Money to Credit Card Number.");
                    int sub_menu_choice = scanner.nextInt();
                    if (sub_menu_choice == 1) {
                        payment[SignIn.signIN_index].deposit_money();
                    } else if (sub_menu_choice == 2) {
                        accounts[SignIn.signIN_index].display_profile();
                        sec[SignIn.signIN_index].diplayCodes();
                        payment[SignIn.signIN_index].displayBalance();

                    } else if (sub_menu_choice == 3) {
                        QuitSubMenu = true;
                    }else if(sub_menu_choice == 4){
                        System.out.println("\nEnter the Reciver's Credit Card?");
                        String reciver_card = scanner.next();
                        while(!(Payments.verifyReciever(sec, reciver_card))){
                            System.out.println("\n\t***Credit Card Not Found !, enter again***");
                            System.out.println("\nEnter the Reciver's Credit Card?");
                             reciver_card = scanner.next();
                        }
                        System.out.println("\nEnter the money to send?");
                        int reciever_money = scanner.nextInt();
                        while(!(reciever_money <= 25000 && payment[SignIn.signIN_index].getBalance() >= reciever_money)){
                            System.out.println("\n\t***You can send Max 25000 or You don't have enough balance in you account. Enter again***");
                            reciever_money = scanner.nextInt();
                        }
                        payment[SignIn.signIN_index].sendMoney(reciever_money, payment);
                    }
                }
            } else {
                System.out.println("\nCreate a new Account.");
                // while(true){
                accounts[counter] = new CreateNewAccount();
                System.out.println("\n\t***Here is your Credit Card Number and Pin.***");
                sec[counter] = new Security();
                payment[counter] = new Payments();
                sec[counter].diplayCodes();
                counter++;
                // }
            }
        }

    }

}