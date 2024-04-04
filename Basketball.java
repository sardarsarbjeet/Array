package com.example.basketball;

	public class Basketball {
	    // Fields
	    private String companyName;
	    private String itemcolor;
	    private double itemprice;

	    
	    public Basketball() {
	        // Default values
	        this.companyName = "";
	        this.itemcolor = "";
	        this.itemprice = 0.0;
	    }

	    // Three parameters
	    public Basketball(String companyName, String itemcolor, double itemprice) {
	        this.companyName = companyName;
	        this.itemcolor = itemcolor;
	        this.itemprice = itemprice;
	    }

	    // For companyName
	    public String getCompanyName() {
	        return companyName;
	    }

	    
	    public void setCompanyName(String companyName) {
	        this.companyName = companyName;
	    }

	    //For itemcolor
	    public String getitemColor() {
	        return itemcolor;
	    }

	   
	    public void setitemColor(String color) {
	        this.itemcolor = color;
	    }

	    // For itemprice
	    public double getitemPrice() {
	        return itemprice;
	    }

	   
	    public void setitemPrice(double itemprice) {
	        this.itemprice = itemprice;
	    }

	    public static void main(String[] args) {
	       
	        Basketball basketball1 = new Basketball();
	        basketball1.setCompanyName("SportimeMax");
	        basketball1.setitemColor("orange");
	        basketball1.setitemPrice(72.99);

	        System.out.println("Company Name: " + basketball1.getCompanyName());
	        System.out.println("Color of Item: " + basketball1.getitemColor());
	        System.out.println("Price of Item: $" + basketball1.getitemPrice());

	        
	        Basketball basketball2 = new Basketball("ChampionSport", "red", 32.99);

	        System.out.println("\nCompany Name: " + basketball2.getCompanyName());
	        System.out.println("Color of Item: " + basketball2.getitemColor());
	        System.out.println("Price of Item: $" + basketball2.getitemPrice());
	    
	        
	        
	        System.out.println("\nProgram Done By HARMANPREET SINGH");
	    }
	}

