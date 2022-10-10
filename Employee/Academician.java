package Employee;

public abstract class Academician extends Employee {
    private String field;
    private String degree;

    public Academician (String nameSurname,String phoneNumber, String mail,String field,String degree){ //Academician class is a sub class of Employee.
        super (nameSurname,phoneNumber,mail);//And we have to do constructor method for sub classes which comes from super class.
        this.field = field;
        this.degree = degree;
        //We have to write super keyword first,then we can write the variables belong this class.And we must write get,set then.
    }

    public String getField () {
        return this.field;
    }

    public void setField (String field) {
        this.field = field;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree (String degree) {
        this.degree = degree;
    }

    public abstract void enterTheClass ();

    @Override
    public void entrance () {
        System.out.println(this.getNameSurname()+ " has entered from the B door");
    }
}
