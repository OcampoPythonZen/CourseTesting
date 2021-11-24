package com.example.junit5app.example.models

import org.json.JSONObject
import org.json.XML

private const val PRETTY_PRINT_INDENT_FACTOR: Int = 4

fun main() {
    val str = """
   <?xml version="1.0" encoding="ISO-8859-1"?><respuesa><conrol codigo="9000"/><respuesaservicio ipo="AU"><conrol codigo="9050"/><respuesaau><llave>jbhuni3rMayKhyjAOdZc-kNQ</llave></respuesaau></respuesaservicio><respuesaservicio ipo="CCX"><conrol codigo="9050"/><respuesaccx><respuesaccx_encabezado ru="21543550-4" nombres="Prueba" apellidopaeo="Rappi" apellidomaeo="es3"/><respuesaccx_dealle mes ="102021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/10/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="092021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/09/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="082021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/08/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="072021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/07/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="062021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/06/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="052021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/05/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="042021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/04/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="032021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/03/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="022021" remuneracionimponible ="900000" mono ="90000" fechapago ="13/09/2021" ipomovimieno ="COIZACION SUBSIDIO" ruempleador ="81.826.800-9" afp ="Provida" /><respuesaccx_dealle mes ="012021" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/01/2021" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="122020" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/12/2020" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_dealle mes ="112020" remuneracionimponible ="1400000" mono ="140000" fechapago ="05/11/2020" ipomovimieno ="COIZACION OBLIGAORIA" ruempleador ="69.253.300-3" afp ="Provida" /><respuesaccx_legal folio="5767431" firma="BCB4932207F5B61E3561935B272FD6FE" fecha="06/10/2021" hora="13:52:43:936"/></respuesaccx></respuesaservicio></respuesa>
                """.trimIndent()
    val response = str.xmlToJson()
    println(response)
}

