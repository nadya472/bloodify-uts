package com.nadyasapplication.app.modules.menuberitainfo.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.nadyasapplication.app.R
import com.nadyasapplication.app.appcomponents.base.BaseFragment
import com.nadyasapplication.app.databinding.FragmentMenuBeritaInfoBinding
import com.nadyasapplication.app.modules.detailinfo.ui.DetailInfoDialog
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.ListbrucemarsgjtdRowModel
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.ListfoodoneOneRowModel
import com.nadyasapplication.app.modules.menuberitainfo.`data`.viewmodel.MenuBeritaInfoVM
import com.nadyasapplication.app.modules.menuutama.ui.MenuUtamaActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuBeritaInfoFragment :
    BaseFragment<FragmentMenuBeritaInfoBinding>(R.layout.fragment_menu_berita_info) {
  private val viewModel: MenuBeritaInfoVM by viewModels<MenuBeritaInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listbrucemarsgjtdAdapter =
    ListbrucemarsgjtdAdapter(viewModel.listbrucemarsgjtdList.value?:mutableListOf())
    binding.recyclerListbrucemarsgjtd.adapter = listbrucemarsgjtdAdapter
    listbrucemarsgjtdAdapter.setOnItemClickListener(
    object : ListbrucemarsgjtdAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbrucemarsgjtdRowModel) {
        onClickRecyclerListbrucemarsgjtd(view, position, item)
      }
    }
    )
    viewModel.listbrucemarsgjtdList.observe(requireActivity()) {
      listbrucemarsgjtdAdapter.updateData(it)
    }
    val listfoodoneOneAdapter =
    ListfoodoneOneAdapter(viewModel.listfoodoneOneList.value?:mutableListOf())
    binding.recyclerListfoodoneOne.adapter = listfoodoneOneAdapter
    listfoodoneOneAdapter.setOnItemClickListener(
    object : ListfoodoneOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfoodoneOneRowModel) {
        onClickRecyclerListfoodoneOne(view, position, item)
      }
    }
    )
    viewModel.listfoodoneOneList.observe(requireActivity()) {
      listfoodoneOneAdapter.updateData(it)
    }
    binding.menuBeritaInfoVM = viewModel
    setUpSearchViewBarsearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageBackOne.setOnClickListener {
      val destIntent = MenuUtamaActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageRectangleSeventyNine.setOnClickListener {
      val destFragment = DetailInfoDialog.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, DetailInfoDialog.TAG)
    }
  }

  fun onClickRecyclerListbrucemarsgjtd(
    view: View,
    position: Int,
    item: ListbrucemarsgjtdRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListfoodoneOne(
    view: View,
    position: Int,
    item: ListfoodoneOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewBarsearchListener(): Unit {
    binding.searchViewBarsearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MENU_BERITA_INFO_FRAGMENT"


      fun getInstance(bundle: Bundle?): MenuBeritaInfoFragment {
        val fragment = MenuBeritaInfoFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
