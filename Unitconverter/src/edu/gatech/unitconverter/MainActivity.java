package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}
	
	public String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public void handleClick(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.distField);
		String txtString = txt.getText().toString();
		if (!isNumeric(txtString)){
			txtString = "0";
		}
		
		double distance = Double.parseDouble(txtString);
		
		switch(view.getId()) {
		
		case R.id.radioMiles:
			if(checked)
				txt.setText(kmToMiles(distance));
			break;
		case R.id.radioKm:
			if(checked)
				txt.setText(milesToKm(distance));
			break;	
		}
	}
	
}