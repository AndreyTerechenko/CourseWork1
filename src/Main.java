public class Main {
    public static Employee[] empolyees = new Employee[10];

    public static void main(String[] args) {

        empolyees[0] = new Employee("Иванов Иван Иванович", 2, 75000);
        empolyees[1] = new Employee("Петрова Ольга Владимировна", 1, 80000);
        empolyees[2] = new Employee("Сидоров Михаил Олегович", 3, 82000);
        empolyees[3] = new Employee("Васильев Петр Петрович", 2, 63000);
        empolyees[4] = new Employee("Пушкин Алекандр Сергеевич", 3, 98000);
        empolyees[5] = new Employee("Прокопенко Мария Викторовна", 3, 88000);
        empolyees[6] = new Employee("Соколов Корнелий Еремеевич", 2, 74000);
        empolyees[7] = new Employee("Полякова Любовь Платоновна", 1, 76000);
        empolyees[8] = new Employee("Терентьева Кристина Андреевна", 3, 100000);
        empolyees[9] = new Employee("Федосеев Леонтий Львович", 1, 120000);

        printEmployee();
        salaryExpenses();
        averageSalary();
        maximalSalary();
        minimalSalary();
        nameEmployee();

    }

    public static void printEmployee() {
        for (int i = 0; i < empolyees.length; i++) {
            System.out.println(empolyees[i]);
        }
    }

    public static void salaryExpenses() {
        int allExpenses = 0;
        for (int i = 0; i < empolyees.length; i++) {
            allExpenses = allExpenses + empolyees[i].getSalary();
        }
        System.out.println("Общие расходы на зарплату сотрудников = " + allExpenses);
    }

    public static void averageSalary() {
        int average = 0;
        int allExpenses = 0;
        for (int i = 0; i < empolyees.length; i++) {
            allExpenses = allExpenses + empolyees[i].getSalary();
        }
        average = allExpenses / 2;
        System.out.println("Средня зарплата по компании = " + average);
    }

    public static void maximalSalary() {
        int max = 0;
        for (int i = 0; i < empolyees.length; i++) {
            if (max < empolyees[i].getSalary()) {
                max = empolyees[i].getSalary();
            }
        }
        System.out.println("Cотрудник с максимальной зарплатой = " + max);
    }

    public static void minimalSalary() {
        int minimalSalary = 1000000;
        for (int i = 0; i < empolyees.length; i++) {
            if (empolyees[i].getSalary() < minimalSalary) {
                minimalSalary = empolyees[i].getSalary();
            }
        }
        System.out.println("Cотрудник с минмвльной зарплатой = " + minimalSalary);
    }

    public static void nameEmployee() {
        for (int i = 0; i < empolyees.length; i++) {
            System.out.println("Ф.И.О. Сотрудника : " + empolyees[i].getFullName());
        }
    }
}








