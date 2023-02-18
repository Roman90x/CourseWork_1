public class Main {

    private static final Employee[] name = new Employee[10];

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Курсовая работа.");
        System.out.println();

        name[0] = new Employee("Кренц Ирина Матвеевна", 1, 30000);
        name[1] = new Employee("Наумова Елена Дмитриевна", 1, 50000);
        name[2] = new Employee("Громов Егор Вадимович", 2, 60000);
        name[3] = new Employee("Титов Денис Игоревич", 2, 40000);
        name[4] = new Employee("Белов Антон Сергеевич", 3, 80000);
        name[5] = new Employee("Отто Марк Андреевич", 3, 90000);

        //Список всех сотрудников со всеми имеющимися по ним данными.
        printListEmployeeWithData();
        System.out.println();
        //Посчитать сумму затрат на зарплаты в месяц.
        sumExpensesOnSalaryInMonth();
        System.out.println();
        //Найти сотрудника с минимальной зарплатой.
        searchEmployeeWithMinSalary();
        System.out.println();
        //Найти сотрудника с максимальной зарплатой.
        searchEmployeeWithMaxSalary();
        System.out.println();
        //Подсчитать среднее значение зарплат.
        middleSalaryInMonth();
        System.out.println();
        //Получить Ф. И. О. всех сотрудников.
        printListEmployee();
        System.out.println();

        //ПОВЫШЕННАЯ СЛОЖНОСТЬ!
        //Проиндексировать зарплату
        indexSalary();
        System.out.println();
        //Сотрудник с минимальной зарплатой в отделе
        searchEmployeeWithMinSalaryInDepartment(1);
        System.out.println();
        //Сотрудник с максимальной зарплатой в отделе
        searchEmployeeWithMaxSalaryInDepartment(1);
        System.out.println();
        //Сумма затрат на зарплату по отделу
        sumExpensesOnSalaryInMonthInDepartment(1);
        System.out.println();
        //Средняя зарплата по отделу
        middleSalaryInMonthInDepartment(1);
        System.out.println();
        //Проиндексировать зарплату всех сотрудников отдела на процент
        indexSalaryInDepartment(1,10);
        System.out.println();
        //Напечатать всех сотрудников отдела (все данные, кроме отдела)
        printListEmployeeWithDataInDepartment(2);
        System.out.println();
        //Cотрудники с зарплатой меньше числа
        searchEmployeeWithSalaryLess(70000);
        System.out.println();
        //Cотрудники с зарплатой больше или равно числа
        searchEmployeeWithSalaryMore(70000);


    }

    public static void printListEmployeeWithData() {
        System.out.println("Полный список всех сотрудников:");
        for (Employee employee : name) {
            if (employee != null)
                System.out.println(employee);
        }
    }

    public static void sumExpensesOnSalaryInMonth() {
        int sum = 0;
        for (Employee employee : name) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + sum +" рублей.");
    }

    public static void searchEmployeeWithMinSalary() {
        int minSalary = 10000000;
        String employees = null;
        for (Employee employee : name) {
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employees = employee.getName();
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + employees + ".");
    }

    public static void searchEmployeeWithMaxSalary() {
        int maxSalary = 0;
        String employees = null;
        for (Employee employee : name) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary= employee.getSalary();
                    employees = employee.getName();
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + employees + ".");
    }

    public static void middleSalaryInMonth() {
        int sum = 0;
        int employees = 0;
        for (Employee employee : name) {
            if (employee != null) {
                sum += employee.getSalary();
                employees++;
            }
        }
        System.out.println("Средняя зарплата в месяц составляет " + sum/ employees + " рублей.");
    }

    public static void printListEmployee() {
        System.out.println("Ф.И.О. сотрудников:");
        String employees = null;
        for (Employee employee : name) {
                if (employee != null) {
                    employees = employee.getName();
                    System.out.println(employees);
            }
        }
    }


    //ПОВЫШЕННАЯ СЛОЖНОСТЬ!

    public static void indexSalary() {
        System.out.println("Проиндексированная зарплата сотрудников:");
        int index = 5;
        int indexSalary = 0;
        for (Employee employee : name) {
            if (employee != null) {
                indexSalary = employee.getSalary() + employee.getSalary()*index/100;
                System.out.println(employee.getName()+ " " + indexSalary + " рублей.");
            }
        }
    }
    public static void searchEmployeeWithMinSalaryInDepartment(int department) {
        int minSalary = 10000000;
        String employees = null;
        for (Employee employee : name) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    employees = employee.getName();
                }
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой по " + department + " отделу - " + employees + ".");
    }

    public static void searchEmployeeWithMaxSalaryInDepartment(int department) {
        int maxSalary = 0;
        String employees = null;
        for (Employee employee : name) {
            if (employee != null && employee.getDepartment() == department) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary= employee.getSalary();
                    employees = employee.getName();
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой по " + department + " отделу - " + employees + ".");
    }
    public static void sumExpensesOnSalaryInMonthInDepartment(int department) {
        int sum = 0;
        for (Employee employee : name) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц по " + department + " отделу составляет " + sum + " рублей.");
    }
    public static void middleSalaryInMonthInDepartment(int department) {
        int sum = 0;
        int employees = 0;
        for (Employee employee : name) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
                employees++;
            }
        }
        System.out.println("Средняя зарплата в месяц по " + department + " отделу составляет " + sum/ employees + " рублей.");
    }
    public static void indexSalaryInDepartment(int department, int index) {
        System.out.println("Проиндексированная зарплата сотрудников в " + department + " отделе:");
        int indexSalary = 0;
        for (Employee employee : name) {
            if (employee != null && employee.getDepartment() == department) {
                indexSalary = employee.getSalary() + employee.getSalary()*index/100;
                System.out.println(employee.getName()+ " - " + indexSalary + " рублей.");
            }
        }
    }

    public static void printListEmployeeWithDataInDepartment(int department) {
        System.out.println("Полный список сотрудников " + department + " отдела:");
        for (Employee employee : name) {
            if (employee != null && employee.getDepartment() == department)
                System.out.println("id=" + employee.getId() +" "
                        + employee.getName() + " Размер З/П - "
                        + employee.getSalary() + " рублей.");
        }
    }
    public static void searchEmployeeWithSalaryLess(int sum) {
        System.out.println("Сотрудники с зарплатой меньше " + sum + " рублей:");
        for (Employee employee : name) {
            if (employee != null) {
                if (employee.getSalary() < sum) {
                    System.out.println("id=" + employee.getId() +" "
                            + employee.getName() + " Размер З/П - "
                            + employee.getSalary() + " рублей.");
                }
            }
        }
    }
    public static void searchEmployeeWithSalaryMore(int sum) {
        System.out.println("Сотрудники с зарплатой больше " + sum + " рублей:");
        for (Employee employee : name) {
            if (employee != null) {
                if (employee.getSalary() >= sum) {
                    System.out.println("id=" + employee.getId() +" "
                            + employee.getName() + " Размер З/П - "
                            + employee.getSalary() + " рублей.");
                }
            }
        }
    }

}