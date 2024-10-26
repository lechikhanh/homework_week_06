package main;
public class Room {
	 private int bed;
	    private boolean tv;
	    private boolean telephone;
	    public Room(){}

	    public Room(int bed, boolean tv, boolean telephone) {
	        this.bed = bed;
	        this.tv = tv;
	        this.telephone = telephone;
	    }

	    public int getBed() {
	        return bed;
	    }

	    public void setBed(int bed) {
	        this.bed = bed;
	    }

	    public boolean isTv() {
	        return tv;
	    }

	    public void setTv(boolean tv) {
	        this.tv = tv;
	    }

	    public boolean isTelephone() {
	        return telephone;
	    }

	    public void setTelephone(boolean telephone) {
	        this.telephone = telephone;
	    }

	    @Override
	    public String toString() {
	        return "Room{" + "bed=" + bed + ", tv=" + tv + ", telephone=" + telephone + '}';
	    }
}
