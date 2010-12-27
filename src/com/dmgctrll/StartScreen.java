package com.dmgctrll;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;


public class StartScreen extends Activity {

	Button startNewQuest;
	Button resumeQuest;
	
	public static final String CRYPTOGRAM_POOL = "CryptogramPool";
	
	private static final String COLOR_PREFERENCE_KEY = "color";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        
        createCryptogramPool();

    } 
    public boolean didStartNewQuest(){
    	
    	// if first time, show only one button. else show both
    	return true;
    }
    
    public void startNewQuest(View v){
    	
    	Intent intent = new Intent(this, CryptogramSelectionScreen.class);
    	startActivity(intent);
    	
    }
    
    public void resumeQuest(View v){
    	
    	Intent intent = new Intent(this, CryptogramSelectionScreen.class);
    	startActivity(intent);
    	
    }
    
    private void createCryptogramPool() {
		SharedPreferences cryptogramPool = getSharedPreferences(CRYPTOGRAM_POOL, 0);
		SharedPreferences.Editor editor = cryptogramPool.edit();

		editor.putString("0", getString(R.string.quote1));
		editor.putString("1", getString(R.string.quote2));
		editor.putString("2", getString(R.string.quote3));
		
		
		editor.commit();
	}

}
