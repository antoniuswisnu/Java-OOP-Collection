package assisten.tugaspertemuan6;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public double getTotalGaji() {
        double totalGaji = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                totalGaji += manager.getGaji() + manager.getTunjanganPosisi() + manager.getTunjanganKinerja();
            } else if (employee instanceof Engineer) {
                Engineer engineer = (Engineer) employee;
                totalGaji += engineer.getGaji() + engineer.getTunjanganInsinyur() + (engineer.getJumlahProjek() * 1000);
            } else {
                totalGaji += employee.getGaji();
            }
        }
        return totalGaji;
    }

    public String toString(){
        return  employees + "" + '\n' + '\n';
    }

}
