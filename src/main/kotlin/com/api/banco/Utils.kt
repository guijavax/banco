package com.api.banco

import com.fasterxml.jackson.databind.ObjectMapper
import java.nio.charset.Charset

class Utils private constructor() {

    companion object {
        fun <T> convertToAny(json : String, `class` : Class<T>) : T  {
            return ObjectMapper().readValue(json.toByteArray(Charset.defaultCharset()) ,`class`)
        }
    }
}