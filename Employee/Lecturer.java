package Employee;

public class Lecturer extends Academician {

    private String doorNumber;

    public Lecturer(String nameSurname, String phoneNumber, String mail, String field, String degree, String doorNumber) {
        super(nameSurname, phoneNumber, mail, field, degree);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return this.doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void senateMeeting() {
        System.out.println(this.getNameSurname() + " has joined to senate meeting.");
    }

    public void exam() {
        System.out.println(this.getNameSurname() + " did the exam.");
    }

    @Override
    public void entrance () {
        System.out.println(this.getNameSurname() + " has entered from the A door.");
    }
    @Override
    public void enterTheClass (){

    }
}

