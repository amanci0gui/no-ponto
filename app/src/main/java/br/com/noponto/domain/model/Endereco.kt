package br.com.noponto.domain.model

data class Endereco(
    var cidade: String,
    var rua: String,
    var estado: String,
    var numero: String,
    var complemento: String? = null,
    var bairro: String,
    var cep: String,
)