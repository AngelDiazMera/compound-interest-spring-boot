package examen.jorgeangeldiazmera.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvestmentDto {
	
	@NotNull
	@Min(0)
    private final float initialInvestment;

	@NotNull
	@Min(0)
	@Max(100)
    private final int years;

	@NotNull
	@Min(0)
    private final float interestRate;

	@NotNull
	@Min(0)
    private final float contributionRate;
	
	@Min(0)
    private final float annualContribution;

    public InvestmentDto (
		@JsonProperty("initialInvestment") float initialInvestment, 
		@JsonProperty("years") int years, 
		@JsonProperty("interestRate") float interestRate, 
		@JsonProperty("contributionRate") float contributionRate, 
		@JsonProperty("annualContribution") float annualContribution
    ) {
        this.initialInvestment = initialInvestment;
        this.years = years;
        this.interestRate = interestRate;
        this.contributionRate = contributionRate;
        this.annualContribution = annualContribution;
    }

    public float getInitialInvestment() {
        return initialInvestment;
    }

    public int getYears() {
        return years;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public float getContributionRate() {
        return contributionRate;
    }

    public float getAnnualContribution() {
        return annualContribution;
    }
}