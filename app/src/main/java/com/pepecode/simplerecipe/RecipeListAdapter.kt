package com.pepecode.simplerecipe

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecipeListAdapter(private val recipes: ArrayList<Recipe>, private val onRecipeClicked: OnRecipeClicked ):
    RecyclerView.Adapter<RecipeListAdapter.ViewHolder>() {

    // interface para saber cuando el usr
    // hace click sobre una receta
    interface OnRecipeClicked {
        fun onRecipeClicked(recipe: Recipe)
    }

    // ligar los componentes del layout
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cvContainer: CardView = itemView.findViewById(R.id.cv_container)
        val ivImage: ImageView = itemView.findViewById(R.id.iv_image)
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_description)
        val tvTime: TextView = itemView.findViewById(R.id.tv_time)
    }

    // inflar el layout que tendra cada item de la lista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_list_item, parent, false)
        return ViewHolder(view)
    }

    // cantidad de recetas que se pintaran en la lista
    override fun getItemCount(): Int {
        return recipes.size
    }

    // configurar cada item de la lista
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.tvName.text = recipe.name
        holder.tvDescription.text = recipe.description
        holder.tvTime.text = recipe.time.toString() + " min."
        holder.ivImage.setImageResource(recipe.image)
        holder.cvContainer.setOnClickListener { onRecipeClicked.onRecipeClicked(recipe) }
    }


}