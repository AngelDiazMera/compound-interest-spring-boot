package examen.jorgeangeldiazmera.interestCalculator;

public class SummaryCalculatorResult {
    private int years;
    private float endingBalance;
    private float gain;
    private InterestCalculationResult[] history;

    public SummaryCalculatorResult(int years, float endingBalance, float gain, InterestCalculationResult[] history) {
        this.years = years;
        this.endingBalance = endingBalance;
        this.gain = gain;
        this.history = history;
    }

    public int getYears() {
        return years;
    }

    public float getEndingBalance() {
        return endingBalance;
    }

    public float getGain() {
        return gain;
    }

    public InterestCalculationResult[] getHistory() {
        return history;
    }
}
