package com.ravza.plakabul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ravza.plakabul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if(binding.editTextNumber.text.isNotEmpty()){
                var plakaKodu= binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    35 -> binding.textView.text = "izmir"
                    34 -> binding.textView.text = "istanbul"
                    45 -> binding.textView.text = "Manisa"
                    3 -> binding.textView.text = "Afyon"
                    9 -> binding.textView.text = "Aydın"
                    else ->{
                        binding.textView.text= "Bulunmadı"
                    }
                }
            }else{
                binding.textView.text="şehir plaka kodunu giriniz"
            }
            binding.editTextNumber.text.clear()
        }
    }


}