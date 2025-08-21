package com.example.helloworldapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.helloworldapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text = number.toString()

            btnCount.setOnClickListener {
                // increase number
                number++
                txtNumber.text = number.toString()
            }

            btnMin.setOnClickListener{
                //decrease number
                number--
                txtNumber.text = number.toString()
            }

            btnReset.setOnClickListener {
                number = 0
                txtNumber.text = number.toString()

            }

            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "Count $number",
                    Toast.LENGTH_SHORT).show()
            }

        }

//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        Log.d("CLOG", "onCrete: log debug")
        Log.e("CLOG", "onCrete: log error")
        Log.i("CLOG", "onCrete: log info")
        Log.w("CLOG", "onCrete: log warning")

    }
}