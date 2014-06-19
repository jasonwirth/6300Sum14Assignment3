package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class WeightActivity extends Activity {
	
	private Integer checkedId;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
		
		// Get the current radio button to test when we toggle
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.groupWeight);
		checkedId = radioGroup.getCheckedRadioButtonId();
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
		
		Integer current_checkedId = view.getId();
		switch(current_checkedId) {
		case R.id.radioKg:
			if (checked && !checkedId.equals(current_checkedId))
				text.setText(poundsToKg(weight));
				checkedId = current_checkedId;
			break;
		case R.id.radioLbs:
			if (checked && !checkedId.equals(current_checkedId))
				text.setText(kgToPounds(weight));
				checkedId = current_checkedId;
			break;
		}
	}
}
