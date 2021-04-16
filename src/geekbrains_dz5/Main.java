package geekbrains_dz5;

public class geekbrains_dz5 {


    public static void main(String[] args) {
        Employee[] person = new Employee[5];
        person[0] = new Employee("Наталья О.", "Секретарь", "111hfhf.rt", "555",50000,35);
        person[1] = new Employee("Владимир Д.", "Начальник", "222@hfhf.rt", "333",70000,41);
        person[2] = new Employee("Роман Г.", "Зам.Начальника", "333@hfhf.rt", "111",50000,40);
        person[3] = new Employee("Юлия О.", "Инженер", "444@hfhf.rt", "777",30000,23);
        person[4] = new Employee("Виктория М.", "Бухгалтер", "555@hfhf.rt", "999",70000,45);
        for (Employee employee : person)
            if (employee.getAge()>40)
                System.out.println(employee);
    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age);
    }
}
