package com.rappi.restapi.business

import com.rappi.restapi.utils.Mocks
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PersonaBusinessTest {

    @Test
    fun getPersonaRepository() {
    }

    @Test
    fun list() {
        val personas= Mocks.list()
        assertThat(personas.size).isGreaterThanOrEqualTo(2)
    }

    @Test
    fun load() {
    }

    @Test
    fun save() {
    }

    @Test
    fun remove() {
    }
}