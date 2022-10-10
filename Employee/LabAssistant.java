package Employee;

public class LabAssistant extends Assistant {

    public LabAssistant (String nameSurname,String phoneNumber,String mail,String field,String degree,String officeHour){
        super(nameSurname, phoneNumber, mail, field, degree, officeHour);
    }

    public void enterLab () {
        System.out.println(this.getNameSurname()+" has entered the lab classes.");
    }

    public void enterTheClass () {
    }
}
