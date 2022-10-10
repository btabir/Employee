package Employee;

public class Security extends CivilCervant {

    private String document;

    public Security (String nameSurname,String phoneNumber,String mail,String department,String shift,String document){
        super(nameSurname,phoneNumber,mail,department,shift);
        this.document = document;
    }

    public String getDocument () {
        return this.document;
    }

    public void setDocument (String document){
        this.document = document;
    }

    public void watch () {
        System.out.println(this.getNameSurname()+" has got the watch.");
    }
}
