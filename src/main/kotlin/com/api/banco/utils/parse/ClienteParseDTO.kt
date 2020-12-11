package com.api.banco.utils.parse


import com.api.banco.dto.ClienteDTO
import com.api.banco.dto.EnderecoDTO
import com.api.banco.generics.GenericDTO
import com.api.banco.generics.GenericDataInput
import com.api.banco.generics.GenericParseDTO
import com.api.banco.requestInput.Cliente
import org.springframework.stereotype.Service

@Service(value = "cliente")
class ClienteParseDTO :  GenericParseDTO {
    override fun converteInDto(dto : GenericDataInput)  : GenericDTO {
        val cliente = dto as Cliente
        val endereco  = cliente.endereco
        val enderecoDTO = EnderecoDTO(cep = endereco?.cep, rua = endereco?.rua, bairro = endereco?.bairro, cidade = endereco?.cidade, estado = endereco?.estado, pais = endereco?.pais)
        return ClienteDTO(nome = cliente.nome,  cpf = cliente.cpf, dataNasc = cliente.dataNasc, enderecoDTO)
    }
}