package com.flappjaxxx.absotools;

import java.io.IOException;

import com.flappjaxxx.absotools.R;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class UVActivity extends ScriptedActivity {
	public boolean onItemSelected(String itemAction, String itemDescription) {
		ToolsActivity.getInstance().getTabHost().setCurrentTab(ToolsActivity.TAB_CONSOLE);
		return true;
	}
	
	public void onCreate(Bundle savedInstanceState) {		
		this.actions      = getResources().getStringArray(R.array.uv_actions_array);
		this.descriptions = getResources().getStringArray(R.array.uv_descriptions_array);
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
	public boolean onCreateOptionsMenu(Menu menu3) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.menu3, menu3);
	    return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
		
	    switch (item.getItemId()) {
	    case R.id.tweak_app:
	    	try {
				Runtime.getRuntime().exec("am start -a android.intent.action.MAIN -n com.flappjaxxx.absotools/.AbsolutionTweakActivity");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return true;
	    case R.id.exit_app:
	    	System.exit(0);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}