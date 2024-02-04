package ru.mck.cw1;

public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Артем", "Николаевич", "Семейкин", 1, 150000);
        employees[1] = new Employee("Андрей", "Семенович", "Шустов", 2, 100000);
        employees[2] = new Employee("Сергей", "Геннадьевич", "Белокрылов", 3, 120000);
        employees[3] = new Employee("Дмитрий", "Анатольевич", "Копытов", 4, 50000);
        employees[4] = new Employee("Николай", "Констанинович", "Шиманович", 5, 140000);
        employees[5] = new Employee("Евгений", "Сергеевич", "Медведев", 1, 140000);
        employees[6] = new Employee("Владислав", "Александрович", "Михалев", 2, 95000);
        employees[7] = new Employee("Никита", "Сергеевич", "Баранков", 3, 105000);
        employees[8] = new Employee("Евгений", "Викторович", "Табаков", 4, 41000);
        employees[9] = new Employee("Василий", "Васильевич", "Пупкин", 5, 130000);

        System.out.println();
        printEmployees(employees);
        System.out.println();
        calculateAndPrintMonthSalary(employees);
        System.out.println();
        findAndPrintMaxSalary(employees);
        System.out.println();
        findAndPrintMinSalary(employees);
        System.out.println();
        calculateAndPrintAverageMonthSalary(employees);
        System.out.println();
        printEmployeeList(employees);
    }

    public static void printEmployees(Employee[] employees) {
        System.out.println("Полный список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void calculateAndPrintMonthSalary(Employee[] employees) {
        int sum = 0;
        for (Employee emp : employees) {
            sum = sum + emp.getSalary();
        }
        System.out.println("Сумма затрат на заработной платы за месяц = " + sum + " руб.");
    }

    public static void findAndPrintMaxSalary(Employee[] employees) {
        int i;
        int j;
        int salary = employees[0].getSalary();
        Employee employeeWithMaxSalary = employees[0];
        for (i = j = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                employeeWithMaxSalary = employees[i];
                salary = employees[i].getSalary();
                j = i + 1;
            }
        }
        System.out.println("Сотрудник с максимальной заработной платой:\n" +
                "№: " + (employees[j].getId() + 1) +
                ";\t Имя: " + employees[j].getFirstName() +
                ";\t Отчеcтво: " + employees[j].getMiddleName() +
                ";\t Фамилия: " + employees[j].getLastName() +
                ";\t Отдел: " + employees[j].getDepartment() +
                ";\t Заработная плата: " + employees[j].getSalary() + " руб.");

    }

    public static void findAndPrintMinSalary(Employee[] employees) {
        int i;
        int j;
        int salary = employees[0].getSalary();
        Employee employeeWithMinSalary = employees[0];
        for (i = j = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                employeeWithMinSalary = employees[i];
                salary = employees[i].getSalary();
                j = i + 1;
            }
        }

        System.out.println("Сотрудник с минимальной заработной платой:\n" +
                "№: " + (employees[j].getId() + 1) +
                ";\t Имя: " + employees[j].getFirstName() +
                ";\t Отчеcтво: " + employees[j].getMiddleName() +
                ";\t Фамилия: " + employees[j].getLastName() +
                ";\t Отдел: " + employees[j].getDepartment() +
                ";\t Заработная плата: " + employees[j].getSalary() + " руб.");
    }

    public static void calculateAndPrintAverageMonthSalary(Employee[] employees) {
        int sum = 0;
        int sumAverage = 0;
        for (Employee emp : employees) {
            sum = sum + emp.getSalary();
            sumAverage = sum / employees.length;
        }
        System.out.println("Среднее значение заработной платы за месяц = " + sumAverage + " руб.");
    }

    public static void printEmployeeList(Employee[] employees) {
        System.out.println("Ф.И.О. сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() +
                    " " + employee.getMiddleName() +
                    " " + employee.getLastName());
        }
    }
}







