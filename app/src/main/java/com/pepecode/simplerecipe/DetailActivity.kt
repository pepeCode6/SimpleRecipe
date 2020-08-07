package com.pepecode.simplerecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {
    // receta que se mostrara
    private lateinit var recipe: Recipe
    // componentes de la vista
    private lateinit var ivImage: ImageView
    private lateinit var ivClose: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvTime: TextView
    private lateinit var tvSteps: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // obtener la receta que se adjunto al crear el item
        recipe = intent.getSerializableExtra("recipe") as Recipe
        // buscar componentes en la vista (layout)
        ivImage = findViewById(R.id.iv_image)
        ivClose = findViewById(R.id.iv_close)
        tvName = findViewById(R.id.tv_name)
        tvDescription = findViewById(R.id.tv_description)
        tvTime = findViewById(R.id.tv_time)
        tvSteps = findViewById(R.id.tv_steps)
        // asignar la imágen al ImageView
        ivImage.setImageResource(recipe.image)
        // asignar los textos a los TextViews
        tvName.text = recipe.name
        tvDescription.text = recipe.description
        tvTime.text = recipe.time.toString() + " min."
        recipe.steps.forEach { step ->
            tvSteps.text = tvSteps.text.toString() + "\n $step"
        }
        // cuando se haga clik sobre la imágen se
        // finalizara la activity
        ivClose.setOnClickListener {
            finish()
        }

    }
}