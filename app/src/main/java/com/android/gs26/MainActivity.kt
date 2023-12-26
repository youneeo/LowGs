package com.android.gs26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import com.android.gs26.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        binding.btnSum.setOnClickListener {
            sum()
        }

    }

    private fun sum() {
        val value1 = binding.editText10000.text.toString().toIntOrNull()
        val value2 = binding.editText5000.text.toString().toIntOrNull()
        val value3 = binding.editText1000.text.toString().toIntOrNull()

        val value4 = binding.editText500.text.toString().toIntOrNull()
        val value5 = binding.editText100.text.toString().toIntOrNull()
        val value6 = binding.editText50.text.toString().toIntOrNull()
        val value7 = binding.edittext10.text.toString().toIntOrNull()
        val value8 = binding.etEmgFund5000.text.toString().toIntOrNull()

        if (value1 != null && value2 != null && value3 != null && value4 != null && value5 != null && value6 != null && value7 != null && value8 != null) {

            val sumPaper = (value1 * 10000) + (value2 * 5000) + (value3 * 1000)
            val sumCoin =
                (value4 * 500 * 10) + (value5 * 100 * 20) + (value6 * 50 * 10) + (value7 * 10 * 20)
            val sum = sumCoin + sumPaper
            val emgMoney = ( value8 * 5000 )
            val numberFormat = NumberFormat.getInstance()

            binding.tvSumPaper.text = "${numberFormat.format(sumPaper)}원"
            binding.tvSumCoin.text = "${numberFormat.format(sumCoin)}원"
            binding.tvSumFinal.text = "총합:   ${numberFormat.format(sum)}원"
            binding.tvEmgFund.text = "비상금 : ${numberFormat.format(emgMoney)}원 "


        } else {
            Toast.makeText(this, "빈값이 존재합니다.", Toast.LENGTH_SHORT).show()
        }
    }
}