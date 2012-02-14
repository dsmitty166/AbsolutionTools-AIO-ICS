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

public class SleepMinActivity extends Activity {
    
	 private static String logtag = "AbsolutionTweak";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.sleepmin);
	         
	        Button button122smin = (Button)findViewById(R.id.button122smin);        
	     button122smin.setOnClickListener(button122sminListener); // Register the onClick listener with the implementation above
	       
	     Button button230smin = (Button)findViewById(R.id.button230smin);        
	     button230smin.setOnClickListener(button230sminListener); // Register the onClick listener with the implementation above
	    
	     Button button307smin = (Button)findViewById(R.id.button307smin);        
	     button307smin.setOnClickListener(button307sminListener);

	     Button button384smin = (Button)findViewById(R.id.button384smin);        
	     button384smin.setOnClickListener(button384sminListener);

	     Button button460smin = (Button)findViewById(R.id.button460smin);        
	     button460smin.setOnClickListener(button460sminListener);

	     Button button537smin = (Button)findViewById(R.id.button537smin);        
	     button537smin.setOnClickListener(button537sminListener);

	     Button button614smin = (Button)findViewById(R.id.button614smin);        
	     button614smin.setOnClickListener(button614sminListener);

	     Button button691smin = (Button)findViewById(R.id.button691smin);        
	     button691smin.setOnClickListener(button691sminListener);

	     Button button768smin = (Button)findViewById(R.id.button768smin);        
	     button768smin.setOnClickListener(button768sminListener);

	     Button button844smin = (Button)findViewById(R.id.button844smin);        
	     button844smin.setOnClickListener(button844sminListener);

	     Button button922smin = (Button)findViewById(R.id.button922smin);        
	     button922smin.setOnClickListener(button922sminListener);

	     Button button998smin = (Button)findViewById(R.id.button998smin);        
	     button998smin.setOnClickListener(button998sminListener);

	     Button button1075smin = (Button)findViewById(R.id.button1075smin);        
	     button1075smin.setOnClickListener(button1075sminListener);

	     Button button1152smin = (Button)findViewById(R.id.button1152smin);        
	     button1152smin.setOnClickListener(button1152sminListener);

	     Button button1228smin = (Button)findViewById(R.id.button1228smin);        
	     button1228smin.setOnClickListener(button1228sminListener);

	     Button button1305smin = (Button)findViewById(R.id.button1305smin);        
	     button1305smin.setOnClickListener(button1305sminListener);

	     Button button1382smin = (Button)findViewById(R.id.button1382smin);        
	     button1382smin.setOnClickListener(button1382sminListener);

	     Button button1459smin = (Button)findViewById(R.id.button1459smin);        
	     button1459smin.setOnClickListener(button1459sminListener);

	     Button button1536smin = (Button)findViewById(R.id.button1536smin);        
	     button1536smin.setOnClickListener(button1536sminListener);

	     Button button1612smin = (Button)findViewById(R.id.button1612smin);        
	     button1612smin.setOnClickListener(button1612sminListener);

	     Button button1689smin = (Button)findViewById(R.id.button1689smin);        
	     button1689smin.setOnClickListener(button1689sminListener);

	     Button button1766smin = (Button)findViewById(R.id.button1766smin);        
	     button1766smin.setOnClickListener(button1766sminListener);

	     Button button1843smin = (Button)findViewById(R.id.button1843smin);        
	     button1843smin.setOnClickListener(button1843sminListener);

	     Button button1920smin = (Button)findViewById(R.id.button1920smin);        
	     button1920smin.setOnClickListener(button1920sminListener);

	     Button button1996smin = (Button)findViewById(R.id.button1996smin);        
	     button1996smin.setOnClickListener(button1996sminListener);

	     Button button2016smin = (Button)findViewById(R.id.button2016smin);        
	     button2016smin.setOnClickListener(button2016sminListener);
	     
	    }
	     
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener button122sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/122sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 122000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener button230sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/230sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 230400", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        } 
	    };
	    
	    private OnClickListener button307sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/307sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 307200", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button384sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/384sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 384000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button460sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/460sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 460800", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button537sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/537sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 537600", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button614sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/614sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 614400", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button691sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/691sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 691200", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };
	   
	    private OnClickListener button768sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/768sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 768000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button844sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/844sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 844800", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button922sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/922sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 921600", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button998sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/998sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 998400", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1075sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1075sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1075200", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1152sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1152sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1152000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1228sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1228sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1228800", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1305sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1305sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1305600", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1382sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1382sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1382400", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1459sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1459sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1459200", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1536sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1536sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1536000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1612sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1612sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1612800", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1689sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1689sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1689600", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1766sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1766sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1766400", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1843sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1843sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1843200", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1920sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1920sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1920000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1996sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1996sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 1996800", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button2016sminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/2016sleepmin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(SleepMinActivity.this, "Sleep Min Set to 2016000", Toast.LENGTH_SHORT).show();
				SleepMinActivity.this.finish();
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