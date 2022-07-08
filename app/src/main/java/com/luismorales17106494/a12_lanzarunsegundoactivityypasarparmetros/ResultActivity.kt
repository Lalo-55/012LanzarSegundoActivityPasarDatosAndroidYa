package com.luismorales17106494.a12_lanzarunsegundoactivityypasarparmetros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a12_lanzarunsegundoactivityypasarparmetros.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val bundle = intent.extras
        val direccion = bundle?.getString("direccion")

        Toast.makeText(this, "La dirección es $direccion ",
            Toast.LENGTH_SHORT).show()



        //WebView
        _binding.webView.loadUrl("https://${direccion}")








        _binding.btnSalir.setOnClickListener(){
            finish()
        }
    }
}