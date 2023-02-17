/**
 * 
 */
package examen.jorgeangeldiazmera.interestCalculator;

/**
 * @author angel
 *
 */
public abstract class AbstractInterest {
    private float initialInvestment;
    private int years;
    private float interestRate;
    private float contributionRate;
    private float annualContribution;

    public float getInitialInvestment() {
        return initialInvestment;
    }

    public void setInitialInvestment(float initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getContributionRate() {
        return contributionRate;
    }

    public void setContributionRate(float contributionRate) {
        this.contributionRate = contributionRate;
    }

    public float getAnnualContribution() {
        return annualContribution;
    }

    public void setAnnualContribution(float annualContribution) {
        this.annualContribution = annualContribution;
    }

    public abstract InterestCalculationResult[] calculate();
}

