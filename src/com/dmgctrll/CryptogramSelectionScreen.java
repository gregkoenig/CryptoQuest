package com.dmgctrll;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class CryptogramSelectionScreen extends Activity 
					implements AdapterView.OnItemClickListener {
	
	public static final String CRYPTOGRAM_POOL = "CryptogramPool";
	
	String[] items = {"quote1", "quote2", "test3", "test4", "test5",
					  "test6", "test7", "test8", "test9", "test10"
	};
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cryptogram_selection_screen);        
        
        GridView g = (GridView) findViewById(R.id.grid);
        g.setAdapter(new CryptoSelectionAdapter(this, 
        										android.R.layout.simple_list_item_1, 
        										items));
        g.setOnItemClickListener(this);
        
	}
	
	public void onItemClick(AdapterView<?> parent, View v, int position, long id){
		
		Intent intent = new Intent();
		intent = CryptogramScreen.intentWithContext(this, Integer.toString(position));
		startActivity(intent);
		
		
	}
	
	public void launchCryptogram(View v){
		
		//Intent intent = new Intent(this, CryptogramScreen.class);
		//startActivity(intent);
		
	}
	
	
	private class CryptoSelectionAdapter extends ArrayAdapter {
		Context ctxt;
		
		CryptoSelectionAdapter(Context ctxt, int resource, String[] items) {
			super(ctxt, resource, items);
			
			this.ctxt=ctxt;
		}
		
		public View getView(int position, View convertView, ViewGroup parent) {
			
			ImageView image = (ImageView) convertView;
			
			if(convertView==null){
				convertView = new ImageView(ctxt);
				image = (ImageView) convertView;
			}
			
			image.setImageResource(R.drawable.icon);
			
			return(convertView);
		}
	}
	
	

}
