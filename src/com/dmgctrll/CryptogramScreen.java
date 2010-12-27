package com.dmgctrll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CryptogramScreen extends Activity {
		//implements OnLetterChangedListener {
	
	public static final String CRYPTOGRAM_POOL = "CryptogramPool";
	
	private static final String BRIGHTNESS_PREFERENCE_KEY = "brightness";
    private static final String COLOR_PREFERENCE_KEY = "color";
    
    private final static String GRID_ITEM_KEY	= "gridItemKey";
	private final static String GRID_ITEM_CRYPTOGRAM	= "gridItemCryptogram";
    
    TextView tv; 
	
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cryptogram_screen);
        
        Bundle extras = getIntent().getExtras();
        String selection = extras.getString(GRID_ITEM_KEY);
        SharedPreferences cryptogramPool = getSharedPreferences(CRYPTOGRAM_POOL, 0);
        cryptogramPool.getString(selection, null);
        
        tv = (TextView) findViewById(R.id.cryptogram);
        
        String text = cryptogramPool.getString(selection, null);
        
        tv.setText(text);
        
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
	
	public static Intent intentWithContext(Context context, String cryptogram) 
	{
		Intent intent = new Intent(context, CryptogramScreen.class);
		Bundle extras = new Bundle();
		extras.putString(GRID_ITEM_KEY, cryptogram);
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
