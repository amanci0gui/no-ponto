package br.com.noponto.data.dto.User

import br.com.noponto.domain.model.Endereco

data class UserUpdateDto(
    var endereco: Endereco?,
    var senha: String?,
    var fotoDePerfil: String?,
    var status: Boolean?,
)
