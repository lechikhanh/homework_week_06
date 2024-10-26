package main;
import java.util.Date;
public class Vacationbt5 {
	private int length;
	private Date date;
	private String place;

	
	@Override
	public String toString() {
		return "Vacation [length=" + length + ", date=" + date + ", place=" + place + "]";
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public Vacationbt5(int length, Date date, String place) {
		super();
		this.length = length;
		this.date = date;
		this.place = place;
	}

	public static void main(String[] args) {
	Vacationbt5 Vacationbt5 = new Vacationbt5(30, new Date(),"Da Nang");
	System.out.println(Vacationbt5);
		// TODO Auto-generated method stub

	}

}
