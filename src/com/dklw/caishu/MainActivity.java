package com.dklw.caishu;

import java.util.Random;

import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	int rand;

	// startGame
	public void startGame(View view) {
		EditText num1et = (EditText) findViewById(R.id.num1);
		EditText num2et = (EditText) findViewById(R.id.num2);
		int num1 = Integer.parseInt(num1et.getText().toString());
		int num2 = Integer.parseInt(num2et.getText().toString());

		if (num1 > num2) {
			Toast.makeText(this, "第一个数字必须小于第一个", 1).show();
		} else {

			rand = new Random().nextInt(num2 - num1) + num1;
			System.out.println(rand);

		}

	}

	public void submit(View view) {
		EditText aim = (EditText) findViewById(R.id.num3);
		int content = Integer.parseInt(aim.getText().toString());

		if (content == rand) {
			Toast.makeText(this, "恭喜你 ", 1).show();
		} else if (content < rand) {
			Toast.makeText(this, "小了 ", 1).show();
		} else {
			Toast.makeText(this, "大了 ", 1).show();
		}

	}

}
