package com.dmgctrll;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;


public class StartScreen extends Activity {

	Button startNewQuest;
	Button resumeQuest;
	
	private static final String COLOR_PREFERENCE_KEY = "color";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        didStartNewQuest();

    }
    
    public void didStartNewQuest(){
    	
    	// if first time, show only one button. else show both
    	
    }
    
    public void startNewQuest(View v){
    	
    	Intent intent = new Intent(this, CryptogramSelectionScreen.class);
    	startActivity(intent);
    	
    }
    
    public void resumeQuest(View v){
    	
    	Intent intent = new Intent(this, CryptogramSelectionScreen.class);
    	startActivity(intent);
    	
    }

}
