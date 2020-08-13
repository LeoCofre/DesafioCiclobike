package cl.desafiolatam.desafociclobike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.adapter = CicloviaAdapter(SetupCiclovia().init())
    }

    fun sinFiltro (){
        recycler_view.adapter= CicloviaAdapter(SetupCiclovia().init())
    }

    fun filtrarLasCondes(){

        //recycler_view.adapter= CicloviaAdapter(SetupCiclovia().comuna())

    }
}
