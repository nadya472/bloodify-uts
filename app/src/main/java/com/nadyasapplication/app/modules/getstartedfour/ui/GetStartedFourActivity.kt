package com.nadyasapplication.app.modules.getstartedfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityGetStartedFourBinding
import com.nadyasapplication.app.modules.getstartedfour.`data`.viewmodel.GetStartedFourVM
import com.nadyasapplication.app.modules.halamanlogin.ui.HalamanLoginActivity
import com.nadyasapplication.app.modules.halamanregistrasi.ui.HalamanRegistrasiActivity
import kotlin.String
import kotlin.Unit

class GetStartedFourActivity :
    BaseActivity<ActivityGetStartedFourBinding>(R.layout.activity_get_started_four) {
  private val viewModel: GetStartedFourVM by viewModels<GetStartedFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDaftar.setOnClickListener {
      val destIntent = HalamanRegistrasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogin.setOnClickListener {
      val destIntent = HalamanLoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "GET_STARTED_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GetStartedFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
