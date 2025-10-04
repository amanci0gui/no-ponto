package br.com.noponto.domain.repositories

import br.com.noponto.data.dto.Ocorrencia.OcorrenciaReportDto
import br.com.noponto.data.dto.Ocorrencia.OcorrenciaUpdateDto
import br.com.noponto.domain.model.Ocorrencia

interface OcorrenciaRepository {
    suspend fun reportarOcorrencia(ocorrencia: OcorrenciaReportDto): Ocorrencia
    suspend fun listarOcorrencias(): List<Ocorrencia>
    suspend fun aprovarOcorrencia(id: Int): Ocorrencia
    suspend fun reprovarOcorrencia(id: Int): Ocorrencia
    suspend fun listarOcorrenciasPendentes(): List<Ocorrencia>
    suspend fun listarOcorrenciasAprovadas(): List<Ocorrencia>
    suspend fun listarOcorrenciasReprovadas(): List<Ocorrencia>
    suspend fun listarOcorrenciasPorUsuario(userId: Int): List<Ocorrencia>
    suspend fun deletarOcorrencia(id: Int)
    suspend fun buscarOcorrenciaPorId(id: Int): Ocorrencia?
    suspend fun atualizarOcorrencia(ocorrencia: OcorrenciaUpdateDto): Ocorrencia
}