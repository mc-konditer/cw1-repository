package ru.mck.cw1;

public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Артем", "Николаевич", "Семейкин", 1, 100000);
        employees[1] = new Employee("Андрей", "Семенович", "Шустов", 2, 100000);
        employees[2] = new Employee("Сергей", "Геннадьевич", "Белокрылов", 3, 120000);
        employees[3] = new Employee("Дмитрий", "Анатольевич", "Копытов", 4, 150000);
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
        int salary = employees[0].getSalary();
        Employee employeeWithMaxSalary = employees[0];
        for (i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                employeeWithMaxSalary = employees[i];
                salary = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной заработной платой:\n" +
                "№: " + (employeeWithMaxSalary.getId() + 1) +
                ";\t Имя: " + employeeWithMaxSalary.getFirstName() +
                ";\t Отчеcтво: " + employeeWithMaxSalary.getMiddleName() +
                ";\t Фамилия: " + employeeWithMaxSalary.getLastName() +
                ";\t Отдел: " + employeeWithMaxSalary.getDepartment() +
                ";\t Заработная плата: " + employeeWithMaxSalary.getSalary() + " руб.");

    }

    public static void findAndPrintMinSalary(Employee[] employees) {
        int i;
        int salary = employees[0].getSalary();
        Employee employeeWithMinSalary = employees[0];
        for (i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                employeeWithMinSalary = employees[i];
                salary = employees[i].getSalary();

            }
        }
        System.out.println("Сотрудник с минимальной заработной платой:\n" +
                "№: " + (employeeWithMinSalary.getId() + 1) +
                ";\t Имя: " + employeeWithMinSalary.getFirstName() +
                ";\t Отчеcтво: " + employeeWithMinSalary.getMiddleName() +
                ";\t Фамилия: " + employeeWithMinSalary.getLastName() +
                ";\t Отдел: " + employeeWithMinSalary.getDepartment() +
                ";\t Заработная плата: " + employeeWithMinSalary.getSalary() + " руб.");


    }

    public static void calculateAndPrintAverageMonthSalary(Employee[] employees) {
        int sum = 0;
        int sumAverage = 0;
        for (Employee emp : employees) {
            sum = sum + emp.getSalary();
        }
        sumAverage = sum / employees.length;
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







