package br.com.noponto.domain.usecases.User

import br.com.noponto.domain.model.User
import br.com.noponto.domain.repositories.UserRepository

class GetUsersUseCase(private val repository : UserRepository) {
    suspend operator fun invoke(): Result<List<User>> {
        return try {
            Result.success(repository.getUsers())
        } catch (e : Exception) {
            Result.failure(e)
        }
    }
}