import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;
import entities.Address;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String deptName = sc.nextLine();

        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();

        System.out.print("Email: ");
        String deptEmail = sc.nextLine();

        System.out.print("Telefone: ");
        String deptPhone = sc.nextLine();

        Address deptAddress = new Address(deptEmail, deptPhone);
        Department dept = new Department(deptName, payDay, deptAddress);

        System.out.print("Quantos funcionários tem o departamento? ");
        int numEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            String empName = sc.nextLine();

            System.out.print("Salário: ");
            double empSalary = sc.nextDouble();
            sc.nextLine();

            Employee employee = new Employee(empName, empSalary);
            dept.addEmployee(employee);
        }

        showReport(dept);
        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("");
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println("Departamento " + dept.getName() + " = R$ " + dept.payroll());
        System.out.println("Pagamento realizado no dia " + dept.getPayDay());
        System.out.println("Funcionários:");

        for (Employee employee : dept.getEmployees()) {
            System.out.println(employee.getName());
        }
        System.out.println("Para dúvidas, favor entrar em contato: " + dept.getEmail());
    }
}
