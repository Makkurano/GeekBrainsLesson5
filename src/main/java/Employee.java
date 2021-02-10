public class Employee {

    private String fi;
    private String role;
    private String mail;
    private String phone;
    private int age;
    private int salary;

    public Employee(String fi, String role, String mail, String phone, int age, int salary) {
            this.fi = fi;
            this.role = role;
            this.mail = mail;
            this.phone = phone;
            this.age = age;
            this.salary = salary;
        }
    public void printEmployee() {
        System.out.println("ФИО: " + fi + " Должность: " + role + " Почта: " + mail + " Телефон: " + phone +
                " Возраст: " + age + " Зарплата: " + salary);
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public String getPhone() {
        return phone;
    }
}
