package com.api.banco.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class EnderecoDTO(
        val cep : Int? = null,
        val rua : String? = null,
        val bairro : String? = null,
        val cidade : String? = null,
        val estado : String? = null,
        val pais : String? = null
){}
