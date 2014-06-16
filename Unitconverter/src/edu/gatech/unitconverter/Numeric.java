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
}
