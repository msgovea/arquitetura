package br.com.alura.technews.repository

class Resource<T>(
    val dado: T?,
    val erro: String? = null
)

fun <T>  criaResourceFalha(erro: String?, resource: Resource<T?>?): Resource<T?>? {
    resource?.let {
        return Resource(dado = it.dado, erro = erro)
    } ?: run {
        return Resource(dado = null, erro = erro)
    }
}