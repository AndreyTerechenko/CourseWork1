public class Main {

    public static void main(String[] args) {
        Employee[] empolyees = new Employee[10];
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

        int averageSalary = 0;
        int salaryExpenses = 0;
        int maximalSalary = 0;
        int minimalSalary = 1000000;
        for (int i = 0; i < empolyees.length; i++) {
            salaryExpenses = salaryExpenses + empolyees[i].getSalary();
        }
        System.out.println("Общие расходы на зарплату сотрудников = " + salaryExpenses);

        for (int i = 0; i < empolyees.length; i++) {
            if (empolyees[i].getSalary() < minimalSalary) {
                minimalSalary = empolyees[i].getSalary();
            } else if (empolyees[i].getSalary() > maximalSalary) {
                maximalSalary = empolyees[i].getSalary();
            }
        }
        for (int i = 0; i < empolyees.length; i++) {
            if (minimalSalary == empolyees[i].getSalary()) {
                System.out.println("Cотрудник с минмвльной зарплатой = " + empolyees[i]);
            } else if (maximalSalary == empolyees[i].getSalary()) {
                System.out.println("Cотрудник с максимальной зарплатой = " + empolyees[i]);
            }
        }
        averageSalary = salaryExpenses / 2;
        System.out.println("Средня зарплата по компании = " + averageSalary);
        for (int i = 0; i < empolyees.length; i++) {
            ;
            System.out.println(empolyees[i]);
        }
    }
}





