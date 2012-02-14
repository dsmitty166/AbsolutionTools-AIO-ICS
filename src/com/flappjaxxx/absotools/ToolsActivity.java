package com.flappjaxxx.absotools;

import com.flappjaxxx.absotools.R;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class ToolsActivity extends TabActivity {
	TextView   consoleView = null;

	public static final int TAB_APPS = 0;
	public static final int TAB_GPS = 1;
	public static final int TAB_UV = 2;	
	public static final int TAB_DISPLAY = 3;
	public static final int TAB_EXTRAS = 4;
	public static final int TAB_CONSOLE = 5;	
	
	/// Singleton //////////////////////////////////////////
    private static ToolsActivity INSTANCE = null;     

    private synchronized static void setInstance(ToolsActivity theInstance) {
        if (INSTANCE == null) { 
            INSTANCE = theInstance;
        }
    }
    
    public static ToolsActivity getInstance() {
        return INSTANCE;
    }	
	public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(); 
	}
	////////////////////////////////////////////////////////
		
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    
	    // So we an get it later
	    ToolsActivity.setInstance(this);
	    
	    Resources res = getResources(); // Resource object to get Drawables
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	 // OTA tab
	   // intent = new Intent().setClass(this, OTAActivity.class);
	    //spec = tabHost.newTabSpec("ota").setIndicator("OTA",
	      //                res.getDrawable(R.drawable.ic_tab_ota))
	        //          .setContent(intent);
	    //tabHost.addTab(spec);
	    
	    // Create an Intent to launch an Activity for the tab (to be reused)
	    // Tools tab
	    intent = new Intent().setClass(this, AppsActivity.class);
	    spec = tabHost.newTabSpec("apps").setIndicator("",
	                      res.getDrawable(R.drawable.ic_tab_apps))
	                  .setContent(intent);
	    tabHost.addTab(spec);
	    
	    // GPS tab
	    intent = new Intent().setClass(this, GPSActivity.class);	    
	    spec = tabHost.newTabSpec("gps").setIndicator("",
	                      res.getDrawable(R.drawable.ic_tab_gps))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    // UV tab
	    intent = new Intent().setClass(this, UVActivity.class);
	    spec = tabHost.newTabSpec("cpu").setIndicator("",
	                      res.getDrawable(R.drawable.ic_tab_cpu))
	                  .setContent(intent);
	    tabHost.addTab(spec);
	    
	 // Display tab
	    intent = new Intent().setClass(this, DisplayActivity.class);
	    spec = tabHost.newTabSpec("display").setIndicator("",
	                      res.getDrawable(R.drawable.ic_tab_display))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	 // Extras tab
	    intent = new Intent().setClass(this, ExtrasActivity.class);
	    spec = tabHost.newTabSpec("extras").setIndicator("",
	                      res.getDrawable(R.drawable.ic_tab_extras))
	                  .setContent(intent);
	    tabHost.addTab(spec);
	    
	 
	    // Console tab
	    intent = new Intent().setClass(this, ConsoleActivity.class);
	    spec = tabHost.newTabSpec("console").setIndicator("",
	                      res.getDrawable(R.drawable.ic_tab_console))
	                  .setContent(intent);
	    tabHost.addTab(spec);
	    	    
	    tabHost.setCurrentTab(TAB_APPS);
	}

	public void setConsoleView(TextView textView) {
		consoleView = textView;		
	}

	public TextView getConsoleView() {
		return consoleView;
	}
	
	//This keeps back button from exiting app
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        // do something on back.
	    	System.exit(0);
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
	}

	
}