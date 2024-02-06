package entities;

import java.util.ArrayList;

public class Department {
    private String name;
    private int payDay;
    private ArrayList<Employee> employees;
    private Address adress;

    public Department(String name, int payDay, Address adress) {
        this.name = name;
        this.payDay = payDay;
        this.employees = new ArrayList<>();
        this.adress = adress;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public int getPayDay() {
        return payDay;
    }

    public String getEmail() {
        return adress.getEmail();
    }
}
