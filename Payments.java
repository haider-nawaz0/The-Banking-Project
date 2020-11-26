public class Payments {
    private int balance;
    public static int moneyReciver_index;
    public Payments(){
        this.balance = 0;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
    public int getBalance() {
        return this.balance;
    }
    public void removeMoney(int money){
        this.balance -= money;
    }

    public void displayBalance(){
        System.out.println("\nAvailable balance: "+ this.getBalance());
    }

    public void deposit_money(){
        System.out.println("\nEnter the amount you want to deposit ?");
        int money = RunMain.scanner.nextInt();
        while(!(balance <= 50000)){
            System.out.println("\nYou can deposit 50000 Max at a time.");
            balance = RunMain.scanner.nextInt();

        }
        this.setBalance(money);
        System.out.println("\nMoney deposited successfully.");
    }
    public void sendMoney(int toSendMoney, Payments[] payment){
        payment[moneyReciver_index].setBalance(toSendMoney);
        System.out.println("\nMoney sent successfully.");
        this.removeMoney(toSendMoney);

    }

    public static boolean verifyReciever(Security[] sec,String toSendCardNo){
        for(int i=0; i<RunMain.counter; i++){
            if(sec[i].getCardNo().equals(toSendCardNo)){
                moneyReciver_index = i;
                return true;
            }
        }
        return false;
    }

    
}
