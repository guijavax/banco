package com.api.banco.requestInput

import com.api.banco.generics.GenericDataInput
import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import java.io.Serializable
import java.time.LocalDate
import javax.validation.constraints.NotNull


data class Cliente (
        val nome : String? = null,
        val cpf : Long? = null,

        @JsonProperty("data_nasc")
        @JsonFormat(pattern = "dd-MM-yyyy")
        val dataNasc : LocalDate? = null,

        @JsonProperty(value = "endereco")
        @NotNull
        val endereco: Endereco? = null

)  : GenericDataInput{
}