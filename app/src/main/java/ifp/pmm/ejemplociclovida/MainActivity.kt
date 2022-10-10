package ifp.pmm.ejemplociclovida

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultRegistry
import androidx.activity.result.contract.ActivityResultContracts
import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    /*
     * La función OnCreate se lanza UNA VEZ cuando se INICIA la app.
     * Es importante que aquí LINKÉIS las variables, y abráis cualquier tipo de comunicación.
     */
    lateinit var miTexto : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        miTexto = findViewById(R.id.textView)

        // conexion.create()
        // fichero.leer
        val valor = ThreadLocalRandom.current().nextInt(1000)
        miTexto.text = valor.toString()



        println("-----------------NUEVA INVOCACIÓN--------")
        println("Estoy en OnCreate")


    }


    override fun onStart() {
        super.onStart()
        println("Estoy en OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("Estoy en OnRestart")
    }

    override fun onResume() {
        super.onResume()
        println("Estoy en OnResume")
    }

    override fun onStop() {
        super.onStop()
        println("Estoy en OnStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        println("Estoy en OnDestroy x_x")
        println("-----------------FIN INVOCACIÓN--------")
    }


}