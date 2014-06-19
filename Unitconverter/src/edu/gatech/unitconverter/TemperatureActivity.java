package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class TemperatureActivity extends Activity {

	private Integer checkedId = 0;
	private EditText text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);

		// Set the default text value
        text = (EditText) findViewById(R.id.temperatureField);
        text.setText("0.0");
		
		// Print the text of the currently selected radio button
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.groupTemperature);
		checkedId = radioGroup.getCheckedRadioButtonId();
	}

	public void handleClick(View view){
		boolean checked = ((RadioButton) view).isChecked();
		
		double temp = Numeric.numeric(text.getText().toString(), 0.0);
		
		Integer current_checkedId = view.getId();
		
		switch(current_checkedId) {
		
		case R.id.radioFahrenheit:
			if (checked && !current_checkedId.equals(checkedId))
				text.setText(Numeric.celsiusToFahrenheit(temp));
				checkedId = current_checkedId;
			break;
			
		case R.id.radioCelsius:
			if (checked && !current_checkedId.equals(checkedId))
				text.setText(Numeric.fahrenheitToCelsius(temp));
				checkedId = current_checkedId;
			break;
		}
	}
	
}
