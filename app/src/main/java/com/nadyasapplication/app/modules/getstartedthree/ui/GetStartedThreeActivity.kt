package com.nadyasapplication.app.modules.getstartedthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityGetStartedThreeBinding
import com.nadyasapplication.app.modules.getstartedfour.ui.GetStartedFourActivity
import com.nadyasapplication.app.modules.getstartedthree.`data`.viewmodel.GetStartedThreeVM
import kotlin.String
import kotlin.Unit

class GetStartedThreeActivity :
    BaseActivity<ActivityGetStartedThreeBinding>(R.layout.activity_get_started_three) {
  private val viewModel: GetStartedThreeVM by viewModels<GetStartedThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearIPhone82.setOnClickListener {
      val destIntent = GetStartedFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GET_STARTED_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GetStartedThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
