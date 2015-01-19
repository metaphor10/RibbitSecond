package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;
import com.teamtreehouse.ribbit.Utils.ParseConstants;
import com.teamtreehouse.ribbit.ui.MainActivity;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"xxZzGWzb4ybB2aKB0HYuRonPoCWkagkFwfxno6cZ", //apllication ID
	    	"lO6wJQX0ub79Ku8crGX5KliM5LzliclIVpZ1hsqu");//apllication key

        PushService.setDefaultPushCallback(this, MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
        //ParseAnalytics.trackAppOpened(getIntent());

	}
    public static void updateParseInstallation(ParseUser user){
            ParseInstallation installation=ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID,user.getObjectId());
        installation.saveInBackground();
    }
}
