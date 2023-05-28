package com.nadyasapplication.app.modules.detailinfo.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseDialogFragment
import com.nadyasapplication.app.databinding.DialogDetailInfoBinding
import com.nadyasapplication.app.modules.detailinfo.`data`.viewmodel.DetailInfoVM
import kotlin.String
import kotlin.Unit

class DetailInfoDialog : BaseDialogFragment<DialogDetailInfoBinding>(R.layout.dialog_detail_info) {
  private val viewModel: DetailInfoVM by viewModels<DetailInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.detailInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DETAIL_INFO_DIALOG"


    fun getInstance(bundle: Bundle?): DetailInfoDialog {
      val fragment = DetailInfoDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
