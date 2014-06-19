package edu.gatech.unitconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button distanceButton = (Button)findViewById(R.id.distActBtn);
	
		distanceButton.setOnClickListener(new OnClickListener () {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), DistanceActivity.class);
				startActivity(intent);
			}
		}); 
		
		Button weightButton = (Button)findViewById(R.id.weightActBtn);
	
		weightButton.setOnClickListener(new OnClickListener () {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), WeightActivity.class);
				startActivity(intent);
			}
		}); 
		
		Button temperatureButton = (Button)findViewById(R.id.tempActBtn);
	
		temperatureButton.setOnClickListener(new OnClickListener () {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), TemperatureActivity.class);
				startActivity(intent);
			}
		}); 
	}

	
}