package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
		
		// Print the text of the currently selected radio button
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.groupTemperature);
		int checkedId = radioGroup.getCheckedRadioButtonId();
		RadioButton currentButton = (RadioButton) findViewById(checkedId);
		System.out.println("Current checkedId: " + checkedId);
	}

	public String fahrenheitToCelsius(double f) {
		double c = (f - 32) * 5 / 9;
		return String.valueOf(c);
	}
	
	public String celsiusToFahrenheit(double c) {
		double f = (c * 9/5) + 32;
		return String.valueOf(f);
	}
	
	public void handleClick(View view){
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt = (EditText) findViewById(R.id.temperatureField);
		
		double temp = Numeric.numeric(txt.getText().toString(), 0.0);
		
		switch(view.getId()) {
		
		case R.id.radioFahrenheit:
			if (checked)
				txt.setText(celsiusToFahrenheit(temp));
			break;
			
		case R.id.radioCelsius:
			if (checked)
				txt.setText(fahrenheitToCelsius(temp));
			break;
		}
	}
	
}
