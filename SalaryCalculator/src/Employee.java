public class Employee {
    //nitelikleri private tanımladım çünkü encapsullation uyguladım.
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;



    //Constructor metod oluşturuldu.
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Setter metotlara ihtiyacım olmadığı için yazmadım.

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    //Metotlara parametre olarak employee verdim.
    //Çünkü birden fazla employee nesnesi ürettim.
    //ve bir loop yardımıyla nesneleri gezerken aynı zamanda metotları da çalıştıracağım.
    public static double tax(Employee employee) {
        if (employee.getSalary() >= 1000) {
            return employee.getSalary() * 0.03;
        } else {
            return 0;
        }
    }

    public static double bonus(Employee employee) {
        if (employee.getWorkHours() > 40) {
            return (employee.getWorkHours() - 40) * 30;
        } else {
            return 0;
        }
    }

    public static double raiseSalary(Employee employee) {
        if ((2021 - employee.getHireYear()) <= 9) {
            return employee.getSalary() * 0.05;
        }
        if ((2021 - employee.getHireYear()) >= 10 && (2021 - employee.getHireYear()) <= 19) {
            return employee.getSalary() * 0.1;
        } else {
            return employee.getSalary() * 0.15;
        }
    }

    //Fonksiyonu toString olarak adlandırmama intellij izin vermedi :)
    //Bu metodu void tanımladım çünkü bir değer döndürmesini beklemiyorum.
    //Yine parametre olarakk employee verdim,
    public void toStringEmployee(Employee employee) {
        System.out.println("Name : " + employee.getName());
        System.out.println("Salary : " + employee.getSalary());
        System.out.println("Work Hours : " + employee.getWorkHours());
        System.out.println("Hire Year : " + employee.getHireYear());
        System.out.println("Tax : " + tax(employee));
        System.out.println("Bonus : " + bonus(employee));
        System.out.println("Seniority Bonus : " + raiseSalary(employee));
        System.out.println("Salary with taxes and bonuses : "+ (employee.getSalary()+bonus(employee)-tax(employee)));
        System.out.println("Total Salary : "+(employee.getSalary()+bonus(employee)+raiseSalary(employee)-tax(employee)));
        System.out.println("------------------");
    }
}
