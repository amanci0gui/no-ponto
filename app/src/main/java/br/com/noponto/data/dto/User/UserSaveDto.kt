package br.com.noponto.data.dto.User

import br.com.noponto.domain.model.Endereco
import br.com.noponto.domain.model.User
import java.time.LocalDateTime

data class UserSaveDto(
    var nome: String,
    var email: String,
    var senha: String,
    var cpf: String,
    var dataDeNascimento: LocalDateTime,
    var endereco: Endereco,
) {
    fun toUser(): User {
        return User(
            id = 0,
            nome = this.nome,
            email = this.email,
            senha = this.senha,
            cpf = this.cpf,
            dataDeNascimento = this.dataDeNascimento,
            endereco = this.endereco,
            createdAt = LocalDateTime.now()
        )
    }
}