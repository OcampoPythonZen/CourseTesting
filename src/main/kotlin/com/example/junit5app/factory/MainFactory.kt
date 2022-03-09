package com.example.junit5app.factory

fun main() {

    /* \Testing the normal classes without factory implementation
    val host = "localhost"
     val port = 8080
     val jdbc = JdbcConn(ConnValues(host, port, "jdbcRappi", "secret"))
     val mysql = MySqlConn(ConnValues(host, port, "mySqlRappi", "pass1234"))
     val oracle = OracleConn(ConnValues(host, port, "oracleDbRappi", "passRappipay"))
     val postgres = PostgresConn(ConnValues(host, port, "postUserRappi", "password234"))
     println()
     jdbc.connect()
     mysql.connect()
     oracle.connect()
     postgres.connect()
     println()
     jdbc.disconnect()
     mysql.disconnect()
     oracle.disconnect()
     postgres.disconnect()*/


    //Factory implementation
    val fi = FactoryImplementation()

    println()

    val jdbc = fi.getConnection("jdbc")
    jdbc.connect()
    jdbc.disconnect()

    println()

    val postgres = fi.getConnection("postgres")
    postgres.connect()
    postgres.disconnect()

    println()

    val empty = fi.getConnection("noName")
    empty.connect()
    empty.disconnect()

    val range: IntRange = 1..24
    val newRange = range.toMutableList()
    newRange.remove(9)
    newRange.remove(13)
    newRange.remove(14)

    println("Range: $range, New Range: $newRange")

    val behavior = "My String"
    println("take: ${behavior.take(4)}")

}
