package com.nadyasapplication.app.modules.halamanlogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityHalamanLoginBinding
import com.nadyasapplication.app.modules.getstartedfour.ui.GetStartedFourActivity
import com.nadyasapplication.app.modules.halamanlogin.`data`.viewmodel.HalamanLoginVM
import com.nadyasapplication.app.modules.halamanregistrasi.ui.HalamanRegistrasiActivity
import com.nadyasapplication.app.modules.lupapassword.ui.LupaPasswordActivity
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.String
import kotlin.Unit

class HalamanLoginActivity :
    BaseActivity<ActivityHalamanLoginBinding>(R.layout.activity_halaman_login) {
  private val viewModel: HalamanLoginVM by viewModels<HalamanLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.halamanLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtDaftar.setOnClickListener {
      val destIntent = HalamanRegistrasiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLupakatasandi.setOnClickListener {
      val destIntent = LupaPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMasuk.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageBackOne.setOnClickListener {
      val destIntent = GetStartedFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HALAMAN_LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HalamanLoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
