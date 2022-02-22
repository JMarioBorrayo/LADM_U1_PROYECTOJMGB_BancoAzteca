package mx.edu.ladm_u1_proyectojmgb_bancoazteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var botonI = findViewById<Button>(R.id.botonI)
        var botonO = findViewById<Button>(R.id.botonO)
        var usuario = findViewById<EditText>(R.id.usuario)
        var contra = findViewById<EditText>(R.id.contra)
        botonI.setOnClickListener {
            if (usuario.text.toString()=="admin" && contra.text.toString()=="admin"){
                llamarSegundaActivity()
            }else{
                AlertDialog.Builder(this)
                    .setTitle("Error al iniciar sesion")
                    .setMessage("Contrasena y/o Usuario inccorrectos")
                    .setPositiveButton("Aceptar", {d,i-> d.dismiss()})
                    .setNegativeButton("Salir",{d,i ->d.cancel()})
                    .show()
            }
        }
        botonO.setOnClickListener {

            llamarTerceraActivity()
        }
    }
    fun llamarSegundaActivity(){
        val otraVentana = Intent(this,MainActivity2::class.java)
        startActivity(otraVentana)
    }
    fun llamarTerceraActivity(){
        val otraVentana = Intent(this,MainActivity3::class.java)
        startActivity(otraVentana)
    }



}