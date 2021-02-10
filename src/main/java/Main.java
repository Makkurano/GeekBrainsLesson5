public class Main {

    public static void main(String[] args) {

        int minAge = 25; // Минимальный возраст
        int minSalary = 250; // Минимальная зарплата

        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivanov@mailbox.com",
                "89991002233", 32, 320);
        emplArray[1] = new Employee("Petrov Petr", "Jn Engineer", "ppetrov@mailbox.com",
                "89991002514", 23, 150);
        emplArray[2] = new Employee("Lukina Vera", "Medic", "vlukina@mailbox.com",
                "89991006255", 27, 350);
        emplArray[3] = new Employee("Terkin Vasiliy", "Solder", "vterkin@mailbox.com",
                "89991002166", 33, 250);
        emplArray[4] = new Employee("Dance Lada", "Dancer", "ldance@mailbox.com",
                "89991005333", 22, 200);

        System.out.println("Сотрудники старше " + minAge + ": ");
        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() >= minAge) {
                emplArray[i].printEmployee();
            }
        }

        System.out.println("Сотрудники c ЗП выше " + minSalary + ": ");
        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getSalary() >= minSalary) {
                emplArray[i].printEmployee();
            }
        }
    }
}
