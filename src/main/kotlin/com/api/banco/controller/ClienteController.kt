package com.api.banco.controller

import com.api.banco.Utils
import com.api.banco.config.Response
import com.api.banco.config.SentResponse
import com.api.banco.dto.ClienteDTO
import com.api.banco.requestInput.Cliente
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.ByteArrayOutputStream
import java.io.ObjectOutputStream

@RestController
@RequestMapping(value = ["/cliente"])
class ClienteController {

    @PostMapping("/save")
    fun saveCliente(@RequestBody cliente : Cliente) : ResponseEntity<Any> {
        val sentResponse = SentResponse()
        return try {
            val clienteDTO = Utils.convertToAny(Gson().toJson(cliente), ClienteDTO::class.java)
            sentResponse.sent(Response.SUCCESS(ResponseEntity.ok("Cadastrado")))
        }  catch (e : Exception) {
            sentResponse.sent(Response.ERROR(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro")))
        }
    }
}