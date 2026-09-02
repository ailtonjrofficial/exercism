public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        boolean days = daysSkipped >= 5; 
        double val = days ? 0.85 : 1.0;
        return val;
    }

    public int bonusMultiplier(int productsSold) {
        boolean qtd = productsSold >= 20;
        int bon = qtd ? 13 : 10;
        return bon;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double base = 1000.00;
        double total = (base * salaryMultiplier (daysSkipped)) + bonusForProductsSold (productsSold);
        boolean verf = total >= 2000.00;
        double calc = verf ? 2000.00 : total;
        return calc;
    } 
}
