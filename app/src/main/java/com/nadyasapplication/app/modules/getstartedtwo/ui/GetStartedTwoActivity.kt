package com.nadyasapplication.app.modules.getstartedtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityGetStartedTwoBinding
import com.nadyasapplication.app.modules.getstartedthree.ui.GetStartedThreeActivity
import com.nadyasapplication.app.modules.getstartedtwo.`data`.viewmodel.GetStartedTwoVM
import kotlin.String
import kotlin.Unit

class GetStartedTwoActivity :
    BaseActivity<ActivityGetStartedTwoBinding>(R.layout.activity_get_started_two) {
  private val viewModel: GetStartedTwoVM by viewModels<GetStartedTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone82.setOnClickListener {
      val destIntent = GetStartedThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GET_STARTED_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GetStartedTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
