package jp.araobp.iot.sensor_network

/*
* Plug&Play protocol
*
* @see <a href="https://github.com/araobp/sensor-network">https://github.com/araobp/sensor-network</a>
* */
object SensorNetworkProtocol {

    const val STA = "STA"
    const val STP = "STP"
    const val RSC = "RSC"
    const val GET = "GET"
    const val SET = "SET"
    const val I2C = "I2C"
    const val WHO = "WHO"
    const val MAP = "MAP"
    const val SCN = "SCN"

    const val FLOAT             = "FLOAT"
    const val INT8_T            = "INT8_T"
    const val UINT8_T           = "UINT8_T"
    const val INT16_T           = "INT16_T"
    const val UINT16_T          = "UINT16_T"

    const val AQM1602XA_RN_GBW  = 16
    const val A1324LUA_T        = 17
    const val HDC1000           = 18
    const val KXR94_2050        = 19

}