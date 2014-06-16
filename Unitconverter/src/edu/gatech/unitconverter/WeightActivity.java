package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class WeightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
	}
	

	public String poundsToKg(double lbs) {
		double kg = lbs * 2.2;
		return String.valueOf(kg);
	}
	
	public String kgToPounds(double kg){
		double pounds = kg / 2.2;
		return String.valueOf(pounds);
	}
	
	public void handleClick(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText text = (EditText) findViewById(R.id.weightField);
		
		double weight = Numeric.numeric(text.getText().toString(), 0.0);
		
		switch(view.getId()) {
		case R.id.radioKg:
			if (checked)
				text.setText(poundsToKg(weight));
			break;
		case R.id.radioLbs:
			if (checked)
				text.setText(kgToPounds(weight));
			break;
		}
	}
}
