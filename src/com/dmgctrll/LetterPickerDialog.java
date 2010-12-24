package com.dmgctrll;

import com.dmgctrll.LetterPickerView;
import com.dmgctrll.OnLetterChangedListener;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;

public class LetterPickerDialog extends Dialog  {
	
	public final OnLetterChangedListener mListener;
    private final int mInitialColor;

	public LetterPickerDialog(Context context, OnLetterChangedListener listener,
            int initialColor) {
        super(context);

        mListener = listener;
        mInitialColor = initialColor;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnLetterChangedListener l = new OnLetterChangedListener() {
            public void letterChanged(char letter) {
                mListener.letterChanged(letter);
                dismiss();
            }
        };

        LinearLayout layout = new LinearLayout(getContext());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(10, 10, 10, 10);
        layout.addView(new LetterPickerView(getContext(), l, mInitialColor),
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));

        setContentView(layout);
        setTitle("Pick a Color");
    }

}
