package com.dmgctrll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CryptogramScreen extends Activity {
		//implements OnLetterChangedListener {
	
	private static final String BRIGHTNESS_PREFERENCE_KEY = "brightness";
    private static final String COLOR_PREFERENCE_KEY = "color";
    
    private final static String GRID_ITEM_KEY	= "gridItemKey";
	private final static String GRID_ITEM_CRYPTOGRAM	= "gridItemCryptogram";
    
    //TextView tv; 
	
	//Test gitignore
	// tests ddd fff
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cryptogram);
        
        /*
        Button btn = (Button) findViewById(R.id.Button01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = PreferenceManager.getDefaultSharedPreferences(
                		CryptogramScreen.this).getInt(COLOR_PREFERENCE_KEY,
                        Color.WHITE);
                new LetterPickerDialog(CryptogramScreen.this, CryptogramScreen.this,
                        color).show();
            }
        });
        */
	}
	
	public static Intent intentWithContext(Context context, String key, String cryptogram) 
	{
		Intent intent = new Intent(context, CryptogramScreen.class);
		Bundle extras = new Bundle();
		extras.putString(GRID_ITEM_KEY, key);
		extras.putString(GRID_ITEM_CRYPTOGRAM, cryptogram);
		intent.replaceExtras(extras);
		return intent;
	}
	
	void getCryptogram(){
		
	}
	
	void formatCryptogram(){
		
	}

	void buildScreen() {
		
	}
	
	/*
	public void letterChanged(char letter) {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt(
                COLOR_PREFERENCE_KEY, letter).commit();
        tv.setTextColor(letter);

    }
	*/
}
