package com.api.banco.config

import org.springframework.http.ResponseEntity

sealed class Response (open val response : ResponseEntity<Any>){
    data class SUCCESS(override val response: ResponseEntity<Any>) : Response(response)
    data class ERROR(override val response: ResponseEntity<Any>) : Response(response)
}

class SentResponse() {
    fun sent(resp: Response) : ResponseEntity<Any> {
        return resp.response
    }
}