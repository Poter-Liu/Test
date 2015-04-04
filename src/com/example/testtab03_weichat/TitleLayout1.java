package com.example.testtab03_weichat;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TitleLayout1 extends LinearLayout {
	private ImageView imgBack;
	private ImageView imgEdit;

	public TitleLayout1(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title_1, this);
		
		imgBack=(ImageView) findViewById(R.id.title_back);
		imgEdit=(ImageView) findViewById(R.id.title_edit);
		imgBack.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				((Activity) getContext()).finish();
			}
		});
		imgEdit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
			}
		});
	}

}
