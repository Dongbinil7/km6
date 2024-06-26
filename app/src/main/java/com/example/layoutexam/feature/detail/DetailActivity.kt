package com.example.layoutexam.feature.detail

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutexam.data.model.Menu
import com.example.layoutexam.databinding.ActivityDetailBinding
import com.example.layoutexam.utils.toIndonesianFormat

class DetailActivity : AppCompatActivity() {

    companion object {


        const val EXTRAS_DETAIL_DATA = "EXTRAS_DETAIL_DATA"
        fun startActivity(context: Context, menu: Menu) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRAS_DETAIL_DATA, menu)
            context.startActivity(intent)
        }

    }

    private var qty: Int = 1
    private var amount: Double = 0.0
    private var mapLink: String = ""

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIntentData()
        onClickAction()
    }

    private fun getIntentData() {
        intent.extras?.getParcelable<Menu>(EXTRAS_DETAIL_DATA)?.let {
            binding.ivMenuImage.setImageResource(it.image)
            binding.layoutContentDetail.tvMenuName.text = it.name
            binding.layoutContentDetail.tvPrice.text = it.price.toIndonesianFormat()
            binding.layoutContentDetail.tvDescription.text = it.description
            binding.layoutLocation.tvDetailLocation.text = it.location
            "Tambah ke Keranjang - ${it.price.toIndonesianFormat()}".also {
                binding.layoutBottomDetail.btnAddToCart.text = it
            }
            amount = it.price
            mapLink = it.mapLink

        }
    }

    private fun onClickAction() {
        binding.layoutBottomDetail.btnPlus.setOnClickListener {
            qty++
            val finalPrice: Double = qty * amount
            binding.layoutBottomDetail.tvCounter.text = qty.toString()
            binding.layoutBottomDetail.btnAddToCart.text = finalPrice.toIndonesianFormat()
            "add - ${finalPrice.toIndonesianFormat()}".also {
                binding.layoutBottomDetail.btnAddToCart.text = it
            }
        }

        binding.layoutBottomDetail.btnMin.setOnClickListener {
            if (qty > 0) {
                qty--
                binding.layoutBottomDetail.tvCounter.text = qty.toString()
                val finalPrice: Double = qty * amount
                binding.layoutBottomDetail.tvCounter.text = qty.toString()
                "add - ${finalPrice.toIndonesianFormat()}".also {
                    binding.layoutBottomDetail.btnAddToCart.text = it
                }
            }
        }

        binding.layoutTopDetail.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.layoutLocation.tvDetailLocation.setOnClickListener {
            setPinLocationMap(mapLink)
        }
    }


    private fun setPinLocationMap(mapLink: String) {
        val mapUri = Uri.parse(mapLink)
        val intent = Intent(Intent.ACTION_VIEW, mapUri)
        startActivity(intent)
    }
}