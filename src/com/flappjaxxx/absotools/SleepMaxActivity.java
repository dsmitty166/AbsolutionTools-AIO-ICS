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

public class SleepMaxActivity extends Activity {
    
	 private static String logtag = "AbsolutionTweak";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sleepmax);
	         
	        Button button122smax = (Button)findViewById(R.id.button122smax);        
	     button122smax.setOnClickListener(button122smaxListener); // Register the onClick listener with the implementation above
	       
	     Button button230smax = (Button)findViewById(R.id.button230smax);        
	     button230smax.setOnClickListener(button230smaxListener); // Register the onClick listener with the implementation above
	    
	     Button button307smax = (Button)findViewById(R.id.button307smax);        
	     button307smax.setOnClickListener(button307smaxListener);

	     Button button384smax = (Button)findViewById(R.id.button384smax);        
	     button384smax.setOnClickListener(button384smaxListener);

	     Button button460smax = (Button)findViewById(R.id.button460smax);        
	     button460smax.setOnClickListener(button460smaxListener);

	     Button button537smax = (Button)findViewById(R.id.button537smax);        
	     button537smax.setOnClickListener(button537smaxListener);

	     Button button614smax = (Button)findViewById(R.id.button614smax);        
	     button614smax.setOnClickListener(button614smaxListener);

	     Button button691smax = (Button)findViewById(R.id.button691smax);        
	     button691smax.setOnClickListener(button691smaxListener);

	     Button button768smax = (Button)findViewById(R.id.button768smax);        
	     button768smax.setOnClickListener(button768smaxListener);

	     Button button844smax = (Button)findViewById(R.id.button844smax);        
	     button844smax.setOnClickListener(button844smaxListener);

	     Button button922smax = (Button)findViewById(R.id.button922smax);        
	     button922smax.setOnClickListener(button922smaxListener);

	     Button button998smax = (Button)findViewById(R.id.button998smax);        
	     button998smax.setOnClickListener(button998smaxListener);

	     Button button1075smax = (Button)findViewById(R.id.button1075smax);        
	     button1075smax.setOnClickListener(button1075smaxListener);

	     Button button1152smax = (Button)findViewById(R.id.button1152smax);        
	     button1152smax.setOnClickListener(button1152smaxListener);

	     Button button1228smax = (Button)findViewById(R.id.button1228smax);        
	     button1228smax.setOnClickListener(button1228smaxListener);

	     Button button1305smax = (Button)findViewById(R.id.button1305smax);        
	     button1305smax.setOnClickListener(button1305smaxListener);

	     Button button1382smax = (Button)findViewById(R.id.button1382smax);        
	     button1382smax.setOnClickListener(button1382smaxListener);

	     Button button1459smax = (Button)findViewById(R.id.button1459smax);        
	     button1459smax.setOnClickListener(button1459smaxListener);

	     Button button1536smax = (Button)findViewById(R.id.button1536smax);        
	     button1536smax.setOnClickListener(button1536smaxListener);

	     Button button1612smax = (Button)findViewById(R.id.button1612smax);        
	     button1612smax.setOnClickListener(button1612smaxListener);

	     Button button1689smax = (Button)findViewById(R.id.button1689smax);        
	     button1689smax.setOnClickListener(button1689smaxListener);

	     Button button1766smax = (Button)findViewById(R.id.button1766smax);        
	     button1766smax.setOnClickListener(button1766smaxListener);

	     Button button1843smax = (Button)findViewById(R.id.button1843smax);        
	     button1843smax.setOnClickListener(button1843smaxListener);

	     Button button1920smax = (Button)findViewById(R.id.button1920smax);        
	     button1920smax.setOnClickListener(button1920smaxListener);

	     Button button1996smax = (Button)findViewById(R.id.button1996smax);        
	     button1996smax.setOnClickListener(button1996smaxListener);

	     Button button2016smax = (Button)findViewById(R.id.button2016smax);        
	     button2016smax.setOnClickListener(button2016smaxListener);
	     
	    }
	     
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener button122smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/122sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 122000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener button230smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/230sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 230400", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        } 
	    };
	    
	    private OnClickListener button307smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/307sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 307200", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button384smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/384sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 384000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button460smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/460sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 460800", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button537smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/537sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 537600", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button614smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/614sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 614400", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button691smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/691sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 691200", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };
	   
	    private OnClickListener button768smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/768sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 768000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button844smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/844sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 844800", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button922smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/922sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 921600", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button998smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/998sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 998400", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1075smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1075sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1075200", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1152smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1152sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1152000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1228smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1228sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1228800", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1305smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1305sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1305600", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1382smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1382sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1382400", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1459smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1459sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1459200", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1536smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1536sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1536000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1612smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1612sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1612800", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1689smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1689sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1689600", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1766smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1766sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1766400", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1843smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1843sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1843200", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1920smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1920sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1920000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1996smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1996sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 1996800", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button2016smaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/2016sleepmax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMaxActivity.this, "Sleep Max Set to 2016000", Toast.LENGTH_SHORT).show();
				SleepMaxActivity.this.finish();
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