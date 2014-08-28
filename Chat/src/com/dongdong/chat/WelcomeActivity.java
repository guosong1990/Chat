package com.dongdong.chat;

import cn.adsofts.AppTools;
import cn.waps.AppConnect;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class WelcomeActivity extends Activity{
	String showad = "no";
	public static boolean isAd = false; 
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		//以下是广告代码
		AppTools.getInstance("0c0dfb12dbce879fb3fb30c6ef0da8ec","default",this);	
		//在初始化账号之后，紧接着添加以下代码绑定已注册Activity
		AppTools.getInstance(this).setDetailClassName("com.dongdong.ad.MydetailView");
		
		AppConnect.getInstance(this);
		
		String showad = AppConnect.getInstance(this).getConfig("showad", "no");
		//if(showad)
	}
	
    public void welcome_login(View v) {  
      	Intent intent = new Intent();
		intent.setClass(WelcomeActivity.this, ChatTestActivity.class);
		startActivity(intent);
      }  
    
    public void welcome_exit(View view){
		this.finish();
		AppTools.getInstance(this).close(); // 原finalize()方法名修改为close()
		AppConnect.getInstance(this).close();
		System.exit(0);
    }
}
