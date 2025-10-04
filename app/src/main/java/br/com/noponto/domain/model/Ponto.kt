package br.com.noponto.domain.model

import br.com.noponto.data.dto.Ponto.LocalizacaoPonto
import java.time.LocalDateTime

data class Ponto(
    var id: Int,
    var dataHoraPonto: LocalDateTime,
    var homeOffice: Boolean,
    var tipoDePonto: TipoDePonto,
    var user: User,
    var createdAt: LocalDateTime,
    var localizacaoPonto: LocalizacaoPonto? = null,
)
