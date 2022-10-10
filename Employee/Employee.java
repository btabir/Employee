package Employee;

public abstract class Employee {

    private String nameSurname;
    private String phoneNumber;
    private String mail;

    public Employee(String nameSurname, String phoneNumber, String mail) {
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void entrance () {
        System.out.println(this.nameSurname+ " has entered the dining hall.");
    }

    public void exit () {
        System.out.println(this.nameSurname + " has left the dining hall.");
    }

    public void diningHall () {
        System.out.println(this.nameSurname + " entered the dining hall.");
    }

    public static void loginUsers (Employee [] loginUsers){
        for (Employee e :loginUsers){
            e.entrance();
        }
    }
}
