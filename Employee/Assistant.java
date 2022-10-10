package Employee;

public abstract class Assistant extends Academician{

    private String officeHour;

    public Assistant (String nameSurname,String phoneNumber,String mail,String field,String degree,String officeHour){
        super(nameSurname,phoneNumber,mail,field,degree);
        this.officeHour = officeHour;
    }

    public String getOfficeHour () {
        return this.officeHour;
    }

    public void setOfficeHour (String officeHour) {
        this.officeHour = officeHour;
    }

    public void quiz () {
        System.out.println(this.getNameSurname()+ " did the quiz.");
    }
}
