package com.rappi.restapi.web

import com.fasterxml.jackson.databind.ObjectMapper
import com.rappi.restapi.utils.Mocks
import org.json.JSONArray
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
@AutoConfigureMockMvc
internal class PersonaRestControllerTest @Autowired constructor(
    val mockMvc: MockMvc,
    val objectMapper: ObjectMapper
){

    @Test
    fun getPersonaBusiness() {

    }

    @Test
    fun `should return all persons`() {

        mockMvc.get("/api/v1/personas")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content {
                    contentType(MediaType.APPLICATION_JSON)
                    //json(objectMapper.writeValueAsString(Mocks.list()))
                }
            }

    }

    @Test
    fun load() {
    }

    @Test
    fun insert() {
    }

    @Test
    fun update() {
    }

    @Test
    fun delete() {
    }
}