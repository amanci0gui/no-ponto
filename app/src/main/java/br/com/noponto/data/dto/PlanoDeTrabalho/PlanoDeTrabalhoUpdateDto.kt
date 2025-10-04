package br.com.noponto.data.dto.PlanoDeTrabalho

data class PlanoDeTrabalhoUpdateDto(
    var diasPresenciais: List<String>?,
    var diasRemotos: List<String>?,
    var horarioEntrada: String?,
    var horarioSaida: String?,
)
