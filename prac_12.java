//THIS PROGRAM PREPARED BY PRACHI GAJERA 21CE030
// 12) Create an Association class that encapsulates two objects of different types. Similar
// to Exercise above, create a Transition class that does the same of Association class
// with three objects.
class Bank {
    private String name;
    Bank(String name) {

        this.name = name;
    }
    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;
    Employee(String name) {
        this.name = name;
    }
    public String getEmployeeName() {
        return this.name;
    }
}

class prac_12 {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Employee emp = new Employee("PRACHI GAJERA");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
    }
}