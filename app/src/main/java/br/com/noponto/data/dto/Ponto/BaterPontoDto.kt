package br.com.noponto.data.dto.Ponto

import br.com.noponto.domain.model.TipoDePonto
import java.time.LocalDateTime

data class BaterPontoDto(
    var homeOffice: Boolean,
    var tipoDePonto: TipoDePonto,
    var userId: Int,
    var localizacaoPonto: LocalizacaoPonto,
    var dataHoraPonto: LocalDateTime,
)
