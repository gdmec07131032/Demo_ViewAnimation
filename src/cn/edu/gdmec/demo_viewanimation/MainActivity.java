package cn.edu.gdmec.demo_viewanimation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private TextView mytv;
	private Button btnAlpha, btnTranslate, btnScale, btnRotate, btnAll;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mytv = (TextView) findViewById(R.id.textView1);
		btnAlpha = (Button) findViewById(R.id.button1);
		btnTranslate = (Button) findViewById(R.id.button2);
		btnScale = (Button) findViewById(R.id.button3);
		btnRotate = (Button) findViewById(R.id.button4);
		btnAll = (Button) findViewById(R.id.button5);

		btnAlpha.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Animation animation = AnimationUtils.loadAnimation(
						MainActivity.this, R.anim.alpha_animation);
				mytv.startAnimation(animation);
			}
		});

		btnTranslate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Animation animation = AnimationUtils.loadAnimation(
						MainActivity.this, R.anim.translate_animation);
				mytv.startAnimation(animation);
			}
		});

		btnScale.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Animation animation = AnimationUtils.loadAnimation(
						MainActivity.this, R.anim.scale_animation);
				mytv.startAnimation(animation);
			}
		});

		btnRotate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Animation animation = AnimationUtils.loadAnimation(
						MainActivity.this, R.anim.rotate_animation);
				mytv.startAnimation(animation);
			}
		});

		btnAll.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Animation animation = AnimationUtils.loadAnimation(
						MainActivity.this, R.anim.all_animation);
				mytv.startAnimation(animation);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
