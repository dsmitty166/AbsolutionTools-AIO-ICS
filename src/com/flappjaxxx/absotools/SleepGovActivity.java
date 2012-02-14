package com.flappjaxxx.absotools;

import java.io.IOException;

import com.flappjaxxx.absotools.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SleepGovActivity extends Activity {
    
	private static String logtag = "AbsolutionTools";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sleepgov);
	         
	     Button buttonlagfree = (Button)findViewById(R.id.buttonlagfree);        
	     buttonlagfree.setOnClickListener(lagfreeListener); // Register the onClick listener with the implementation above
	       
	     Button buttonondemand = (Button)findViewById(R.id.buttonondemand);        
	     buttonondemand.setOnClickListener(ondemandListener); // Register the onClick listener with the implementation above
	    
	     Button buttonondemandx = (Button)findViewById(R.id.buttonondemandx);        
	     buttonondemandx.setOnClickListener(ondemandxListener);
	     
	     Button buttoninteractive = (Button)findViewById(R.id.buttoninteractive);        
	     buttoninteractive.setOnClickListener(interactiveListener);
	     
	     Button buttonbrazilian = (Button)findViewById(R.id.buttonbrazilian);        
	     buttonbrazilian.setOnClickListener(brazilianListener);

	     Button buttonsmartass2 = (Button)findViewById(R.id.buttonsmartass2);        
	     buttonsmartass2.setOnClickListener(smartass2Listener);

	     Button buttonsmartass = (Button)findViewById(R.id.buttonsmartass);        
	     buttonsmartass.setOnClickListener(smartassListener);

	     Button buttonminmax = (Button)findViewById(R.id.buttonminmax);        
	     buttonminmax.setOnClickListener(minmaxListener);

	     Button buttonconservative = (Button)findViewById(R.id.buttonconservative);        
	     buttonconservative.setOnClickListener(conservativeListener);

	     Button buttonuserspace = (Button)findViewById(R.id.buttonuserspace);        
	     buttonuserspace.setOnClickListener(userspaceListener);
	     
	     Button buttonpowersave = (Button)findViewById(R.id.buttonpowersave);        
	     buttonpowersave.setOnClickListener(powersaveListener);

	     Button buttonperformance = (Button)findViewById(R.id.buttonperformance);        
	     buttonperformance.setOnClickListener(performanceListener);
	    }
	    
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener lagfreeListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/lagfreesleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to lagfree", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener ondemandListener = new OnClickListener() {
	    	public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/ondemandsleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to ondemand", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	    private OnClickListener ondemandxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/ondemandXsleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to ondemandX", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener interactiveListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/interactivesleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to interactive", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener brazilianListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/braziliansleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to brazilianwax", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener smartass2Listener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/smartass2sleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to smartassV2", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener smartassListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/smartasssleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to smartass", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener minmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/minmaxsleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to minmax", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener conservativeListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/conservativesleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to conservative", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener userspaceListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/userspacesleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to userspace", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener powersaveListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/powersavesleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to powersave", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
	        }
	    };
	    
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener performanceListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/performancesleep");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepGovActivity.this, "Sleep Governor set to performance", Toast.LENGTH_SHORT).show();
				SleepGovActivity.this.finish();
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
	}