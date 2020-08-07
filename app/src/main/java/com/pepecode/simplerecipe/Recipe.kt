package com.pepecode.simplerecipe

import java.io.Serializable

data class Recipe (
    val name: String,
    val image: Int,
    val steps: ArrayList<String>,
    val time: Int,
    val description: String
): Serializable