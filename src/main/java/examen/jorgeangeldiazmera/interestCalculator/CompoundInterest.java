package examen.jorgeangeldiazmera.interestCalculator;

public class CompoundInterest extends AbstractInterest {

	@Override
	public CompoundInterestCalculationResult[] calculate() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
		return calculator.calculate(this);
	}
}
