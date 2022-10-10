package Employee;

public class Computing extends CivilCervant {

    private String duty;

    public Computing(String nameSurname, String phoneNumber, String mail, String department, String shift, String duty) {
        super(nameSurname, phoneNumber, mail, department, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty (String duty){
        this.duty = duty;
    }

    public void setNetwork (){
        System.out.println(this.getNameSurname()+" has set the network.");
    }
}
