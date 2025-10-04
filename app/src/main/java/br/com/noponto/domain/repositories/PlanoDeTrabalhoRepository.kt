package br.com.noponto.domain.repositories

import br.com.noponto.data.dto.PlanoDeTrabalho.PlanoDeTrabalhoCadastroDto
import br.com.noponto.data.dto.PlanoDeTrabalho.PlanoDeTrabalhoUpdateDto
import br.com.noponto.domain.model.PlanoDeTrabalho

interface PlanoDeTrabalhoRepository {
    suspend fun buscarPlanoDeTrabalhoDoUsuario(userId: Int): PlanoDeTrabalho
    suspend fun cadastrarPlanoDeTrabalho(planoDeTrabalho: PlanoDeTrabalhoCadastroDto)
    suspend fun atualizarPlanoDeTrabalho(planoDeTrabalho: PlanoDeTrabalhoUpdateDto): PlanoDeTrabalho
    suspend fun deletarPlanoDeTrabalho(planoDeTrabalhoId: Int)
    suspend fun existePlanoDeTrabalho(userId: Int): Boolean
}