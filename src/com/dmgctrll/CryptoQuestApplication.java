package com.dmgctrll;

import android.app.Application;
import android.os.Bundle;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class CryptoQuestApplication extends Application {
	
	public static final String CRYPTOGRAM_POOL = "CryptogramPool";

	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate();

		createCrptogramPool();
		
	}


	private void createCrptogramPool() {
		SharedPreferences cryptogramPool = getSharedPreferences(CRYPTOGRAM_POOL, 0);
		SharedPreferences.Editor editor = cryptogramPool.edit();

		editor.putString("0", getString(R.string.quote1));
		
		editor.commit();
	}

}
