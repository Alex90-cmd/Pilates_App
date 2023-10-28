
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		streaming_video_screen
	 *	@date 		Friday 27th of October 2023 05:56:20 AM
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
import android.widget.ImageView;
import android.widget.TextView;

public class streaming_video_screen_activity extends Activity {

	
	private View rectangle15;
	private View _bg__searchbar_ek1;
	private View rectangle3;
	private ImageView ______1;
	private ImageView setting2;
	private ImageView home1;
	private ImageView star1;
	private ImageView user1;
	private ImageView line5;
	private View _bg__sign_up_button_ek1;
	private View rectangle9;
	private TextView done;
	private TextView description_of_the_training__from_a_supine_position__lying_on_your_back__with_bent_knees__press_your_feet_into_the_floor_and_lift_your_hips__initially__you_can_hold_the_positions_to_build_isometric_strength__over_time__lift_on_the_exhalation_and_lower_your_hips_on_the_inhalation_;
	private View rectangle17;
	private View _bg__youtube_sign_ek1;
	private View rectangle18;
	private ImageView polygon1;

	private Animation rot;
	private Animation rot2;
	private Animation rot4;
	private ImageButton Btn;
	private ImageButton Btn2;
	private ImageButton Btn4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.streaming_video_screen);
		Btn2 = (ImageButton) findViewById(R.id.rectangle18);
		Btn = (ImageButton) findViewById(R.id.home1);
		Btn4 = (ImageButton) findViewById(R.id.setting2);
		rot = AnimationUtils.loadAnimation(this, R.anim.zoom);
		rot2 = AnimationUtils.loadAnimation(this, R.anim.blind);
		rot4 = AnimationUtils.loadAnimation(this, R.anim.rotate);
		Btn.setOnClickListener(new View.OnClickListener() {
								   @Override
								   public void onClick(View v) {
									   Btn.startAnimation(rot);

								   }
							   }
		);
		Btn2.setOnClickListener(new View.OnClickListener() {
								   @Override
								   public void onClick(View v) {
									   Btn2.startAnimation(rot2);

								   }
							   }
		);

		Btn4.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Btn4.startAnimation(rot4);

									}
								}
		);
		rectangle15 = (View) findViewById(R.id.rectangle15);
		//_bg__searchbar_ek1 = (View) findViewById(R.id._bg__searchbar_ek1);
		//rectangle3 = (View) findViewById(R.id.rectangle3);
		______1 = (ImageView) findViewById(R.id.______1);
		setting2 = (ImageView) findViewById(R.id.setting2);
		home1 = (ImageView) findViewById(R.id.home1);
		star1 = (ImageView) findViewById(R.id.star1);
		user1 = (ImageView) findViewById(R.id.user1);
		line5 = (ImageView) findViewById(R.id.line5);
		//_bg__sign_up_button_ek1 = (View) findViewById(R.id._bg__sign_up_button_ek1);
		rectangle9 = (View) findViewById(R.id.rectangle9);
		done = (TextView) findViewById(R.id.done);
		description_of_the_training__from_a_supine_position__lying_on_your_back__with_bent_knees__press_your_feet_into_the_floor_and_lift_your_hips__initially__you_can_hold_the_positions_to_build_isometric_strength__over_time__lift_on_the_exhalation_and_lower_your_hips_on_the_inhalation_ = (TextView) findViewById(R.id.description_of_the_training__from_a_supine_position__lying_on_your_back__with_bent_knees__press_your_feet_into_the_floor_and_lift_your_hips__initially__you_can_hold_the_positions_to_build_isometric_strength__over_time__lift_on_the_exhalation_and_lower_your_hips_on_the_inhalation_);
		rectangle17 = (View) findViewById(R.id.rectangle17);
		//_bg__youtube_sign_ek1 = (View) findViewById(R.id._bg__youtube_sign_ek1);
		rectangle18 = (View) findViewById(R.id.rectangle18);
		polygon1 = (ImageView) findViewById(R.id.polygon1);
	
		
		//custom code goes here
		rot4.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(streaming_video_screen_activity.this, choose_the_program_screen_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});

		rot.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(streaming_video_screen_activity.this, main_form_copy_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});
	
	}
	public void BtnCLICK_BACK(View v){
		Intent intent = new Intent(this, main_form_copy_activity.class);
		startActivity(intent);
	}
}
	
	