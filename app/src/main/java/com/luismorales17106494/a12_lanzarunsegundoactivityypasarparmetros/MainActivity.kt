package com.luismorales17106494.a12_lanzarunsegundoactivityypasarparmetros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luismorales17106494.a12_lanzarunsegundoactivityypasarparmetros.databinding.ActivityMainBinding

/*
12 - Lanzar un segundo "Activity" y pasar parámetros



Hemos visto en el concepto anterior que un programa puede tener más de una ventana
representando cada ventana con una clase que hereda de AppCompatActivity.
Una situación muy común es que la primer ventana necesite enviar datos a la segunda
para que a partir de estos proceda a efectuar una acción.
 */
/*
Problema:
Confeccionar un programa que solicite el ingrese de una dirección de un
sitio web y seguidamente abrir una segunda ventana que muestre dicha página.

Para resolver este problema utilizaremos el control visual WebView que nos
permite mostrar el contenido de un sitio web.
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.ibtnBuscar.setOnClickListener(){
            if (binding.edDireccion.text.isNotBlank()){
                val myIntent = Intent(
                    this,
                    ResultActivity::class.java
                )
                myIntent.putExtra("direccion",binding.edDireccion.text.toString())
                startActivity(myIntent)

            }else{
                Toast.makeText(this, "Dirección no valida",
                Toast.LENGTH_SHORT).show()
            }
        }




    }
}