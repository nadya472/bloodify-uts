package com.nadyasapplication.app.modules.menujadwal.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseFragment
import com.nadyasapplication.app.databinding.FragmentMenuJadwalBinding
import com.nadyasapplication.app.modules.menujadwal.`data`.model.SpinnerBarsearchModel
import com.nadyasapplication.app.modules.menujadwal.`data`.viewmodel.MenuJadwalVM
import kotlin.String
import kotlin.Unit

class MenuJadwalFragment : BaseFragment<FragmentMenuJadwalBinding>(R.layout.fragment_menu_jadwal) {
  private val viewModel: MenuJadwalVM by viewModels<MenuJadwalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerBarsearchList.value = mutableListOf(
    SpinnerBarsearchModel("Item1"),
    SpinnerBarsearchModel("Item2"),
    SpinnerBarsearchModel("Item3"),
    SpinnerBarsearchModel("Item4"),
    SpinnerBarsearchModel("Item5")
    )
    val spinnerBarsearchAdapter =
    SpinnerBarsearchAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerBarsearchList.value?:
    mutableListOf())
    binding.spinnerBarsearch.adapter = spinnerBarsearchAdapter
    binding.menuJadwalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_JADWAL_FRAGMENT"


    fun getInstance(bundle: Bundle?): MenuJadwalFragment {
      val fragment = MenuJadwalFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
