package br.com.noponto.domain.usecases.User

import br.com.noponto.data.dto.User.UserSaveDto
import br.com.noponto.domain.model.User
import br.com.noponto.domain.repositories.UserRepository


class SaveUserUseCase(private val repositoryImpl: UserRepository) {
    suspend fun invoke(user: UserSaveDto): Result<User> {
        return try {
            val domainUser = user.toUser()
            val savedUser = repositoryImpl.saveUser(domainUser)
            Result.success(savedUser)
        } catch ( e: Exception) {
            Result.failure(e)
        }
    }
}