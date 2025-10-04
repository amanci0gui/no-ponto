package br.com.noponto.data.dto.User

import br.com.noponto.domain.model.Endereco
import java.time.LocalDateTime

data class UserSaveDto(
    var nome: String,
    var email: String,
    var senha: String,
    var cpf: String,
    var dataDeNascimento: LocalDateTime,
    var endereco: Endereco,
)