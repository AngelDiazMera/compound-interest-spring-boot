package examen.jorgeangeldiazmera.service;

import org.springframework.stereotype.Service;

import examen.jorgeangeldiazmera.dto.InvestmentDto;
import examen.jorgeangeldiazmera.interestCalculator.CompoundInterest;
import examen.jorgeangeldiazmera.interestCalculator.SummaryCalculator;
import examen.jorgeangeldiazmera.interestCalculator.SummaryCalculatorResult;

@Service
public class InvestmentService {
	
	public SummaryCalculatorResult calculateInterest(InvestmentDto interest) {
		var compoundInterest = new CompoundInterest();
		compoundInterest.setAnnualContribution(interest.getAnnualContribution());
		compoundInterest.setContributionRate(interest.getContributionRate());
		compoundInterest.setInitialInvestment(interest.getInitialInvestment());
		compoundInterest.setYears(interest.getYears());
		compoundInterest.setInterestRate(interest.getInterestRate());
		
		var history = compoundInterest.calculate();
		var summaryCalculator = new SummaryCalculator();
		
		return summaryCalculator.calculate(history);
	}
	
}
