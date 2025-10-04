package br.com.noponto.domain.model

import android.net.Uri
import java.time.LocalDateTime

data class User(
    var id: Int,
    var nome: String,
    var email: String,
    var cpf: String,
    var dataDeNascimento: LocalDateTime,
    var endereco: Endereco,
    var senha: String,
    var status: Boolean = true,
    var fotoDePerfil: String? = null,
    var createdAt: LocalDateTime = LocalDateTime.now(),
)
