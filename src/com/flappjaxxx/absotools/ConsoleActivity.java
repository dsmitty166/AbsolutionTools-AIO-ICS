package com.flappjaxxx.absotools;

import com.flappjaxxx.absotools.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class ConsoleActivity extends Activity {
	TextView consoleTextView = null;
    @SuppressWarnings("deprecation")
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        consoleTextView = new TextView(this);
        consoleTextView.setText("");
        consoleTextView.setMovementMethod(new ScrollingMovementMethod());
        setContentView(consoleTextView);
        ToolsActivity.getInstance().setConsoleView(consoleTextView);
        ToolsActivity.getInstance().getTabHost().setCurrentTab(ToolsActivity.TAB_CONSOLE); 
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
	public boolean onCreateOptionsMenu(Menu menu2) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.layout.menu2, menu2);
	    return true;
	}
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.clear_console:
	    	ToolsActivity.getInstance().getConsoleView().setText("");
	        return true;
	    case R.id.exit_app:
	    	System.exit(0);
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}