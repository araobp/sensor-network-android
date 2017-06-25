# Bicycle

I develop in-bicycle network using the output from [sensor-network](https://github.com/araobp/sensor-network).

## Requirements

- Very low power consumption
- Cheap
- Show current speed, temperature and humidity on character LCD
- Save time-series data (speed, temperature, humidty, acceleration and location) onto EEPROM (256K bytes)
- Transfer the data on EEPROM to IoT GW

## Network

```
                                    (       )
 [Controller]--UART/USB--[IoT GW]--(  Cloud  )
      |                             (       )
      |                                                                                                
    --+---+-----------------+-----------------+------------+------------+--- I2C bus
          |                 |                 |            |            |
   [hall sensor]  [temp/humid sensor]  [accelerometer]   [GPS]      [LCD/LED]
    Front spoke      on handlebar       under saddle   rear fendor  on handlebar
```