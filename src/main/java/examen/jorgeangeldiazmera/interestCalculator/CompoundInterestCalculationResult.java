package examen.jorgeangeldiazmera.interestCalculator;

public class CompoundInterestCalculationResult implements InterestCalculationResult {
    private final float initialInvestment;
    private final float investmentReturn;
    private final float endingBalance;
    private final float contribution;
    private final int year;

    public CompoundInterestCalculationResult(float initialInvestment, float investmentReturn, float endingBalance, float contribution, int year) {
        this.initialInvestment = initialInvestment;
        this.investmentReturn = investmentReturn;
        this.endingBalance = endingBalance;
        this.contribution = contribution;
        this.year = year;
    }

    public float getInitialInvestment() {
        return initialInvestment;
    }

    public float getInvestmentReturn() {
        return investmentReturn;
    }

    public float getEndingBalance() {
        return endingBalance;
    }

    public float getContribution() {
        return contribution;
    }
    
    public int getYear() {
    	return year;
    }
}
