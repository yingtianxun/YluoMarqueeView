package com.yluo.yluomarqueeview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	
	YluoMarqueeView yluo_mar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		yluo_mar = (YluoMarqueeView) findViewById(R.id.yluo_mar);
	}
	
	public void start(View view) {
		yluo_mar.startPlay();
	}
	public void stop(View view) {
		yluo_mar.stopPlay();
	}

}
