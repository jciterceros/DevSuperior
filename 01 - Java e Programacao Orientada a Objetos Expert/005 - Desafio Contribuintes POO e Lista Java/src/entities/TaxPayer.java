package entities;

public class TaxPayer {
    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
            double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double monthlySalary = salaryIncome / 12;
        if (monthlySalary < 3000) {
            return 0.0;
        } else if (monthlySalary < 5000) {
            return (monthlySalary * 0.1) * 12;
        } else {
            return (monthlySalary * 0.2) * 12;
        }
    }

    public double servicesTax() {
        return (servicesIncome > 0) ? servicesIncome * 0.15 : 0.0;
    }

    public double capitalTax() {
        return (capitalIncome > 0) ? capitalIncome * 0.2 : 0.0;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double deductibleExpenses = (healthSpending > 0 ? healthSpending : 0)
                + (educationSpending > 0 ? educationSpending : 0);
        double maxDeductible = grossTax() * 0.3;
        return Math.min(deductibleExpenses, maxDeductible);
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

}
