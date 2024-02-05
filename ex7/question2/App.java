public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);

        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        headSales.addSubordinate(new Employee("Wiroj", "Sales", 150000));
        headSales.addSubordinate(new Employee("Weeranan", "Sales", 100000));

        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        headMarketing.addSubordinate(new Employee("Oak", "Marketing", 200000));
        headMarketing.addSubordinate(new Employee("Aem", "Marketing", 250000));

        ceo.addSubordinate(headSales);
        ceo.addSubordinate(headMarketing);

        printAllEmployee(ceo);
    }

    public static void printAllEmployee(Employee employee) {
        System.out.println(employee);
        for (Employee subordinate : employee.getSubordinates()) {
            printAllEmployee(subordinate);
        }
    }
}
