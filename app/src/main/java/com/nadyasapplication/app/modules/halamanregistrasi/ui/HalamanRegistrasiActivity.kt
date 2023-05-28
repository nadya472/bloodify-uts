package com.nadyasapplication.app.modules.halamanregistrasi.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityHalamanRegistrasiBinding
import com.nadyasapplication.app.modules.getstartedfour.ui.GetStartedFourActivity
import com.nadyasapplication.app.modules.halamanlogin.ui.HalamanLoginActivity
import com.nadyasapplication.app.modules.halamanregistrasi.`data`.viewmodel.HalamanRegistrasiVM
import com.nadyasapplication.app.modules.tipegoldar.ui.TipeGoldarActivity
import kotlin.String
import kotlin.Unit

class HalamanRegistrasiActivity :
    BaseActivity<ActivityHalamanRegistrasiBinding>(R.layout.activity_halaman_registrasi) {
  private val viewModel: HalamanRegistrasiVM by viewModels<HalamanRegistrasiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.halamanRegistrasiVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBergabung.setOnClickListener {
      val destIntent = TipeGoldarActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBackOne.setOnClickListener {
      val destIntent = GetStartedFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtMasuk.setOnClickListener {
      val destIntent = HalamanLoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HALAMAN_REGISTRASI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HalamanRegistrasiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
