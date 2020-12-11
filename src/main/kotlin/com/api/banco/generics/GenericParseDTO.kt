package com.api.banco.generics

interface GenericParseDTO {
    fun converteInDto(input: GenericDataInput) : GenericDTO
}