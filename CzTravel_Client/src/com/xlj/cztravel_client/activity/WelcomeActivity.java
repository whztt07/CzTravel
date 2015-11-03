package com.xlj.cztravel_client.activity;

import com.xlj.cztravel_client.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class WelcomeActivity extends BaseActivity
{
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcomeactivity);
	}
}
