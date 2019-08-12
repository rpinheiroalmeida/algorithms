package timeconversion

fun timeConversion(s: String): String {
    val hourRegex = "^(?:([01]?\\d|2[0-3]):([0-5]?\\d):)?([0-5]\\d)([AP][M])\$".toRegex()
    val matchResult = hourRegex.find(s)

    val (hour, minute, second, ampm) = matchResult!!.destructured

    val militarHour = if (ampm == "PM") hour.toInt() + 12 else if(hour == "12") "00" else hour

    return "${if (militarHour == 24) "12" else militarHour}:${minute}:${second}"
}