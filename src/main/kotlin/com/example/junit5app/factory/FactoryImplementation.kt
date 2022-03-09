package com.example.junit5app.factory

import com.example.junit5app.`interface`.factory.FactoryConnInterface

class FactoryImplementation {

    private val host = "localhost"
    private val port = 8080

    private val values = ConnValues(host, port, "rappipay", "secret")

    private var jdbc = JdbcConn(values)
    private var mysql = MySqlConn(values)
    private var oracle = OracleConn(values)
    private var postgres = PostgresConn(values)
    private var empty = EmptyConn()

    fun getConnection(dbType: String): FactoryConnInterface {
        return when (dbType) {
            "jdbc" -> jdbc
            "mysql" -> mysql
            "oracle" -> oracle
            "postgres" -> postgres
            else -> empty
        }
    }

}
