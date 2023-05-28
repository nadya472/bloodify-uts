package com.nadyasapplication.app.modules.kartudigital.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityKartuDigitalBinding
import com.nadyasapplication.app.modules.kartudigital.`data`.viewmodel.KartuDigitalVM
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.String
import kotlin.Unit

class KartuDigitalActivity :
    BaseActivity<ActivityKartuDigitalBinding>(R.layout.activity_kartu_digital) {
  private val viewModel: KartuDigitalVM by viewModels<KartuDigitalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kartuDigitalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageBackOne.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "KARTU_DIGITAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KartuDigitalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
