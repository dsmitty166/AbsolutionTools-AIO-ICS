package com.flappjaxxx.absotools;

import com.flappjaxxx.absotools.R;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class GPSActivity extends ScriptedActivity {
	public boolean onItemSelected(String itemAction, String itemDescription) {
		ToolsActivity.getInstance().getTabHost().setCurrentTab(ToolsActivity.TAB_CONSOLE);
		return true;
	}
	
	public void onCreate(Bundle savedInstanceState) {		
		this.actions      = getResources().getStringArray(R.array.gps_actions_array);
		this.descriptions = getResources().getStringArray(R.array.gps_descriptions_array);
		super.onCreate(savedInstanceState);		
	}
	public boolean onKeyDown(int keyCode, KeyEvent event)  {
	    if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	        // do something on back.
	    	System.exit(0);
	        return true;
	    }

	    return super.onKeyDown(keyCode, event);
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