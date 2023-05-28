package com.nadyasapplication.app.modules.menuprofil.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseFragment
import com.nadyasapplication.app.databinding.FragmentMenuProfilBinding
import com.nadyasapplication.app.modules.detailprofil.ui.DetailProfilActivity
import com.nadyasapplication.app.modules.getstartedfour.ui.GetStartedFourActivity
import com.nadyasapplication.app.modules.menuprofil.`data`.viewmodel.MenuProfilVM
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.String
import kotlin.Unit

class MenuProfilFragment : BaseFragment<FragmentMenuProfilBinding>(R.layout.fragment_menu_profil) {
  private val viewModel: MenuProfilVM by viewModels<MenuProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.menuProfilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = GetStartedFourActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageBackOne.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtDetailProfil.setOnClickListener {
      val destIntent = DetailProfilActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "MENU_PROFIL_FRAGMENT"


    fun getInstance(bundle: Bundle?): MenuProfilFragment {
      val fragment = MenuProfilFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
