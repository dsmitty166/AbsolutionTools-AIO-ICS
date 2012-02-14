package com.flappjaxxx.absotools;

import java.io.IOException;

import com.flappjaxxx.absotools.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AbsolutionTweakActivity extends Activity {
    
	 private static String logtag = "AbsolutionTools";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.tweak);
	         
	     Button buttonSleepGov = (Button)findViewById(R.id.buttonSleepGov);        
	     buttonSleepGov.setOnClickListener(sleepgovListener); // Register the onClick listener with the implementation above
	       
	     Button buttonSleepMin = (Button)findViewById(R.id.buttonSleepMin);        
	     buttonSleepMin.setOnClickListener(sleepminListener); // Register the onClick listener with the implementation above
	    
	     Button buttonSleepMax = (Button)findViewById(R.id.buttonSleepMax);        
	     buttonSleepMax.setOnClickListener(sleepmaxListener);
	     
	     Button buttonWakeGov = (Button)findViewById(R.id.buttonWakeGov);        
	     buttonWakeGov.setOnClickListener(wakegovListener);
	     
	     Button buttonWakeMin = (Button)findViewById(R.id.buttonWakeMin);        
	     buttonWakeMin.setOnClickListener(wakeminListener);
	     
	     Button buttonWakeMax = (Button)findViewById(R.id.buttonWakeMax);        
	     buttonWakeMax.setOnClickListener(wakemaxListener);
	     
	     Button buttonApplySet = (Button)findViewById(R.id.buttonApplySet);        
	     buttonApplySet.setOnClickListener(applysetListener);
	    }
	    
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener sleepgovListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.SleepGovActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener sleepminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.SleepMinActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } 
	    };
	    
	    private OnClickListener sleepmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.SleepMaxActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } 
	    };
	    
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener wakegovListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.WakeGovActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener wakeminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.WakeMinActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } 
	    };
	    
	    private OnClickListener wakemaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.WakeMaxActivity");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } 
	    };
	     
	    private OnClickListener applysetListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/restartandrev");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(AbsolutionTweakActivity.this, "Settings Applied. andrev_oc Restarted", Toast.LENGTH_SHORT).show();
	        } 
	    };
	    @Override
	 protected void onStart() {//activity is started and visible to the user
	  Log.d(logtag,"onStart() called");
	  super.onStart();  
	 }
	 @Override
	 protected void onResume() {//activity was resumed and is visible again
	  Log.d(logtag,"onResume() called");
	  super.onResume();
	   
	 }
	 @Override
	 protected void onPause() { //device goes to sleep or another activity appears
	  Log.d(logtag,"onPause() called");//another activity is currently running (or user has pressed Home)
	  super.onPause();
	   
	 }
	 @Override
	 protected void onStop() { //the activity is not visible anymore
	  Log.d(logtag,"onStop() called");
	  super.onStop();
	   
	 }
	 @Override
	 protected void onDestroy() {//android has killed this activity
	   Log.d(logtag,"onDestroy() called");
	   super.onDestroy();
	 }

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
		    MenuInflater inflater = getMenuInflater();
		    inflater.inflate(R.layout.menu, menu);
		    return true;
		}
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		    // Handle item selection
		    switch (item.getItemId()) {
		    case R.id.exit_app:
		    	System.exit(0);
		        return true;
		    default:
		        return super.onOptionsItemSelected(item);
		    }
		}
	}