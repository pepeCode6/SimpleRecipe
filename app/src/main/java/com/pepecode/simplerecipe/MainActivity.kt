package com.pepecode.simplerecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private val recipesFactory = RecipesFactory()

    private lateinit var rvRecipes: RecyclerView
    private lateinit var recipesAdapter: RecipeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvRecipes = findViewById(R.id.rv_recipes)


        recipesAdapter = RecipeListAdapter(this, recipesFactory.recipes, object: RecipeListAdapter.OnRecipeClicked{
            override fun onRecipeClicked(recipe: Recipe) {
                goDetail(recipe)
            }
        })

        rvRecipes.layoutManager = LinearLayoutManager(this)
        rvRecipes.adapter = recipesAdapter

        recipesAdapter.notifyDataSetChanged()


    }


    fun goDetail(recipe: Recipe) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("recipe",recipe)
        startActivity(intent)
    }

}