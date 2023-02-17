package examen.jorgeangeldiazmera.interestCalculator;

public class SummaryCalculator {

	public SummaryCalculatorResult calculate(InterestCalculationResult[] interestResults) {
		int years = interestResults.length;
		var firstPeriodResult = interestResults[0];
		var lastPeriodResult = interestResults[interestResults.length - 1];
		
		float totalContribution = 0f;
		for (int year = 0; year < years; year ++) {
			totalContribution += interestResults[year].getContribution();
		}

		float endingBalance = lastPeriodResult.getEndingBalance();
		float gain = endingBalance - firstPeriodResult.getInitialInvestment() - totalContribution;
		
		return new SummaryCalculatorResult(years, endingBalance, gain, interestResults);
	}
	
}
