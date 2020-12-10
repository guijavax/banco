package com.api.banco.dto

import java.time.LocalDate

data class ClienteDTO (val nome : String? = null,
            val cpf : Long? = null,
            val dataNasc : LocalDate? = null,
            val endereco: EnderecoDTO? = null
){}