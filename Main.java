package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Room[] rooms = new Room[]{new Room(2,true,false)};
	        Currency currency = new Currency("Viet",12.5);
	        Place place = new Place("Danang","VietNam",currency,"heheeheh");
	        Hotel hotel=new Hotel(rooms,"------ THANG HOA ---------",place);
	        System.out.println(hotel.toString());
	        System.out.println("-------------------------------------------");
	        System.out.println(place.toString());
	    }
	
	}


