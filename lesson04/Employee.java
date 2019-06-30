package Lesson04;

public class Employee {
    private String firstName;
    private String midName;
    private String lastName;
    private String position;
    private int phone;
    private int wages;
    private int age;
    private int id;
    private static int idCounter = 0;

    Employee(String _firstName, String _midName, String _lastName, String _possition, int _phone, int _wages, int _age) {
        this.firstName = _firstName;
        this.midName = _midName;
        this.lastName = _lastName;
        this.position = _possition;
        this.phone = _phone;
        this.wages = _wages;
        this.age = _age;
        this.id = this.idCounter++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMidName() {
        return this.midName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPosition() {
        return this.position;
    }

    public int getPhone() {
        return this.phone;
    }

    public int getWages() {
        return this.wages;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    public void setWages(int _wages) {
        this.wages = _wages;
    }

}


