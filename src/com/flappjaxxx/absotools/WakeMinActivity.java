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

public class WakeMinActivity extends Activity {
    
	 private static String logtag = "AbsolutionTweak";//for use as the tag when logging 
	   
	 /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.wakemin);
	         
	        Button button122wmin = (Button)findViewById(R.id.button122wmin);        
	     button122wmin.setOnClickListener(button122wminListener); // Register the onClick listener with the implementation above
	       
	     Button button230wmin = (Button)findViewById(R.id.button230wmin);        
	     button230wmin.setOnClickListener(button230wminListener); // Register the onClick listener with the implementation above
	    
	     Button button307wmin = (Button)findViewById(R.id.button307wmin);        
	     button307wmin.setOnClickListener(button307wminListener);

	     Button button384wmin = (Button)findViewById(R.id.button384wmin);        
	     button384wmin.setOnClickListener(button384wminListener);

	     Button button460wmin = (Button)findViewById(R.id.button460wmin);        
	     button460wmin.setOnClickListener(button460wminListener);

	     Button button537wmin = (Button)findViewById(R.id.button537wmin);        
	     button537wmin.setOnClickListener(button537wminListener);

	     Button button614wmin = (Button)findViewById(R.id.button614wmin);        
	     button614wmin.setOnClickListener(button614wminListener);

	     Button button691wmin = (Button)findViewById(R.id.button691wmin);        
	     button691wmin.setOnClickListener(button691wminListener);

	     Button button768wmin = (Button)findViewById(R.id.button768wmin);        
	     button768wmin.setOnClickListener(button768wminListener);

	     Button button844wmin = (Button)findViewById(R.id.button844wmin);        
	     button844wmin.setOnClickListener(button844wminListener);

	     Button button922wmin = (Button)findViewById(R.id.button922wmin);        
	     button922wmin.setOnClickListener(button922wminListener);

	     Button button998wmin = (Button)findViewById(R.id.button998wmin);        
	     button998wmin.setOnClickListener(button998wminListener);

	     Button button1075wmin = (Button)findViewById(R.id.button1075wmin);        
	     button1075wmin.setOnClickListener(button1075wminListener);

	     Button button1152wmin = (Button)findViewById(R.id.button1152wmin);        
	     button1152wmin.setOnClickListener(button1152wminListener);

	     Button button1228wmin = (Button)findViewById(R.id.button1228wmin);        
	     button1228wmin.setOnClickListener(button1228wminListener);

	     Button button1305wmin = (Button)findViewById(R.id.button1305wmin);        
	     button1305wmin.setOnClickListener(button1305wminListener);

	     Button button1382wmin = (Button)findViewById(R.id.button1382wmin);        
	     button1382wmin.setOnClickListener(button1382wminListener);

	     Button button1459wmin = (Button)findViewById(R.id.button1459wmin);        
	     button1459wmin.setOnClickListener(button1459wminListener);

	     Button button1536wmin = (Button)findViewById(R.id.button1536wmin);        
	     button1536wmin.setOnClickListener(button1536wminListener);

	     Button button1612wmin = (Button)findViewById(R.id.button1612wmin);        
	     button1612wmin.setOnClickListener(button1612wminListener);

	     Button button1689wmin = (Button)findViewById(R.id.button1689wmin);        
	     button1689wmin.setOnClickListener(button1689wminListener);

	     Button button1766wmin = (Button)findViewById(R.id.button1766wmin);        
	     button1766wmin.setOnClickListener(button1766wminListener);

	     Button button1843wmin = (Button)findViewById(R.id.button1843wmin);        
	     button1843wmin.setOnClickListener(button1843wminListener);

	     Button button1920wmin = (Button)findViewById(R.id.button1920wmin);        
	     button1920wmin.setOnClickListener(button1920wminListener);

	     Button button1996wmin = (Button)findViewById(R.id.button1996wmin);        
	     button1996wmin.setOnClickListener(button1996wminListener);

	     Button button2016wmin = (Button)findViewById(R.id.button2016wmin);        
	     button2016wmin.setOnClickListener(button2016wminListener);
	     
	    }
	     
	    //Create an anonymous implementation of OnClickListener
	    private OnClickListener button122wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/122wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 122000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }
	    };
	     
	    // Create an anonymous implementation of OnClickListener
	    private OnClickListener button230wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/230wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 230400", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        } 
	    };
	    
	    private OnClickListener button307wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/307wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 307200", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button384wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/384wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 384000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button460wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/460wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 460800", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button537wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/537wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 537600", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button614wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/614wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 614400", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button691wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/691wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 691200", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };
	   
	    private OnClickListener button768wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/768wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 768000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button844wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/844wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 844800", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button922wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/922wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 921600", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button998wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/998wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 998400", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1075wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1075wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1075200", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1152wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1152wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1152000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1228wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1228wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1228800", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1305wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1305wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1305600", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1382wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1382wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1382400", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1459wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1459wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1459200", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1536wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1536wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1536000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1612wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1612wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1612800", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1689wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1689wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1689600", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1766wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1766wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1766400", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1843wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1843wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1843200", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1920wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1920wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1920000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button1996wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/1996wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 1996800", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
	        }				
	    };

	    private OnClickListener button2016wminListener = new OnClickListener() {
	        public void onClick(View v) {
	        	try {
					Runtime.getRuntime().exec("su -c /system/media/tweak/2016wakemin");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Toast.makeText(WakeMinActivity.this, "Wake Min Set to 2016000", Toast.LENGTH_SHORT).show();
				WakeMinActivity.this.finish();
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