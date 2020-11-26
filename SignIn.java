public class SignIn {
    public static int  signIN_index;

    
    public static boolean verifyCardNo(Security [] sec, String inputCard){

        for(int i=0; i<RunMain.counter; i++){
            if(sec[i].getCardNo().equals(inputCard)){
                signIN_index = i;
                return true;
            }
        }
        return false;
    }
    
    public static boolean verifyPin(Security [] sec, String inputPin){

        for(int i=0; i<RunMain.counter; i++){
            if(sec[i].getPin().equals(inputPin)){

                return true;
            }
        }
        return false;
    }
    
}
