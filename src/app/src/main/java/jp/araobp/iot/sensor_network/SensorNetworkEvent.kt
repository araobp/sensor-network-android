package jp.araobp.iot.sensor_network

/**
 * Events on EventBus
 */
class SensorNetworkEvent {

    /**
     * Sensor data from sensor network
     */
    data class SensorData(var timestamp: Long = System.currentTimeMillis(),
                          var rawData: String = "",
                          var deviceId: Int? = null,
                          var type: String? = null,
                          var data: List<Any?>? = null,
                          var schedulerInfo: SchedulerInfo? = null,
                          var reset: Boolean = false)

    /**
     * Scheduler info
     */
    data class SchedulerInfo(var schedulerInfoType: SchedulerInfoType? = null,
                             var timerScaler: Int? = 0,
                             var deviceMap: List<Int>? = null,
                             var schedule: List<List<Int>>? = null)

    /**
     * Scheduler info type
     */
    enum class SchedulerInfoType {
        TIMER_SCALER, DEVICE_MAP, SCHEDULE, STARTED, STOPPED
    }

    /**
     * EventBus event to display message on LCD
     *
     * @param lines list of line1(max 16 characters) and line2(max 16 characters)
     */
    data class DisplayMessage(var deviceId: Int, var lines: List<String>)

}