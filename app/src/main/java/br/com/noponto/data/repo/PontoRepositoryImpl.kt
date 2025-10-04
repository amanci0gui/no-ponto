package br.com.noponto.data.repo

import br.com.noponto.data.dto.Ponto.BaterPontoDto
import br.com.noponto.domain.model.Ponto
import br.com.noponto.domain.model.TipoDePonto
import br.com.noponto.domain.repositories.PontoRepository
import java.time.LocalDateTime

class PontoRepositoryImpl : PontoRepository {
    override suspend fun baterPonto(ponto: BaterPontoDto): Ponto {
        TODO("Not yet implemented")
    }

    override suspend fun getPontosByUserId(userId: Int): List<Ponto> {
        TODO("Not yet implemented")
    }

    override suspend fun getPontosByUserIdAndDate(
        userId: Int,
        date: LocalDateTime
    ): List<Ponto> {
        TODO("Not yet implemented")
    }

    override suspend fun getAllPontos(): List<Ponto> {
        TODO("Not yet implemented")
    }

    override suspend fun deletePonto(pontoId: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun getPontosByUserAndTipoDePonto(
        userId: Int,
        tipoDePonto: TipoDePonto
    ): List<Ponto> {
        TODO("Not yet implemented")
    }
}