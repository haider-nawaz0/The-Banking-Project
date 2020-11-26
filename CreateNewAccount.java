public class CreateNewAccount {
    private String fullName, nic;
    private int age;
    

    public CreateNewAccount(){
        System.out.println("\nEnter the following details to make your account.");
        System.out.println("\nEnter your First Name ?");
        fullName = RunMain.scanner.next();
        this.setFullName(fullName);

        System.out.println("\nEnter your age ?");
        age = RunMain.scanner.nextInt();
        while(!(age >= 18)){
            System.out.println("\nYou must be atleast 18 years old to make your account.");
            age = RunMain.scanner.nextInt();
        }
        this.setAge(age);

        System.out.println("\nEnter your NIC ?");
        nic = RunMain.scanner.next();
        while(!(nic.length() == 13)){
            System.out.println("\nYou NIC must be 13 digits long.");
            nic = RunMain.scanner.next();
        }
        this.setNic(nic);
        System.out.println("Your account has been craeted successfully.");
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return this.fullName;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
    public String getNic() {
        return this.nic;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    

    public void display_profile(){
        System.out.println("\n\t***Here is your Profile.***");
        System.out.println("\nName: "+ this.getFullName());
        System.out.println("Age : "+ this.getAge());
        System.out.println("NIC : "+ this.getNic());
    }

   
}
