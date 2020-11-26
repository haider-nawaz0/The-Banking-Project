import java.util.Random;

public class Security {
    Random random = new Random();

    private final String sample_alphabets = "abcdefghijklmnopqrstuvwxyz";

    private final String sample_numbers = "1023456789";

    private String cardNo;
    private String pin;

    public Security() {
        this.generateCardNo();
        this.generatePin();
    }

    public void generateCardNo() {

        String gen_sample = "";
        int rand_num;
        for (int i = 0; i < 6; i++) {
            rand_num = random.nextInt(25) + 1;
            gen_sample += sample_alphabets.charAt(rand_num);

        }

        this.setCardNo(gen_sample);
    }

    public void generatePin() {
        String pin_sample = "";
        int rand_num_PIN;
        System.out.println();
        for (int i = 0; i < 4; i++) {
            rand_num_PIN = random.nextInt(10);
            pin_sample += sample_numbers.charAt(rand_num_PIN);
        }

        this.setPin(pin_sample);

    }

    public void diplayCodes() {
        System.out.println("\nCredit Card number: " + this.getCardNo());
        System.out.println("Pin: " + this.getPin());
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return this.pin;
    }
}
