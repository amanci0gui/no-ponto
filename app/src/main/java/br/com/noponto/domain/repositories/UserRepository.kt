package br.com.noponto.domain.repositories

import br.com.noponto.data.dto.User.UserSaveDto
import br.com.noponto.data.dto.User.UserUpdateDto
import br.com.noponto.domain.model.User

interface UserRepository {
    suspend fun getUsers(): List<User>
    suspend fun saveUser(user: UserSaveDto): User
    suspend fun getUserById(id: Int): User?
    suspend fun updateUser(user: UserUpdateDto): User
    suspend fun deleteUser(id: Int)
}