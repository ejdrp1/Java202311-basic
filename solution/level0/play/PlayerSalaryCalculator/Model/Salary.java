package level0.play.PlayerSalaryCalculator.Model;

public class Salary {

    private String weeklyPay;
    private String annualIncome;

    public Salary() {}

    public Salary(String weeklyPay, String annualIncome) {
        this.weeklyPay = weeklyPay;
        this.annualIncome = annualIncome;
    }

    public String getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(String weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public String getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(String annualIncome) {
        this.annualIncome = annualIncome;
    }
}
