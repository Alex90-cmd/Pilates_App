
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		main_form_copy
	 *	@date 		Friday 27th of October 2023 12:49:37 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.page1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;

public class main_form_copy_activity extends Activity {

	
	private View rectangle_2aa;
	private View _bg__headeraa_ek1;
	private View rectangle_1as;
	private View _bg__textss_ek1;
	private TextView good_morningss__aleksandra_;
	private TextView what_wouldss_you_like_to_do_today_;
	private View _bg__subheading2ss_ek1;
	private TextView my_favouritesss;
	private TextView see_allss;
	private View _bg__subheadingvv_ek1;
	private TextView pilates_for_better_lifevv;
	private TextView see_allvv;
	private View _bg__statusvv_ek1;
	private ImageView empty_battery_1vv;
	private ImageView signal_status_1vv;
	private ImageView wifi_1vv;
	private TextView _11_00vv;
	private View _bg__gallery_1bb_ek1;
	private ImageView reformer_1_1bb;
	private ImageView pilates_1_1bb;
	private ImageView image_6bb;
	private ImageView image_7bb;
	private ImageView image_8bb;
	private View _bg__gallery2bb_ek1;
	private ImageView reformer;
	private ImageView pilates1;
	private ImageView image9bb;
	private ImageView image10bb;
	private ImageView image1bb;
	private ImageView image12bb;
	private View _bg__aaa_ek1;
	private View rectangle_3dd;
	private ImageView _______1dd;
	private ImageView setting_2dd;
	private ImageView home_1dd;
	private ImageView star_1dd;
	private ImageView user_1dd;
	private ImageView line_1dd;

	private Animation rot;

	private ImageButton Btn;

	private Animation rot3;

	private ImageButton Btn3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_form_copy);
		Btn = (ImageButton) findViewById(R.id._______1dd);
		rot = AnimationUtils.loadAnimation(this, R.anim.blind);

		Btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			Btn.startAnimation(rot);

			}
		}
		);

		Btn3 = (ImageButton) findViewById(R.id.setting_2dd);
		rot3 = AnimationUtils.loadAnimation(this, R.anim.rotate);

		Btn3.setOnClickListener(new View.OnClickListener() {
								   @Override
								   public void onClick(View v) {
									   Btn3.startAnimation(rot3);

								   }
							   }
		);

		rectangle_2aa = (View) findViewById(R.id.rectangle_2aa);
		_bg__headeraa_ek1 = (View) findViewById(R.id._bg__headeraa_ek1);
		rectangle_1as = (View) findViewById(R.id.rectangle_1as);
		//_bg__textss_ek1 = (View) findViewById(R.id._bg__textss_ek1);
		good_morningss__aleksandra_ = (TextView) findViewById(R.id.good_morningss__aleksandra_);
		what_wouldss_you_like_to_do_today_ = (TextView) findViewById(R.id.what_wouldss_you_like_to_do_today_);
		//_bg__subheading2ss_ek1 = (View) findViewById(R.id._bg__subheading2ss_ek1);
		my_favouritesss = (TextView) findViewById(R.id.my_favouritesss);
		see_allss = (TextView) findViewById(R.id.see_allss);
		//_bg__subheadingvv_ek1 = (View) findViewById(R.id._bg__subheadingvv_ek1);
		pilates_for_better_lifevv = (TextView) findViewById(R.id.pilates_for_better_lifevv);
		see_allvv = (TextView) findViewById(R.id.see_allvv);
		//_bg__statusvv_ek1 = (View) findViewById(R.id._bg__statusvv_ek1);
		//empty_battery_1vv = (ImageView) findViewById(R.id.empty_battery_1vv);
		//signal_status_1vv = (ImageView) findViewById(R.id.signal_status_1vv);
		//wifi_1vv = (ImageView) findViewById(R.id.wifi_1vv);
		//_11_00vv = (TextView) findViewById(R.id._11_00vv);
		//_bg__gallery_1bb_ek1 = (View) findViewById(R.id._bg__gallery_1bb_ek1);
		//reformer_1_1bb = (ImageView) findViewById(R.id.reformer_1_1bb);
		//pilates_1_1bb = (ImageView) findViewById(R.id.pilates_1_1bb);
		//image_6bb = (ImageView) findViewById(R.id.image_6bb);
		image_7bb = (ImageView) findViewById(R.id.image_7bb);
		image_8bb = (ImageView) findViewById(R.id.image_8bb);
		//_bg__gallery2bb_ek1 = (View) findViewById(R.id._bg__gallery2bb_ek1);
		//reformer = (ImageView) findViewById(R.id.reformer);
		//pilates1 = (ImageView) findViewById(R.id.pilates1);
		//image9bb = (ImageView) findViewById(R.id.image9bb);
		//image10bb = (ImageView) findViewById(R.id.image10bb);
		image1bb = (ImageView) findViewById(R.id.image1bb);
		image12bb = (ImageView) findViewById(R.id.image12bb);
		//_bg__aaa_ek1 = (View) findViewById(R.id._bg__aaa_ek1);
		//rectangle_3dd = (View) findViewById(R.id.rectangle_3dd);
		_______1dd = (ImageView) findViewById(R.id._______1dd);
		setting_2dd = (ImageView) findViewById(R.id.setting_2dd);
		home_1dd = (ImageView) findViewById(R.id.home_1dd);
		star_1dd = (ImageView) findViewById(R.id.star_1dd);
		user_1dd = (ImageView) findViewById(R.id.user_1dd);
		line_1dd = (ImageView) findViewById(R.id.line_1dd);
	
		
		//custom code goes here
		rot.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(main_form_copy_activity.this, streaming_video_screen_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});

		rot3.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(main_form_copy_activity.this, choose_the_program_screen_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});
	}


	public void BtnCLICK(View v){
	Intent intent = new Intent(this,streaming_video_screen_activity.class);
	startActivity(intent);
	}


}
	
	