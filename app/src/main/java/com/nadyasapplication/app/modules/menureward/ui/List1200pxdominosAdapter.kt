package com.nadyasapplication.app.modules.menureward.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadyasapplication.app.R
import com.nadyasapplication.app.databinding.RowList1200pxdominosBinding
import com.nadyasapplication.app.modules.menureward.`data`.model.List1200pxdominosRowModel
import kotlin.Int
import kotlin.collections.List

class List1200pxdominosAdapter(
  var list: List<List1200pxdominosRowModel>
) : RecyclerView.Adapter<List1200pxdominosAdapter.RowList1200pxdominosVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowList1200pxdominosVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_list1200pxdominos,parent,false)
    return RowList1200pxdominosVH(view)
  }

  override fun onBindViewHolder(holder: RowList1200pxdominosVH, position: Int) {
    val list1200pxdominosRowModel = List1200pxdominosRowModel()
    // TODO uncomment following line after integration with data source
    // val list1200pxdominosRowModel = list[position]
    holder.binding.list1200pxdominosRowModel = list1200pxdominosRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<List1200pxdominosRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: List1200pxdominosRowModel
    ) {
    }
  }

  inner class RowList1200pxdominosVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowList1200pxdominosBinding = RowList1200pxdominosBinding.bind(itemView)
  }
}
