package br.com.noponto.domain.repositories

import br.com.noponto.data.dto.Ponto.BaterPontoDto
import br.com.noponto.domain.model.Ponto
import br.com.noponto.domain.model.TipoDePonto
import java.time.LocalDateTime

interface PontoRepository {
    suspend fun baterPonto(ponto: BaterPontoDto): Ponto
    suspend fun getPontosByUserId(userId: Int): List<Ponto>
    suspend fun getPontosByUserIdAndDate(userId: Int, date: LocalDateTime): List<Ponto>
    suspend fun getAllPontos(): List<Ponto>
    suspend fun deletePonto(pontoId: Int)
    suspend fun getPontosByUserAndTipoDePonto(userId: Int, tipoDePonto: TipoDePonto): List<Ponto>
}