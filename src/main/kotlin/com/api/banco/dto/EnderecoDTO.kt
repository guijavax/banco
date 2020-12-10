package com.api.banco.dto

data class EnderecoDTO (
    val cep : Int? = null,
    val rua : String? = null,
    val bairro : String? = null,
    val cidade : String? = null,
    val estado : String? = null,
    val pais : String? = null) {}