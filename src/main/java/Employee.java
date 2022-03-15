public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0.0;
        if (this.salary > 1000) tax = this.salary * 0.03;
        return tax;
    }

    double bonus() {
        double bonus = 0;

        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }

        return bonus;
    }

    double raiseSalary() {
        double raisePercent = 0;
        int year = 2021 - hireYear;

        if (year < 10)
            raisePercent = 0.05;
        else if (year >= 10 && year < 20) raisePercent = 0.1;
        else raisePercent = 0.15;

        this.salary += this.salary * raisePercent;
        return this.salary * raisePercent;

    }


    void printInfo() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :  " + (this.salary + this.bonus() - this.tax()));
    }
}
