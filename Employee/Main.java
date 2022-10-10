package Employee;

public class Main {
    public static void main(String[] args) {

        //Employee e1 = new Employee("Bugra tabir","572727168","tabirbugra@gmail.com");

        //Burası artık abstract olduğu için abstract sınıflarda nesne üretilemez.Sadece yol göstermek için kuıllanılır.
        // Academician a1 = new Academician("Metin kose","5342879498","orevladı@gmail.com","CENG","Dr");

        CivilCervant c1 = new CivilCervant("Mennan","5466544565","amilyav@gmail.com","Cleaner","08:00 - 17:00");

        Lecturer l1 = new Lecturer("Mehmet Unsal","5342569696","munsal@gmail.com","Water Sources","associate professor","111");

        LabAssistant ll1 = new LabAssistant("Aslı çetin","5347542624","asli@gmail.com","Lab","Assistant","09:00 - 18:00");

        Computing cc1 = new Computing("Dilara aslan","5358459684","aslandilara@hotmail.com","Computing","09:00 - 17:00","compute");

        Security s1 = new Security("Hakan Arslan","5429638574","arslanhakan@hotmail.com","Security","07:00-14:00","Id");

        //Burada e2 nesnesini employee den oluşturdum ancak new academician olarak tanımladım.Buna polymorphism ilkesi denir.
        //Burası artık abstract olduğu için abstract sınıflarda nesne üretilemez.Sadece yol göstermek için kuıllanılır.
        // Employee e2 = new Academician("A","5342879498","orevladı@gmail.com","CENG","Dr");

        //Ayrıca aşağıdaki gibi de polymorphism uygulanabilir.Burada yukarıda oluşturulan nesneleri tek arrayde toplayıp polymorphism yapıyoruz.

        Employee[] loginUsers = {c1,l1,ll1,cc1,s1};
        Employee.loginUsers(loginUsers);
    }
}
