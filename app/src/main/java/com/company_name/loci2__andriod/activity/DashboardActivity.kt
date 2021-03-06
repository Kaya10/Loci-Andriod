/*
*  DashboardActivity.kt
*  Loci2  Andriod
*
*  Created by Kaya.
*  Copyright © 2018 Mpulse Media. All rights reserved.
*/

package com.company_name.loci2__andriod.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.company_name.loci2__andriod.R


class DashboardActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, DashboardActivity::class.java)
		}
	}
	
	private lateinit var continueButton: Button
	private lateinit var continueTwoButton: Button
	private lateinit var continueThreeButton: Button
	private lateinit var continueFourButton: Button
	private lateinit var group2774Button: Button
	private lateinit var iconAwesomeSearchButton: ImageButton
	private lateinit var iconIonicMdFootbaButton: ImageButton
	private lateinit var iconMaterialMessagButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.dashboard_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Continue component
		continueButton = this.findViewById(R.id.continue_button)
		continueButton.setOnClickListener({ view ->
			this.onContinuePressed()
		})
		
		// Configure Continue component
		continueTwoButton = this.findViewById(R.id.continue_two_button)
		continueTwoButton.setOnClickListener({ view ->
			this.onContinueTwoPressed()
		})
		
		// Configure Continue component
		continueThreeButton = this.findViewById(R.id.continue_three_button)
		continueThreeButton.setOnClickListener({ view ->
			this.onContinueThreePressed()
		})
		
		// Configure Continue component
		continueFourButton = this.findViewById(R.id.continue_four_button)
		continueFourButton.setOnClickListener({ view ->
			this.onContinueFourPressed()
		})
		
		// Configure Group 2774 component
		group2774Button = this.findViewById(R.id.group2774_button)
		group2774Button.setOnClickListener({ view ->
			this.onGroup2774Pressed()
		})
		
		// Configure Icon awesome-search component
		iconAwesomeSearchButton = this.findViewById(R.id.icon_awesome_search_button)
		iconAwesomeSearchButton.setOnClickListener({ view ->
			this.onIconAwesomeSearchPressed()
		})
		
		// Configure Icon ionic-md-footba component
		iconIonicMdFootbaButton = this.findViewById(R.id.icon_ionic_md_footba_button)
		iconIonicMdFootbaButton.setOnClickListener({ view ->
			this.onIconIonicMdFootbaPressed()
		})
		
		// Configure Icon material-messag component
		iconMaterialMessagButton = this.findViewById(R.id.icon_material_messag_button)
		iconMaterialMessagButton.setOnClickListener({ view ->
			this.onIconMaterialMessagPressed()
		})
	}
	
	fun onContinuePressed() {
	
		this.startCreateAGameActivity()
	}
	
	fun onContinueTwoPressed() {
	
		this.startJoinAGameActivity()
	}
	
	fun onContinueThreePressed() {
	
		this.startMessaging2Activity()
	}
	
	fun onContinueFourPressed() {
	
		this.startUpcomingGamesActivity()
	}
	
	fun onGroup2774Pressed() {
	
		this.startOpeningActivity()
	}
	
	fun onIconAwesomeSearchPressed() {
	
		this.startJoinAGameActivity()
	}
	
	fun onIconIonicMdFootbaPressed() {
	
		this.startMyGamesActivity()
	}
	
	fun onIconMaterialMessagPressed() {
	
		this.startMessagesActivity()
	}
	
	private fun startMessaging2Activity() {
	
		this.startActivity(Messaging2Activity.newIntent(this))
	}
	
	private fun startOpeningActivity() {
	
		this.startActivity(OpeningActivity.newIntent(this))
	}
	
	private fun startJoinAGameActivity() {
	
		this.startActivity(JoinAGameActivity.newIntent(this))
	}
	
	private fun startMyGamesActivity() {
	
		this.startActivity(MyGamesActivity.newIntent(this))
	}
	
	private fun startMessagesActivity() {
	
		this.startActivity(MessagesActivity.newIntent(this))
	}
	
	private fun startCreateAGameActivity() {
	
		this.startActivity(CreateAGameActivity.newIntent(this))
	}
	
	private fun startUpcomingGamesActivity() {
	
		this.startActivity(UpcomingGamesActivity.newIntent(this))
	}
}
