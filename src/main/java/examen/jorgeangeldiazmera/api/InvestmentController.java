package examen.jorgeangeldiazmera.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.jorgeangeldiazmera.dto.InvestmentDto;
import examen.jorgeangeldiazmera.interestCalculator.SummaryCalculatorResult;
import examen.jorgeangeldiazmera.service.InvestmentService;

@RequestMapping("api/investment")
@RestController
public class InvestmentController {
	private final InvestmentService investmentService;

	@Autowired
	public InvestmentController(InvestmentService investmentService) {
		this.investmentService = investmentService;
	}
	
	@PostMapping("compound")
	public SummaryCalculatorResult calculateCompoundInterest(@Valid @RequestBody InvestmentDto interest) {
		return this.investmentService.calculateInterest(interest);
	}
	
}
