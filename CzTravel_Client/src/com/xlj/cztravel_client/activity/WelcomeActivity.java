package com.xlj.cztravel_client.activity;

import com.xlj.cztravel_client.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class WelcomeActivity extends BaseActivity
{
	private AlphaAnimation mStartAnim;
	private View mView;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		//		WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		//setContentView(R.layout.welcomeactivity);		
		mView = View.inflate(this, R.layout.welcomeactivity, null);
		setContentView(mView);
				
		startAnim();
	}
	
	private void startAnim()
	{
		mStartAnim = new AlphaAnimation(0.5f, 1.0f);
		mStartAnim.setDuration(2000);
		mView.startAnimation(mStartAnim);
		
		mStartAnim.setAnimationListener(new AnimationListener()
		{	
			@Override
			public void onAnimationStart(Animation arg0) 
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation arg0) 
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationEnd(Animation arg0)
			{
				// TODO Auto-generated method stub
				jumpActivity();
			}
		});
	}
	
	// 跳转界面 ...
	private void jumpActivity()
	{
		startActivity(new Intent(getApplicationContext(), MainActivity.class));
		finish();
	}
}


