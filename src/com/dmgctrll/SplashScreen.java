package com.dmgctrll;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import android.widget.ImageView;

public class SplashScreen extends Activity {
	
	private static final long SPLASH_TIME = 3000;
	private static final int STOP_SPLASH = 0;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
	}
	
	public void onWindowFocusChanged(boolean hasFocus) {
    	if (hasFocus) {
	    	
	    	setContentView(R.layout.splash_screen);
	    	handleSplashImage();
	    	
	    	}
    }
    

	private void handleSplashImage() {
	
	    Message msg = new Message();
	    msg.what = STOP_SPLASH;
	    
	    new Handler() {
	    	public void handleMessage(Message msg) {
	    		switch (msg.what) {
		    		case STOP_SPLASH: {
	    	    			setContentView(R.layout.main);
		    		}
			    	break;
		    	}
	    		
	    		super.handleMessage(msg);
			}
	    }.sendMessageDelayed(msg, SPLASH_TIME);
	    
	    
	}

}
