package com.example.layoutexam.presentation.menulist

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.layoutexam.base.ViewHolderBinder
import com.example.layoutexam.data.model.Menu
import com.example.layoutexam.databinding.ItemMenuListBinding
import com.example.layoutexam.utils.toIndonesianFormat

class MenuListItemViewHolder(
    private val binding: ItemMenuListBinding,
    private val listener: OnItemClickedListener<Menu>
) : ViewHolder(binding.root), ViewHolderBinder<Menu> {
    override fun bind(item: Menu) {
        item.let {
            binding.ivMenuImage.setImageResource(it.image)
            binding.tvMenuName.text = it.name
            binding.tvMenuPrice.text = it.price.toIndonesianFormat()
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }
        }

    }
}