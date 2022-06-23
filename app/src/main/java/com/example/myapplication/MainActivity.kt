package com.example.myapplication

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.loader.content.AsyncTaskLoader
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler

    var doubleBackToExitPr = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onBackPressed() {
        if (doubleBackToExitPr){
            super.onBackPressed()
            return
        }
        handler = Handler(Looper.getMainLooper())
        this.doubleBackToExitPr = true
        Toast.makeText(this, "Iltimos chiqish uchun yana bir marta bosning", Toast.LENGTH_SHORT).show()
        handler.postDelayed({
            doubleBackToExitPr = false
        },2000)

    }

}