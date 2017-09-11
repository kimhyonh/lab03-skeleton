package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

	// string for logcat documentation
	private final static String TAG = "Lab-ActivityOne";

	int onCreateCounter = 0;
	int onStartCounter = 0;
	int onResumeCounter = 0;
	int onPauseCounter = 0;
	int onStopCounter = 0;
	int onRestartCounter = 0;
	int onDestroyCounter = 0;

	String create, start, resume, pause, stop, restart, destroy;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);
		//Log cat print out
		Log.i(TAG, "onCreate called");
		onCreateCounter++;
//		TextView create = (TextView) findViewById(R.id.create);
//		create.setText(R.string.onCreate + " " + onCreateCounter);

		create = getResources().getString(R.string.onCreate);
		start = getResources().getString(R.string.onStart);
		resume = getResources().getString(R.string.onResume);
		pause = getResources().getString(R.string.onPause);
		stop = getResources().getString(R.string.onStop);
		restart = getResources().getString(R.string.onRestart);
		destroy = getResources().getString(R.string.onDestroy);

		TextView tvCreate = (TextView) findViewById(R.id.create);
		tvCreate.setText(create + " " + onCreateCounter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_one, menu);
		return true;
	}

	// lifecycle callback overrides

	@Override
	public void onStart(){
		super.onStart();
		//Log cat print out
		Log.i(TAG, "onStart called");
		onStartCounter++;
	}

	@Override
	public void onResume(){
		super.onResume();
		Log.i(TAG, "onResume called");
		onResumeCounter++;
	}

	@Override
	public void onPause(){
		super.onPause();
		Log.i(TAG, "onPause called");
		onPauseCounter++;
	}

	@Override
	public void onStop(){
		super.onStop();
		Log.i(TAG, "onStop called");
		onStopCounter++;
	}

	@Override
	public void onRestart(){
		super.onRestart();
		Log.i(TAG, "onRestart called");
		onRestartCounter++;
	}

	@Override
	public void onDestroy(){
		super.onDestroy();
		Log.i(TAG, "onDestroy called");
		onDestroyCounter++;
	}

	@Override
	public void onSaveInstanceState(Bundle savedInstanceState){
		//TODO:  save state information with a collection of key-value pairs & save all  count variables
	}


	public void launchActivityTwo(View view) {
		startActivity(new Intent(this, ActivityTwo.class));
	}


}
