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

	private Integer checkedId = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
		
		// Print the text of the currently selected radio button
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.groupTemperature);
		checkedId = radioGroup.getCheckedRadioButtonId();
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
		
		Integer current_checkedId = view.getId();
		System.out.println("checkedId:" + checkedId + " currentId:" + current_checkedId );
		
		switch(current_checkedId) {
		
		case R.id.radioFahrenheit:
			if (checked && !current_checkedId.equals(checkedId))
				txt.setText(celsiusToFahrenheit(temp));
				checkedId = current_checkedId;
			break;
			
		case R.id.radioCelsius:
			if (checked && !current_checkedId.equals(checkedId))
				txt.setText(fahrenheitToCelsius(temp));
				checkedId = current_checkedId;
			break;
		}
	}
	
}
