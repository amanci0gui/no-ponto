package br.com.noponto.domain.model

import java.time.LocalTime

data class PlanoDeTrabalho(
    var id: Int,
    var diasPresenciais: List<String>,
    var diasRemotos: List<String>,
    var user: User,
    var horarioEntrada: LocalTime,
    var horarioSaida: LocalTime,
)
