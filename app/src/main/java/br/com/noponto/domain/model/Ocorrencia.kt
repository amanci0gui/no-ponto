package br.com.noponto.domain.model

import java.time.LocalDateTime

data class Ocorrencia(
    var id: Int,
    var user: User,
    var descricao: String,
    var imagemEvidencia: String? = null,
    var aprovada: Boolean? = false,
    var createdAt: LocalDateTime = LocalDateTime.now()
)
