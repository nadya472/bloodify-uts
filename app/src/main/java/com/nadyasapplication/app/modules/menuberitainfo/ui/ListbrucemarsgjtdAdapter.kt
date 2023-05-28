package com.nadyasapplication.app.modules.menuberitainfo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nadyasapplication.app.R
import com.nadyasapplication.app.databinding.RowListbrucemarsgjtdBinding
import com.nadyasapplication.app.modules.menuberitainfo.`data`.model.ListbrucemarsgjtdRowModel
import kotlin.Int
import kotlin.collections.List

class ListbrucemarsgjtdAdapter(
  var list: List<ListbrucemarsgjtdRowModel>
) : RecyclerView.Adapter<ListbrucemarsgjtdAdapter.RowListbrucemarsgjtdVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbrucemarsgjtdVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbrucemarsgjtd,parent,false)
    return RowListbrucemarsgjtdVH(view)
  }

  override fun onBindViewHolder(holder: RowListbrucemarsgjtdVH, position: Int) {
    val listbrucemarsgjtdRowModel = ListbrucemarsgjtdRowModel()
    // TODO uncomment following line after integration with data source
    // val listbrucemarsgjtdRowModel = list[position]
    holder.binding.listbrucemarsgjtdRowModel = listbrucemarsgjtdRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbrucemarsgjtdRowModel>) {
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
      item: ListbrucemarsgjtdRowModel
    ) {
    }
  }

  inner class RowListbrucemarsgjtdVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbrucemarsgjtdBinding = RowListbrucemarsgjtdBinding.bind(itemView)
  }
}
