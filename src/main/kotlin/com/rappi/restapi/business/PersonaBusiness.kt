package com.rappi.restapi.business

import com.rappi.restapi.dao.PersonaRepository
import com.rappi.restapi.exception.BusinessException
import com.rappi.restapi.exception.NotFoundException
import com.rappi.restapi.model.Persona
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PersonaBusiness: IPersonaBusiness {

    @Autowired
    val personaRepository: PersonaRepository?=null;

    @kotlin.jvm.Throws(BusinessException::class)
    override fun list(): List<Persona> {
        try{
            return personaRepository!!.findAll();
        }catch(e:Exception){
            throw BusinessException(e.message)
        }
    }
    @kotlin.jvm.Throws(BusinessException::class,NotFoundException::class)
    override fun load(idPersona: Long): Persona {
        val op: Optional<Persona>
        try{
            op = personaRepository!!.findById(idPersona)
        }catch(e:Exception){
            throw BusinessException(e.message)
        }
        if(!op.isPresent){
            throw NotFoundException("No se encontro con id $idPersona" +
                    "")
        }else{
            return op.get()
        }
    }
    @kotlin.jvm.Throws(BusinessException::class)
    override fun save(persona: Persona): Persona {
        try{
            return personaRepository!!.save(persona)
        }catch(e:Exception){
            throw BusinessException(e.message)
        }
    }
    @kotlin.jvm.Throws(BusinessException::class)
    override fun remove(idPersona: Long) {
        val op: Optional<Persona>
        try{
            op = personaRepository!!.findById(idPersona)
        }catch(e:Exception){
            throw BusinessException(e.message)
        }
        if(!op.isPresent){
            throw NotFoundException("No se encontro con id $idPersona" +
                    "")
        }else{
            try{
                personaRepository!!.deleteById(idPersona);
            }catch(e:Exception){
                throw BusinessException(e.message)
            }
        }
    }

}