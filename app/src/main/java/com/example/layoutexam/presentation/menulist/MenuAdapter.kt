package com.example.layoutexam.presentation.menulist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.layoutexam.base.ViewHolderBinder
import com.example.layoutexam.data.model.Menu
import com.example.layoutexam.databinding.ItemMenuBinding
import com.example.layoutexam.databinding.ItemMenuListBinding

class MenuAdapter(
    private val listener: OnItemClickedListener<Menu>,
    private val listMode: Int = MODE_GRID
) : RecyclerView.Adapter<ViewHolder>() {

    companion object {
        const val MODE_LIST = 0
        const val MODE_GRID = 1
    }

    private var asyncDataDiffer = AsyncListDiffer(
        this, object : DiffUtil.ItemCallback<Menu>() {
            override fun areItemsTheSame(oldItem: Menu, newItem: Menu): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Menu, newItem: Menu): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

        }
    )

    fun insertData(items: List<Menu>) {
        asyncDataDiffer.submitList(items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (listMode == MODE_GRID) MenuGridItemViewHolder(
            ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), listener
        ) else {
            MenuListItemViewHolder(
                ItemMenuListBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent, false
                ), listener
            )
        }
    }

    override fun getItemCount(): Int = asyncDataDiffer.currentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (holder !is ViewHolderBinder<*>) return
        (holder as ViewHolderBinder<*>).bind(asyncDataDiffer.currentList[position])
    }


}

interface OnItemClickedListener<params> {
    fun onItemClicked(item: params)
}