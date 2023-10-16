package ifp.pmm.ejemplociclovida

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ifp.pmm.ejemplociclovida.ui.theme.EjemploCicloVidaTheme
import java.util.concurrent.ThreadLocalRandom

class ActividadPrincipal : ComponentActivity() {

    val ON_CREATE = "ON CREATE"
    val ON_STOP = "ON STOP"
    val ON_RESUME = "ON RESUME"
    val ON_RESTART = "ON RESTART"
    val ON_DESTROY = "ON DESTROY"
    val ON_START = "ON START"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemploCicloVidaTheme {

                var numero by remember {mutableStateOf(ThreadLocalRandom.current().nextInt(1000).toString())}
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    Text(numero, modifier = Modifier
                        .wrapContentSize(Alignment.Center),
                    fontSize = 200.sp)
                    Log.d(ON_CREATE, "-----------------NUEVA INVOCACIÓN--------")
                    Log.d(ON_CREATE, "Estoy en OnCreate")
                }
            }
        }
    }
    

    override fun onStart() {
        super.onStart()
        Log.d(ON_START, "Estoy en OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ON_RESTART, "Estoy en OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ON_RESUME, "Estoy en OnResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ON_STOP, "Estoy en OnStop")
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d(ON_DESTROY,"Estoy en OnDestroy x_x")
        Log.d(ON_DESTROY,"-----------------FIN INVOCACIÓN--------")
    }
}