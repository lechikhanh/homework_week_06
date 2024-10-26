package main;
public class Place {
	 private String cityName;
	    private String countryName;
	    private Currency currency;
	    private String cityHallTel;
	    public Place(){}

	    public Place(String cityName, String countryName, Currency currency, String cityHallTel) {
	        this.cityName = cityName;
	        this.countryName = countryName;
	        this.currency = currency;
	        this.cityHallTel = cityHallTel;
	    }

	    public String getCityName() {
	        return cityName;
	    }

	    public void setCityName(String cityName) {
	        this.cityName = cityName;
	    }

	    public String getCountryName() {
	        return countryName;
	    }

	    public void setCountryName(String countryName) {
	        this.countryName = countryName;
	    }

	    public Currency getCurrency() {
	        return currency;
	    }

	    public void setCurrency(Currency currency) {
	        this.currency = currency;
	    }

	    public String getCityHallTel() {
	        return cityHallTel;
	    }

	    public void setCityHallTel(String cityHallTel) {
	        this.cityHallTel = cityHallTel;
	    }

	    @Override
	    public String toString() {
	        return "Place{" + "   cityName='" + cityName + '\'' + ",\n\t\t countryName='" + countryName + '\'' + ",\n\t\t currency=" + currency + ",\n\t\t cityHallTel='" + cityHallTel + '\'' + "   }";
	    }
	}

