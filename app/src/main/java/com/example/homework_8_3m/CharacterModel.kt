package com.example.homework_8_3m

import java.io.Serializable

data class CharacterModel(
    val image: String,
    val name: String,
    val info: String,
) : Serializable
