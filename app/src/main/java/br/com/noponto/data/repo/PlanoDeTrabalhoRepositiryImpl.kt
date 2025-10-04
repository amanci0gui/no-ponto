package br.com.noponto.data.repo

import br.com.noponto.data.dto.PlanoDeTrabalho.PlanoDeTrabalhoCadastroDto
import br.com.noponto.data.dto.PlanoDeTrabalho.PlanoDeTrabalhoUpdateDto
import br.com.noponto.domain.model.PlanoDeTrabalho
import br.com.noponto.domain.repositories.PlanoDeTrabalhoRepository

class PlanoDeTrabalhoRepositiryImpl : PlanoDeTrabalhoRepository {
    override suspend fun buscarPlanoDeTrabalhoDoUsuario(userId: Int): PlanoDeTrabalho {
        TODO("Not yet implemented")
    }

    override suspend fun cadastrarPlanoDeTrabalho(planoDeTrabalho: PlanoDeTrabalhoCadastroDto) {
        TODO("Not yet implemented")
    }

    override suspend fun atualizarPlanoDeTrabalho(planoDeTrabalho: PlanoDeTrabalhoUpdateDto): PlanoDeTrabalho {
        TODO("Not yet implemented")
    }

    override suspend fun deletarPlanoDeTrabalho(planoDeTrabalhoId: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun existePlanoDeTrabalho(userId: Int): Boolean {
        TODO("Not yet implemented")
    }
}