package edu.gatech.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DistanceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
		System.out.println("Starting DistanceActivity Tadaima");
		
	}
	
    public void handleClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        
        EditText txt = (EditText) findViewById(R.id.distanceField);
        
        double distance = Numeric.numeric(txt.getText().toString(), 0.0);
        
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
		
	public String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}
	
	public String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}
	

}
