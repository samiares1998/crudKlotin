package com.rappi.restapi

import com.rappi.restapi.dao.PersonaRepository
import com.rappi.restapi.model.Persona
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@SpringBootApplication
class RestapiApplication:CommandLineRunner{

	@Autowired
	val personaRepository: PersonaRepository?=null

	override fun run(vararg args: String?) {
		val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
		val persona1= Persona(1234,"sami","arevalo",LocalDate.parse("29-08-1998",formatter))
	}

}



fun main(args: Array<String>) {
	runApplication<RestapiApplication>(*args)
}
