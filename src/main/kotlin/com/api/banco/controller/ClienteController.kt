package com.api.banco.controller

import com.api.banco.config.Response
import com.api.banco.config.SentResponse
import com.api.banco.requestInput.Cliente
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/cliente"])
class ClienteController {

    @PostMapping("/save")
    fun saveCliente(@RequestBody cliente : Cliente) : ResponseEntity<Any> {
        val sentResponse = SentResponse()
        return try {
            if(cliente.nome?.length!! > 50) {
                throw Exception("Erro")
            }
            sentResponse.sent(Response.SUCCESS(ResponseEntity.ok("Cadastrado")))
        }  catch (e : Exception) {
            sentResponse.sent(Response.ERROR(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro")))
        }
    }
}