package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"xxZzGWzb4ybB2aKB0HYuRonPoCWkagkFwfxno6cZ", //apllication ID
	    	"lO6wJQX0ub79Ku8crGX5KliM5LzliclIVpZ1hsqu");//apllication key
	}
}
