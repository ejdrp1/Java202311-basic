package level0.play.playerSalaryCalculator.model;

public class Salary {

    private String weeklyPay; // 주급
    private String annualIncome; // 연봉

    public Salary() {
    }

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
