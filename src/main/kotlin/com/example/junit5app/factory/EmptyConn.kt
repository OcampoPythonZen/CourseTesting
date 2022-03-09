package com.example.junit5app.factory

import com.example.junit5app.`interface`.factory.FactoryConnInterface

class EmptyConn : FactoryConnInterface {

    override fun connect() {
        super.connect()
    }

    override fun disconnect() {
        super.disconnect()
    }
}