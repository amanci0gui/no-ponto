package br.com.noponto.data.repo

import br.com.noponto.data.dto.User.UserSaveDto
import br.com.noponto.data.dto.User.UserUpdateDto
import br.com.noponto.domain.model.User
import br.com.noponto.domain.repositories.UserRepository

class UserRepositoryImpl : UserRepository {
    override suspend fun getUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override suspend fun saveUser(user: UserSaveDto): User {
        TODO("Not yet implemented")
    }

    override suspend fun getUserById(id: Int): User? {
        TODO("Not yet implemented")
    }

    override suspend fun updateUser(user: UserUpdateDto): User {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUser(id: Int) {
        TODO("Not yet implemented")
    }
}