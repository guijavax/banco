package com.api.banco.dto

import com.api.banco.generics.GenericDTO
import com.api.banco.requestInput.Endereco
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import javax.validation.constraints.NotNull

data class ClienteDTO(
        val nome : String? = null,
        val cpf : Long? = null,
        val dataNasc : LocalDate? = null,
        val endereco: EnderecoDTO? = null

) : GenericDTO {}
