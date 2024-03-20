package com.example.layoutexam.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.layoutexam.R
import com.example.layoutexam.data.datasource.CategoryDataSource
import com.example.layoutexam.data.datasource.CategoryDataSourceImpl
import com.example.layoutexam.data.datasource.MenuDataSource
import com.example.layoutexam.data.datasource.MenuDataSourceImpl
import com.example.layoutexam.data.model.Menu
import com.example.layoutexam.databinding.FragmentHomeBinding
import com.example.layoutexam.feature.detail.DetailActivity
import com.example.layoutexam.presentation.categorylist.CategoryAdapter
import com.example.layoutexam.presentation.menulist.MenuAdapter
import com.example.layoutexam.presentation.menulist.OnItemClickedListener

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val dataSource: CategoryDataSource by lazy {
        CategoryDataSourceImpl()
    }
    private val dataSourceMenu: MenuDataSource by lazy {
        MenuDataSourceImpl()
    }
    private var adapterCategory = CategoryAdapter()
    private var adapterMenu: MenuAdapter? = null
    private var isUsingGridMode: Boolean = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListCategory()
        bindMenuList(isUsingGridMode)
        setClickActionMenu()
    }

    private fun setClickActionMenu() {
        binding.layoutListMenu.btnChangeMode.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            setButtonImage(isUsingGridMode)
            bindMenuList(isUsingGridMode)
        }
    }

    private fun setButtonImage(isUsingGrid: Boolean) {
        binding.layoutListMenu.btnChangeMode.setImageResource(if (isUsingGrid) R.drawable.ic_list else R.drawable.ic_grid)
    }

    private fun bindMenuList(isUsingGrid: Boolean) {
        val listMode = if (isUsingGrid) MenuAdapter.MODE_GRID else MenuAdapter.MODE_LIST
        adapterMenu = MenuAdapter(
            listMode = listMode,
            listener = object : OnItemClickedListener<Menu> {
                override fun onItemClicked(item: Menu) {
                    navigateToDetail(item)
                }

            }
        )
        binding.layoutListMenu.rvMenuGrid.apply {
            adapter = this@HomeFragment.adapterMenu
            layoutManager = GridLayoutManager(requireContext(), if (isUsingGridMode) 2 else 1)
        }
        adapterMenu?.insertData(dataSourceMenu.getMenuData())
    }

    private fun navigateToDetail(item: Menu) {
        DetailActivity.startActivity(requireContext(), item)
    }

    private fun setListCategory() {
        binding.rvCategory.apply {
            adapter = this@HomeFragment.adapterCategory
        }
        adapterCategory.insertData(dataSource.getCategoryData())
    }

}