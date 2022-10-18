package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Petrov Petr", "Teamlead", "petrov75@mail.ru", "892717717", 39000, 44);
        employeeArray[2] = new Employee("Morozova Katya", "QA-Engineer", "katya24@mail.ru", "892656565", 31000, 24);
        employeeArray[3] = new Employee("Sidorov Alexsander", "Java Developer", "alexsidr@mail.ru", "892185185", 38000, 45);
        employeeArray[4] = new Employee("Yankina Kristina", "QA-Engineer", "yankina.kris@mail.ru", "892685128", 32000, 28);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
