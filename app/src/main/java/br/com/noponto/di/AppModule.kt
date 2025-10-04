package br.com.noponto.di

import br.com.noponto.data.repo.OcorrenciaRepositoryImpl
import br.com.noponto.data.repo.PlanoDeTrabalhoRepositiryImpl
import br.com.noponto.data.repo.PontoRepositoryImpl
import br.com.noponto.data.repo.UserRepositoryImpl
import br.com.noponto.domain.repositories.OcorrenciaRepository
import br.com.noponto.domain.repositories.PlanoDeTrabalhoRepository
import br.com.noponto.domain.repositories.PontoRepository
import br.com.noponto.domain.repositories.UserRepository
import org.koin.dsl.module

val appModule = module {
    single<UserRepository> {
        UserRepositoryImpl()
    }

    single<PontoRepository> {
        PontoRepositoryImpl()
    }

    single<PlanoDeTrabalhoRepository> {
        PlanoDeTrabalhoRepositiryImpl()
    }

    single<OcorrenciaRepository> {
        OcorrenciaRepositoryImpl()
    }


}