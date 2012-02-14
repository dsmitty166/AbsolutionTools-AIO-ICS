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

public class WakeMaxActivity extends Activity {
    
	 private static String logtag = "AbsolutionTweak";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.wakemax);
	         
	        Button button122wmax = (Button)findViewById(R.id.button122wmax);        
	     button122wmax.setOnClickListener(button122wmaxListener); // Register the onClick listener with the implementation above
	       
	     Button button230wmax = (Button)findViewById(R.id.button230wmax);        
	     button230wmax.setOnClickListener(button230wmaxListener); // Register the onClick listener with the implementation above
	    
	     Button button307wmax = (Button)findViewById(R.id.button307wmax);        
	     button307wmax.setOnClickListener(button307wmaxListener);

	     Button button384wmax = (Button)findViewById(R.id.button384wmax);        
	     button384wmax.setOnClickListener(button384wmaxListener);

	     Button button460wmax = (Button)findViewById(R.id.button460wmax);        
	     button460wmax.setOnClickListener(button460wmaxListener);

	     Button button537wmax = (Button)findViewById(R.id.button537wmax);        
	     button537wmax.setOnClickListener(button537wmaxListener);

	     Button button614wmax = (Button)findViewById(R.id.button614wmax);        
	     button614wmax.setOnClickListener(button614wmaxListener);

	     Button button691wmax = (Button)findViewById(R.id.button691wmax);        
	     button691wmax.setOnClickListener(button691wmaxListener);

	     Button button768wmax = (Button)findViewById(R.id.button768wmax);        
	     button768wmax.setOnClickListener(button768wmaxListener);

	     Button button844wmax = (Button)findViewById(R.id.button844wmax);        
	     button844wmax.setOnClickListener(button844wmaxListener);

	     Button button922wmax = (Button)findViewById(R.id.button922wmax);        
	     button922wmax.setOnClickListener(button922wmaxListener);

	     Button button998wmax = (Button)findViewById(R.id.button998wmax);        
	     button998wmax.setOnClickListener(button998wmaxListener);

	     Button button1075wmax = (Button)findViewById(R.id.button1075wmax);        
	     button1075wmax.setOnClickListener(button1075wmaxListener);

	     Button button1152wmax = (Button)findViewById(R.id.button1152wmax);        
	     button1152wmax.setOnClickListener(button1152wmaxListener);

	     Button button1228wmax = (Button)findViewById(R.id.button1228wmax);        
	     button1228wmax.setOnClickListener(button1228wmaxListener);

	     Button button1305wmax = (Button)findViewById(R.id.button1305wmax);        
	     button1305wmax.setOnClickListener(button1305wmaxListener);

	     Button button1382wmax = (Button)findViewById(R.id.button1382wmax);        
	     button1382wmax.setOnClickListener(button1382wmaxListener);

	     Button button1459wmax = (Button)findViewById(R.id.button1459wmax);        
	     button1459wmax.setOnClickListener(button1459wmaxListener);

	     Button button1536wmax = (Button)findViewById(R.id.button1536wmax);        
	     button1536wmax.setOnClickListener(button1536wmaxListener);

	     Button button1612wmax = (Button)findViewById(R.id.button1612wmax);        
	     button1612wmax.setOnClickListener(button1612wmaxListener);

	     Button button1689wmax = (Button)findViewById(R.id.button1689wmax);        
	     button1689wmax.setOnClickListener(button1689wmaxListener);

	     Button button1766wmax = (Button)findViewById(R.id.button1766wmax);        
	     button1766wmax.setOnClickListener(button1766wmaxListener);

	     Button button1843wmax = (Button)findViewById(R.id.button1843wmax);        
	     button1843wmax.setOnClickListener(button1843wmaxListener);

	     Button button1920wmax = (Button)findViewById(R.id.button1920wmax);        
	     button1920wmax.setOnClickListener(button1920wmaxListener);

	     Button button1996wmax = (Button)findViewById(R.id.button1996wmax);        
	     button1996wmax.setOnClickListener(button1996wmaxListener);

	     Button button2016wmax = (Button)findViewById(R.id.button2016wmax);        
	     button2016wmax.setOnClickListener(button2016wmaxListener);
	     
	    }
	     
	  //Create an anonymous implementation of OnClickListener
	    private OnClickListener button122wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/122wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 122000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener button230wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/230wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 230400", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        } 
	    };
	    
	    private OnClickListener button307wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/307wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 307200", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button384wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/384wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 384000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button460wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/460wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 460800", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button537wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/537wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 537600", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button614wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/614wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 614400", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button691wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/691wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 691200", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };
	   
	    private OnClickListener button768wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/768wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 768000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button844wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/844wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 844800", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button922wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/922wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 921600", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button998wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/998wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 998400", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1075wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1075wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1075200", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1152wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1152wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1152000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1228wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1228wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1228800", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1305wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1305wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1305600", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1382wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1382wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1382400", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1459wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1459wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1459200", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1536wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1536wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1536000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1612wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1612wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1612800", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1689wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1689wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1689600", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1766wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1766wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1766400", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1843wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1843wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1843200", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1920wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1920wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1920000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1996wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1996wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 1996800", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
	        }				
	    };

	    private OnClickListener button2016wmaxListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/2016wakemax");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMaxActivity.this, "Wake Max Set to 2016000", Toast.LENGTH_SHORT).show();
				WakeMaxActivity.this.finish();
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
	 protected void onPause() { //device goes to Wake or another activity appears
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