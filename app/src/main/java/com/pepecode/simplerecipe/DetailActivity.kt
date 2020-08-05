package com.pepecode.simplerecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    private lateinit var recipe: Recipe

    private lateinit var ivImage: ImageView
    private lateinit var ivClose: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvDescription: TextView
    private lateinit var tvTime: TextView
    private lateinit var tvSteps: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        recipe = intent.getSerializableExtra("recipe") as Recipe

        // find views
        ivImage = findViewById(R.id.iv_image)
        ivClose = findViewById(R.id.iv_close)
        tvName = findViewById(R.id.tv_name)
        tvDescription = findViewById(R.id.tv_description)
        tvTime = findViewById(R.id.tv_time)
        tvSteps = findViewById(R.id.tv_steps)

        // set values
        ivImage.setImageResource(recipe.image)
        tvName.text = recipe.name
        tvDescription.text = recipe.description
        tvTime.text = recipe.time.toString() + " min."


        recipe.steps.forEach { step ->
            tvSteps.text = tvSteps.text.toString() + "\n $step"
        }

        ivClose.setOnClickListener {

            finish()

        }


    }
}