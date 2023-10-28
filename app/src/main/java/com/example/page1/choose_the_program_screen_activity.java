
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		choose_the_program_screen
	 *	@date 		Saturday 28th of October 2023 12:00:12 AM
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

public class choose_the_program_screen_activity extends Activity {

	
	private View _bg__choose_the_program_screen_ek2;
	private View rectangle134;
	private View _bg__searchbar8_ek1;
	private View rectangle33;
	private ImageView screen14;
	private ImageView setting28;
	private ImageView home18;
	private ImageView star18;
	private ImageView user18;
	private ImageView line48;
	private View _bg__return88_ek1;
	private TextView choose_the_program;
	private ImageView reformer21;
	private ImageView image2;
	private View _bg__button33_ek1;
	private View rectangle54;
	private TextView on_mat;
	private View _bg__button15_ek1;
	private View rectangle334;
	private TextView on_studio_equipment;

	private Animation rot;
	private Animation rot2;

	private ImageButton Btn;
	private ImageButton Btn2;

	private Animation rot_u;

	private ImageButton Btn3;
	private ImageButton Btn4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_the_program_screen);

		Btn = (ImageButton) findViewById(R.id.home18);
		Btn2 = (ImageButton) findViewById(R.id.screen14);
		Btn3 = (ImageButton) findViewById(R.id.rectangle54);
		Btn4 = (ImageButton) findViewById(R.id.rectangle334);
		rot = AnimationUtils.loadAnimation(this, R.anim.zoom);
		rot2 = AnimationUtils.loadAnimation(this, R.anim.blind);
		rot_u = AnimationUtils.loadAnimation(this, R.anim.blind);

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

		Btn3.setOnClickListener(new View.OnClickListener() {
								   @Override
								   public void onClick(View v) {
									   Btn3.startAnimation(rot_u);

								   }
							   }
		);

		Btn4.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View v) {
										Btn4.startAnimation(rot_u);

									}
								}
		);
		
		//_bg__choose_the_program_screen_ek2 = (View) findViewById(R.id._bg__choose_the_program_screen_ek2);
		rectangle134 = (View) findViewById(R.id.rectangle134);
		//_bg__searchbar8_ek1 = (View) findViewById(R.id._bg__searchbar8_ek1);
		//rectangle33 = (View) findViewById(R.id.rectangle33);
		screen14 = (ImageView) findViewById(R.id.screen14);
		setting28 = (ImageView) findViewById(R.id.setting28);
		home18 = (ImageView) findViewById(R.id.home18);
		//star18 = (ImageView) findViewById(R.id.star18);
		user18 = (ImageView) findViewById(R.id.user18);
		line48 = (ImageView) findViewById(R.id.line48);
		//_bg__return88_ek1 = (View) findViewById(R.id._bg__return88_ek1);
		choose_the_program = (TextView) findViewById(R.id.choose_the_program);
		reformer21 = (ImageView) findViewById(R.id.reformer21);
		image2 = (ImageView) findViewById(R.id.image2);
		//_bg__button33_ek1 = (View) findViewById(R.id._bg__button33_ek1);
		rectangle54 = (View) findViewById(R.id.rectangle54);
		on_mat = (TextView) findViewById(R.id.on_mat);
		//_bg__button15_ek1 = (View) findViewById(R.id._bg__button15_ek1);
		rectangle334 = (View) findViewById(R.id.rectangle334);
		on_studio_equipment = (TextView) findViewById(R.id.on_studio_equipment);
	
		
		//custom code goes here

		rot.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(choose_the_program_screen_activity.this, main_form_copy_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});

		rot2.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(choose_the_program_screen_activity.this, streaming_video_screen_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});

		rot_u.setAnimationListener(new Animation.AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				Intent intent = new Intent(choose_the_program_screen_activity.this, streaming_video_screen_activity.class);
				startActivity(intent);


			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
		});


	}
}
	
	