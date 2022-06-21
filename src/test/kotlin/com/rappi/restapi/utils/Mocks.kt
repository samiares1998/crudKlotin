package com.rappi.restapi.utils

import com.rappi.restapi.model.Persona

class Mocks {

    companion object {
        @JvmStatic
        fun list() : List<Persona> = arrayListOf(
            Persona(1L,"test","test",null),
            Persona(1L,"test","test",null)
        );
    }
}