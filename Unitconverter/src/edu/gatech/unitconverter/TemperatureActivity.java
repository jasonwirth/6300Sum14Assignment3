package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
	}

	public String fahrenheitToCelsius(double f) {
		double c = (f - 32) * 5/9.;
		return String.valueOf(c);
	}
	
	public String celsiusToFahrenheit(double c) {
		double f = c * 5./9 + 32;
		return String.valueOf(f);
	}
	
	public void handleClick(View view){
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.temperatureField);
	
		
		double temp = Double.parseDouble(txt.getText().toString());
		
	}
	
}
