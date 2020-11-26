import java.io.IOException;

import java.io.FileWriter;
public class storeUserData {
    public static void store(CreateNewAccount []accounts, Security[] sec, Payments[]payment) throws IOException{
        FileWriter writer = new FileWriter("Bank Account Holders Data");
        writer.write("\n\t\t\t***Bank Accounts Holders Data***");
        for(int i=0; i<RunMain.counter; i++){
            writer.write("\n\n\n\tAccount Holder No. "+(i+1)+" :");
            writer.write("\n\nName : "+ accounts[i].getFullName());
            writer.write("\n\nAge : "+ accounts[i].getAge());
            writer.write("\n\nNIC : "+ accounts[i].getNic());

            writer.write("\n\nAvailable balance in Account : "+ payment[i].getBalance());

            writer.write("\n\nCredit Card Number : "+ sec[i].getCardNo());
            writer.write("\n\nPIN: "+ sec[i].getPin());
        }
        writer.close();
        System.out.println("\n\t***Data stored successfully.***");

    }
    
}
