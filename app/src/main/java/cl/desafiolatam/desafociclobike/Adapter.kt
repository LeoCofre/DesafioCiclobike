package cl.desafiolatam.desafociclobike

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CicloviaAdapter (val lista : MutableList<Ciclovia>): RecyclerView.Adapter<CicloviaAdapter.CicloviaViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CicloviaViewHolder {
        val itemView =
        LayoutInflater.from(parent.context).inflate(R.layout.item_ciclovia,parent, false)
        return CicloviaViewHolder(itemView )
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: CicloviaViewHolder, position: Int) {

        holder.textCiclovia.text = lista[position].nombre
        holder.textComuna.text = lista[position].comuna
    }
    
    class CicloviaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    
        var textCiclovia : TextView 
        var textComuna : TextView
        
        init {
            textCiclovia = itemView.findViewById(R.id.ciclovia)
            textComuna = itemView.findViewById(R.id.comuna)
            
        }
    }

}
