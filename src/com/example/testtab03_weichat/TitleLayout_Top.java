package com.example.testtab03_weichat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class TitleLayout_Top extends LinearLayout {
	private ImageView imgMore;
	private ImageView imgSearch;

	public TitleLayout_Top(Context context, AttributeSet attrs) {
		super(context, attrs);

		LayoutInflater.from(context).inflate(R.layout.top, this);
		
		imgMore=(ImageView) findViewById(R.id.more);
		imgSearch=(ImageView) findViewById(R.id.search);
		
		imgMore.setOnClickListener(new OnClickListener() {
			@SuppressLint("NewApi") public void onClick(View v) {
				Intent intent=new Intent(getContext(), SearchActivity.class);
				
			}
		});
		imgSearch.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
			}
		});
	}

}
