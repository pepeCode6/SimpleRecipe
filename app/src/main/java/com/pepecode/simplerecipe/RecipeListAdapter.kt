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

class RecipeListAdapter(val ctx: Context, private val recipes: ArrayList<Recipe>, private val onRecipeClicked: OnRecipeClicked ):
    RecyclerView.Adapter<RecipeListAdapter.ViewHolder>() {

    interface OnRecipeClicked {
        fun onRecipeClicked(recipe: Recipe)
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val cvContainer: CardView = itemView.findViewById(R.id.cv_container)
        val ivImage: ImageView = itemView.findViewById(R.id.iv_image)
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_description)
        val tvTime: TextView = itemView.findViewById(R.id.tv_time)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.tvName.text = recipe.name
        holder.tvDescription.text = recipe.description
        holder.tvTime.text = recipe.time.toString() + " min."
        holder.ivImage.setImageResource(recipe.image)
        holder.cvContainer.setOnClickListener { onRecipeClicked.onRecipeClicked(recipe) }
    }


}