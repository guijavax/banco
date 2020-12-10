package com.api.banco.requestInput

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.time.LocalDate
import javax.validation.constraints.NotNull


data class Cliente (
        val nome : String? = null,
        val cpf : Long? = null,
        val dataNasc : LocalDate? = null,

        @JsonProperty(value = "endereco")
        @NotNull
        val endereco: Endereco? = null

) : Serializable {
}