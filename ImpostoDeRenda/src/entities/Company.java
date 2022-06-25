package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getHnumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setnumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double impost;
		if (numberOfEmployees >= 10) {
			impost = 0.14;
		} else {
			impost = 0.16;
		}
		return anualIncome * impost;
	}

}
