package edu.gatech.unitconverter;

public class Numeric {

	public static double numeric(String str, double val)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);
	    return d;
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return val;
	  }  
	}

	public static String poundsToKg(double lbs) {
		double kg = lbs * 2.2;
		return String.valueOf(kg);
	}
	
	public static String kgToPounds(double kg){
		double pounds = kg / 2.2;
		return String.valueOf(pounds);
	}
		
	public static String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}
	
	public static String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}

	public static String fahrenheitToCelsius(double f) {
		double c = (f - 32) * 5 / 9;
		return String.valueOf(c);
	}
	
	public static String celsiusToFahrenheit(double c) {
		double f = (c * 9/5) + 32;
		return String.valueOf(f);
	}
	
}	