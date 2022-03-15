public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Turgay", 2000, 45, 1985);
        System.out.println("Zamsız Maaşı:");
        System.out.println("====================");
        emp1.printInfo();

        System.out.println("Zamlı Maaşı:");
        System.out.println("====================");

        System.out.println("Zam miktarı:" + emp1.raiseSalary());
        emp1.printInfo();

    }
}

