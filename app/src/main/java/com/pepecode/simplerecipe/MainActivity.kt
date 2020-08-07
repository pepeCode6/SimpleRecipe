package com.pepecode.simplerecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // instanciar la fabrica de recetas
    // para obtener las recetas
    private val recipesFactory = RecipesFactory()
    // nuestro recyclerview :D
    private lateinit var rvRecipes: RecyclerView
    // el adaptador que le pondremos a nuestro recyclerview
    private lateinit var recipesAdapter: RecipeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // buscar el recyclerview en el layout
        rvRecipes = findViewById(R.id.rv_recipes)
        // configurar el adapter
        recipesAdapter = RecipeListAdapter( recipesFactory.recipes, object: RecipeListAdapter.OnRecipeClicked{
            override fun onRecipeClicked(recipe: Recipe) {
                goDetail(recipe)
            }
        })
        // agregarle un layoutManager al recyclerview
        rvRecipes.layoutManager = LinearLayoutManager(this)
        // asignarle el adapter al recyclerview
        rvRecipes.adapter = recipesAdapter
    }


    fun goDetail(recipe: Recipe) {
        // inicializar el intet ligandolo a la vista del detalle
        val intent = Intent(this, DetailActivity::class.java)
        // adjuntar la receta al intent
        intent.putExtra("recipe",recipe)
        // inicializar la vista del detalle
        startActivity(intent)
    }

}