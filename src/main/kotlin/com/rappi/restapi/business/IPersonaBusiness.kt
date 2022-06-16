package com.rappi.restapi.business

import com.rappi.restapi.model.Persona

interface IPersonaBusiness {
    fun list(): List<Persona>
    fun load(idPersona:Long): Persona
    fun save(persona:Persona): Persona
    fun remove(idPersona: Long)
}