package br.com.mapper.mapper

import br.com.mapper.model.UserRequest
import br.com.mapper.model.UserResponse
import org.mapstruct.Mapper

@Mapper(uses = [ObjectFactory::class])
interface UserMapper {

    fun toResponse(request: UserRequest): UserResponse
}