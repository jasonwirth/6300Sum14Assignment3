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
	private EditText text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);

		// Set the default text value
        text = (EditText) findViewById(R.id.weightField);
        text.setText("0.0");
		
		// Get the current radio button to test when we toggle
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.groupWeight);
		checkedId = radioGroup.getCheckedRadioButtonId();
	}
	
	public void handleClick(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		double weight = Numeric.numeric(text.getText().toString(), 0.0);
		
		Integer current_checkedId = view.getId();
		switch(current_checkedId) {
		case R.id.radioKg:
			if (checked && !checkedId.equals(current_checkedId))
				text.setText(Numeric.poundsToKg(weight));
				checkedId = current_checkedId;
			break;
		case R.id.radioLbs:
			if (checked && !checkedId.equals(current_checkedId))
				text.setText(Numeric.kgToPounds(weight));
				checkedId = current_checkedId;
			break;
		}
	}
}
