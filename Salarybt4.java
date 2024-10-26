package main;

public class Salarybt4 {
	private double sum;
	private int month;
	private double tax;

	@Override
	public String toString() {
		return "Salary [sum=" + sum + ", month=" + month + ", tax=" + tax + "]";
	}


	public double getSum() {
		return sum;
	}


	public void setSum(double sum) {
		this.sum = sum;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	public Salarybt4 (double sum, int month, double tax) {
		super();
		this.sum = sum;
		this.month = month;
		this.tax = tax;
	}

	public static void main(String[] args) {
	Salarybt4 Salarybt4 = new Salarybt4(99,9,0.099);
	System.out.println(Salarybt4);
	Salarybt4.setMonth(12);
	Salarybt4.setSum(999);
	Salarybt4.setTax(0.09);
	System.out.println(Salarybt4);
		// TODO Auto-generated method stub

	}
}
