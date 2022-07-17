public class Main {


    public static void typeAllStaff(Employee[] employees){
        for (Employee employee: employees
             ) {
            System.out.println(employee);

        }
    }

    public static void countMinSalary(Employee[] employees){
        if (employees.length>0) {
            Employee emp = employees[0];
            for (Employee employee : employees
            ) {
                if (emp.getSalaryStaff() > employee.getSalaryStaff()) ;
                emp = employee;
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalaryStaff()+" " + emp.getStaff()+" " + emp.getId());
        }else
            System.out.println("Массив пустой");
        }

    public static void countMaxSalary(Employee[] employees){
        if (employees.length>0){
            Employee emp = employees[0];
            for (Employee employee:employees
                 ) {
                if(emp.getSalaryStaff() < employee.getSalaryStaff());
                emp = employee;
            }
            System.out.println("Сотрудник с максимальной зарплатой: "+emp.getSalaryStaff()+" "+emp.getStaff()+" "+emp.getId());
        }else
            System.out.println("Массив пустой");
    }

    public static int countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();}
            System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        return sum;
        }

        public static void averageSalary(Employee[] employees){
          int sum = countStaffSalary(employees);
          double average = sum / employees.length;
         System.out.println("Средняя зарплата: " + average);
        }

        public static void countAllStaff (Employee[]employees){
            for (Employee employee : employees) {
                System.out.println("Сотрудник компании: " + employee.getStaff());
            }
        }

        public static void main (String[] args){
            Employee[] employee = new Employee[10];
            employee[0] = new Employee("Alekseev Aleksey Alekseevich", 50000, 1);
            employee[1] = new Employee("Borisov Boris Borisovich", 55000, 2);
            employee[2] = new Employee("Victorov Victor Victorovich", 60000, 3);
            employee[3] = new Employee("Gudkov Gavriil Gerasimovich", 65000, 4);
            employee[4] = new Employee("Daniliv Daniil Dmitrievich", 70000, 5);
            employee[5] = new Employee("Efimov Evgeniy Evginievich", 75000, 1);
            employee[6] = new Employee("Ivanov Ivan Ivanovich", 80000, 2);
            employee[7] = new Employee("Smirnov Semen Semenovich", 85000, 3);
            employee[8] = new Employee("Kozlov Maksim Victorovich", 100000, 4);
            employee[9] = new Employee("Zaycev Petr Vadimovich", 120000, 5);


            typeAllStaff(employee);
            countAllStaff(employee);
            countStaffSalary(employee);
            countMinSalary(employee);
            countMaxSalary(employee);
            averageSalary(employee);
        }
    }
