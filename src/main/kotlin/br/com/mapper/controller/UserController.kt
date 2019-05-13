package br.com.mapper.controller

import br.com.mapper.mapper.UserMapper
import br.com.mapper.model.UserRequest
import br.com.mapper.model.UserResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/users")
class UserController(private val mapper: UserMapper) {

    @PostMapping
    fun saveUser(@RequestBody request: UserRequest): UserResponse {
        val response = this.mapper.toResponse(request)
        response.id = UUID.randomUUID().toString()
        return response
    }
}