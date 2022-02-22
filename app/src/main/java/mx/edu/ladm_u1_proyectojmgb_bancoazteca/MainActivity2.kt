package mx.edu.ladm_u1_proyectojmgb_bancoazteca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var botonR = findViewById<Button>(R.id.botonR)
        botonR.setOnClickListener {
            finish()
        }
    }
}