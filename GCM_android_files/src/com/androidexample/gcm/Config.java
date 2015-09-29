package com.androidexample.gcm;

public interface Config {

	//AIzaSyAv1w7afEobBKxipoorli3dBXHt8557DIE
	// CONSTANTS
	static final String YOUR_SERVER_URL =  "http://192.168.2.16/gcm_server_files/register.php";
	// YOUR_SERVER_URL : Server url where you have placed your server files
    // Google project id
    static final String GOOGLE_SENDER_ID = "588849090142";  // Place here your Google project id

    /**
     * Tag used on log messages.
     */
    static final String TAG = "GCM Android";

    static final String DISPLAY_MESSAGE_ACTION = "com.androidexample.gcm.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";
		
	
}
