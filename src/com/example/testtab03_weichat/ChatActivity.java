package com.example.testtab03_weichat;

import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ChatActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_chat);
		
	}

}
