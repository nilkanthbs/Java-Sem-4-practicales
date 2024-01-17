// Create a class Person with attributes name and age. Derive a class Employee from Person with additional attributes employeeId and salary. Create objects of both classes and demonstrate how inheritance works in accessing the attributes of the base class.
class Person {
    String Name;
    int age;

    Person(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name = " + Name);
        System.out.println("Age = " + age);
    }
}

class Employee extends Person {
    int EID, Salary;

    Employee(int EID, String Name, int age, int Salary) {
        super(Name, age);
        this.EID = EID;
        this.Salary = Salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID = " + EID);
        System.out.println("Salary = " + Salary);
    }
}

public class practical18 {
    public static void main(String[] args) {
        Employee Nilkanth = new Employee(100, "Nilkanth Savaliya", 21, 50000);
        Nilkanth.displayPerson();
        Nilkanth.displayEmployee();
    }
}