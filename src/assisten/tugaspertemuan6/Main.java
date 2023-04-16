package assisten.tugaspertemuan6;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Manager manager1 = new Manager("Farhan", 19, 'P', "Manzager", 500, 2000, 100);
        Manager manager2 = new Manager("Aji", 21, 'P', "Manager", 4500, 1500, 800);
        Engineer engineer1 = new Engineer("Ryangga", 22, 'L', "Engineer", 3000, 1000, 5);
        Engineer engineer2 = new Engineer("Aryak", 28, 'P', "Engineer", 3500, 1500, 7);
        Employee employee1 = new Employee("Rio", 30, 'L', "Staff", 2000);
        Employee employee2 = new Employee("Yahya", 23, 'L', "Staff", 1800);

        company.addEmployee(manager1);
        company.addEmployee(manager2);
        company.addEmployee(engineer1);
        company.addEmployee(engineer2);
        company.addEmployee(employee1);
        company.addEmployee(employee2);

        double totalGaji = company.getTotalGaji();

        System.out.println(company);
        System.out.println("Total Gaji Seluruh Karyawan : " + totalGaji);
    }
}

