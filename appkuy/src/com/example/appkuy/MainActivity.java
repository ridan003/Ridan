package com.example.appkuy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {


	private Button btnSignUp;
	private Button btnSignin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	 btnSignin = (Button) findViewById(R.id.btnSignin);
	 btnSignUp = (Button) findViewById(R.id.btnSignUp);
	 
	 btnSignin.setOnClickListener (this);
	 btnSignUp.setOnClickListener (this);
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnSignin:
			
			break;
		case R.id.btnSignUp:
			
		default:
			break;
			
		}
		
	}
}
