package com.api.banco.controller

import com.api.banco.config.Response
import com.api.banco.config.SentResponse
import com.api.banco.generics.GenericParseDTO
import com.api.banco.requestInput.Cliente
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/cliente"])
class ClienteController {


    @Autowired
    @Qualifier(value = "cliente")
    lateinit var genericParseDTO: GenericParseDTO

    @PostMapping("/save")
    fun saveCliente(@RequestBody cliente : Cliente) : ResponseEntity<Any> {
        val sentResponse = SentResponse()
        return try {
            val clienteDTO = genericParseDTO.converteInDto(cliente)
            sentResponse.sent(Response.SUCCESS(ResponseEntity.ok(clienteDTO)))
        }  catch (e : Exception) {
            sentResponse.sent(Response.ERROR(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro")))
        }
    }
}