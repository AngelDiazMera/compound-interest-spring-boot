package examen.jorgeangeldiazmera.interestCalculator;

public class CompoundInterestCalculator{

	public CompoundInterestCalculationResult[] calculate(CompoundInterest interest) {
		int interestYears = interest.getYears();
		var interestResults = new CompoundInterestCalculationResult[interestYears];
		
		float currInvestment = interest.getInitialInvestment();
		float currContribution = interest.getAnnualContribution();
		
		CompoundInterestCalculationResult currResult;
		 
		for (int currYear = 0; currYear < interestYears; currYear++) {
			float initialInvestment = currInvestment;
			float contribution = currContribution;
			
			float investmentReturn = (currContribution + currInvestment) * interest.getInterestRate();
			currInvestment += currContribution + investmentReturn;
			currContribution *= (1 + interest.getContributionRate());

			currResult = new CompoundInterestCalculationResult(initialInvestment, investmentReturn, currInvestment, contribution, currYear + 1);
			interestResults[currYear] = currResult;
		}
	      
		return interestResults;
	}

}
