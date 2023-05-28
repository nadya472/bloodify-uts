package com.nadyasapplication.app.modules.getstartedfive.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityGetStartedFiveBinding
import com.nadyasapplication.app.modules.getstartedfive.`data`.viewmodel.GetStartedFiveVM
import com.nadyasapplication.app.modules.getstartedtwo.ui.GetStartedTwoActivity
import kotlin.String
import kotlin.Unit

class GetStartedFiveActivity :
    BaseActivity<ActivityGetStartedFiveBinding>(R.layout.activity_get_started_five) {
  private val viewModel: GetStartedFiveVM by viewModels<GetStartedFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedFiveVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = GetStartedTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.linearIPhone82.setOnClickListener {
        val destIntent = GetStartedTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "GET_STARTED_FIVE_ACTIVITY"

    }
  }
