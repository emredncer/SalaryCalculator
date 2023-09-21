import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Nesneler üretildi.
        Employee employee1 = new Employee("Sıttık ÇOKÇALIŞAN",2000,45,1990);
        Employee employee2 = new Employee("Sunullah AZÇALIŞAN",1200,30,2020);
        Employee employee3 = new Employee("Özgür STAJYAPAN",900,45,2021);
        Employee employee4 = new Employee("Emre EMEKTAROĞLU",2500,45,1989);

        //ürettiğim nesneleri saklamak için Employee tutacak bir Arraylist oluşturdum.
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        //Nesneleri tek tek Arrayliste ekledim.
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        //Geliştirmeye müsait bir yapı üretmek istediğim için bu zahmetlere girdim..
        //Foreach yardımıyla tüm nesneleri gezerken
        //Aynı zamanda toStringEmployee metodunu her biri için çalıştırmış oldum :)

        for (Employee employee : employeeList){
            employee.toStringEmployee(employee);
        }
    }
}
