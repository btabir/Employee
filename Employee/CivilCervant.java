package Employee;

public class CivilCervant extends Employee {

    private String department;
    private String shift;

    public CivilCervant (String nameSurname,String phoneNumber,String mail,String department,String shift){
        super(nameSurname,phoneNumber,mail);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment () {
        return this.department;
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    public String getShift () {
        return this.shift;
    }

    public void setShift (String shift) {
        this.shift = shift;
    }

    public void work () {
        System.out.println(this.getNameSurname() + " has started to work.");
    }
}
