package com.nadyasapplication.app.modules.lupapassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseActivity
import com.nadyasapplication.app.databinding.ActivityLupaPasswordBinding
import com.nadyasapplication.app.modules.lupapassword.`data`.viewmodel.LupaPasswordVM
import com.nadyasapplication.app.modules.passwordbaruterkirim.ui.PasswordBaruTerkirimActivity
import kotlin.String
import kotlin.Unit

class LupaPasswordActivity :
    BaseActivity<ActivityLupaPasswordBinding>(R.layout.activity_lupa_password) {
  private val viewModel: LupaPasswordVM by viewModels<LupaPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lupaPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUbah.setOnClickListener {
      val destIntent = PasswordBaruTerkirimActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LUPA_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LupaPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
