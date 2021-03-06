package com.tetrahedronTech.ICBusTracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_home);
		
		//find a specific button
		Button b = (Button) findViewById(R.id.favoritButton);
		//a html string
		String styledText = "<div><font color='#fcfff0'>Your favorite stop</font></div><div><font color='#fcfff0'>1051</font></div><div><font color='#fcfff0'><small>1051</small></font></div>";
		//convert html to text so that it can be displayed on button
		b.setText(Html.fromHtml(styledText));
		
		//Button t = (Button) findViewById(R.id.weatherButton);
		//coreAPI api = new coreAPI();
		//String temp = api.busPrediction(1051);
		//t.setText(temp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	public void onClickWeather(View view){
		Intent i = new Intent(this,WeatherActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
	}
	
	public void onClickFavorit(View view){
		Intent i = new Intent(this, FavoriteActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
	}
	
	public void onClickStops(View view){
		Intent i = new Intent(this, StopsActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
	}
	
	public void onClickRoutes(View view){
		Intent i = new Intent(this, RoutesActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left);
	}

}
