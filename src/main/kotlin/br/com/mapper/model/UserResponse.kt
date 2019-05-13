package br.com.mapper.model

import br.com.mapper.mapper.NoArgConstructor

@NoArgConstructor
data class UserResponse(var name: String, var age: Int) {

    lateinit var id: String
}