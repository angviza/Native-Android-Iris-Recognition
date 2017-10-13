package com.example.richard.nativeandroidopencv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

/**
 * Created by Richard on 2017/10/13.
 */

public class InputNameRegisterActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_register_name);
	}

	public void buttonOKClicked(View view)
	{
		Intent getCameraRegisterScreen = new Intent(this, CameraRegisterActivity.class);
		EditText nameInput = (EditText) findViewById(R.id.nameInputField);
		String name = nameInput.getText().toString();
		getCameraRegisterScreen.putExtra("sendingName", name);
		final int result = 1;
		startActivityForResult(getCameraRegisterScreen, result);
		finish();
	}
}
