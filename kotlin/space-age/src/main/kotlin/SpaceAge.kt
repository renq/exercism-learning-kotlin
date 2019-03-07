import java.text.DecimalFormat

private const val SECONDS_IN_EARTH_YEAR = 31_557_600.0

class SpaceAge (private val seconds: Long) {

    enum class SolarYear(private val ratio: Double) {
        Earth(1.0),
        Mercury(0.2408467),
        Venus(0.61519726),
        Mars(1.8808158),
        Jupiter(11.862615),
        Saturn(29.447498),
        Uranus(84.016846),
        Neptune(164.79132);

        fun ratioToToEarth() = SECONDS_IN_EARTH_YEAR * ratio
    }

    fun onEarth(): Double = round(seconds / SolarYear.Earth.ratioToToEarth())
    fun onMercury(): Double = round(seconds / SolarYear.Mercury.ratioToToEarth())
    fun onVenus(): Double = round(seconds / SolarYear.Venus.ratioToToEarth())
    fun onMars(): Double = round(seconds / SolarYear.Mars.ratioToToEarth())
    fun onJupiter(): Double = round(seconds / SolarYear.Jupiter.ratioToToEarth())
    fun onSaturn(): Double = round(seconds / SolarYear.Saturn.ratioToToEarth())
    fun onUranus(): Double = round(seconds / SolarYear.Uranus.ratioToToEarth())
    fun onNeptune(): Double = round(seconds / SolarYear.Neptune.ratioToToEarth())

    private fun round(number: Double): Double = (DecimalFormat("#.##")).format(number).toDouble()
}
