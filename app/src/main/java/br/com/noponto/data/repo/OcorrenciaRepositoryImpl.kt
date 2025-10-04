package br.com.noponto.data.repo

import br.com.noponto.data.dto.Ocorrencia.OcorrenciaReportDto
import br.com.noponto.data.dto.Ocorrencia.OcorrenciaUpdateDto
import br.com.noponto.domain.model.Ocorrencia
import br.com.noponto.domain.repositories.OcorrenciaRepository

class OcorrenciaRepositoryImpl : OcorrenciaRepository {
    override suspend fun reportarOcorrencia(ocorrencia: OcorrenciaReportDto): Ocorrencia {
        TODO("Not yet implemented")
    }

    override suspend fun listarOcorrencias(): List<Ocorrencia> {
        TODO("Not yet implemented")
    }

    override suspend fun aprovarOcorrencia(id: Int): Ocorrencia {
        TODO("Not yet implemented")
    }

    override suspend fun reprovarOcorrencia(id: Int): Ocorrencia {
        TODO("Not yet implemented")
    }

    override suspend fun listarOcorrenciasPendentes(): List<Ocorrencia> {
        TODO("Not yet implemented")
    }

    override suspend fun listarOcorrenciasAprovadas(): List<Ocorrencia> {
        TODO("Not yet implemented")
    }

    override suspend fun listarOcorrenciasReprovadas(): List<Ocorrencia> {
        TODO("Not yet implemented")
    }

    override suspend fun listarOcorrenciasPorUsuario(userId: Int): List<Ocorrencia> {
        TODO("Not yet implemented")
    }

    override suspend fun deletarOcorrencia(id: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun buscarOcorrenciaPorId(id: Int): Ocorrencia? {
        TODO("Not yet implemented")
    }

    override suspend fun atualizarOcorrencia(ocorrencia: OcorrenciaUpdateDto): Ocorrencia {
        TODO("Not yet implemented")
    }

}