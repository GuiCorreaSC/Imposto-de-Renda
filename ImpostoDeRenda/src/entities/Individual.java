package entities;

public class Individual extends TaxPayer {

	private Double healExpend;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healExpend) {
		super(name, anualIncome);
		this.healExpend = healExpend;
	}

	public Double getHealExpend() {
		return healExpend;
	}

	public void setHealExpend(Double healExpend) {
		this.healExpend = healExpend;
	}

	@Override
	public Double tax() {
		Double impost;
		if (anualIncome > 20000) {
			impost = 0.25;
		} else {
			impost = 0.15;
		}
		return (anualIncome * impost) - (healExpend * 0.50);
	}

}
