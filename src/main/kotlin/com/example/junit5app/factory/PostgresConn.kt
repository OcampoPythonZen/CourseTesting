package com.example.junit5app.factory

import com.example.junit5app.`interface`.factory.FactoryConnInterface
import com.example.junit5app.util.toJsonString

class PostgresConn(vc: ConnValues) : FactoryConnInterface {

    init {
        vc.apply {
            host = vc.host
            port = vc.port
            user = vc.user
            password = vc.password
        }
        println("On init method -> ${vc.toJsonString()}")
    }

    override fun connect() {
        // super keyword is the base class implemented
        // Access to the connect method on FactoryConnInterface -> super.connect()
        println("You are using the ${this.javaClass.simpleName}")
    }

    override fun disconnect() {
        println("You are not using the ${this.javaClass.simpleName}")
    }
}
