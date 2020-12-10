package com.api.banco.requestInput

import java.io.Serializable
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class Endereco(

        @Size(min = 8, max = 8, message = "Campo cep deve ter 8 caracteres")
        @NotBlank(message = "Campo cep deve ser preenchido!")
        val cep : Int? = null,

        @Size(min = 5)
        @NotNull(message = "O campo Rua é Obrigatorio!")
        val rua : String? = null,

        @Size(min = 5)
        @NotNull(message = "O campo Bairro é Obrigatorio!")
        val bairro : String? = null,

        @Size(min = 5)
        @NotNull(message = "O campo Cidade é Obrigatorio!")
        val cidade : String? = null,

        @Size(min = 2,max = 2,  message = "O campo estado deve ter 2 caracteres!")
        @NotNull(message = "O campo Bairro é Obrigatorio!")
        val estado : String? = null,

        @Size(min = 5)
        @NotNull(message = "O campo Pais é Obrigatorio!")
        val pais : String? = null
) : Serializable {


}