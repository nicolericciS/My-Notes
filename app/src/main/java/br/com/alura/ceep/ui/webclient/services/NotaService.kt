package br.com.alura.ceep.ui.webclient.services

import br.com.alura.ceep.ui.webclient.model.NotaRequisicao
import br.com.alura.ceep.ui.webclient.model.NotaResposta
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path


interface NotaService {


    @GET("notas")
    suspend fun buscaTodas(): List<NotaResposta>

    @PUT("notas/{id}")
    // o apelido do path não tem relação nenhuma com o nome do parâmetro
    suspend fun salva(
        @Path("id") id: String,
        @Body nota: NotaRequisicao
    ): Response<NotaResposta>

    @DELETE("notas/{id}")
    suspend fun remove(@Path("id") id: String): Response<Void>
}
