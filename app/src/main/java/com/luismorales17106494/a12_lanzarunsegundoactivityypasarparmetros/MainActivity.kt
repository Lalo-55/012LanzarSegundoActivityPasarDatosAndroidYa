package com.luismorales17106494.a12_lanzarunsegundoactivityypasarparmetros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}