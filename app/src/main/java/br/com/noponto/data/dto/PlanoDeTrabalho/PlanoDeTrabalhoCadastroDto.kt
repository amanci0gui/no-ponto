package br.com.noponto.data.dto.PlanoDeTrabalho

data class PlanoDeTrabalhoCadastroDto(
    var diasPresenciais: List<String>,
    var diasRemotos: List<String>,
    var horarioEntrada: String,
    var horarioSaida: String,
    var userId: Int,
)
