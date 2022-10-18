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

        printListEmployeeWithData();
        System.out.println();
        //sumExpensesOnSalaryInMonth();
    }

    public static void printListEmployeeWithData() {
        for (Employee employee : name) {
            if (employee != null)
                System.out.println(employee);
        }
    }

    //public static void sumExpensesOnSalaryInMonth (int salary)

}