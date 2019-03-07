import java.text.DecimalFormat

private const val SECONDS_IN_EARTH_YEAR = 31_557_600.0

class SpaceAge (private val seconds: Long) {

    enum class Planet(val ratio: Double) {
        Earth(1.0),
        Mercury(0.2408467),
        Venus(0.61519726),
        Mars(1.8808158),
        Jupiter(11.862615),
        Saturn(29.447498),
        Uranus(84.016846),
        Neptune(164.79132);

        fun ratio() = SECONDS_IN_EARTH_YEAR * ratio
    }

    fun onEarth(): Double = round(seconds / Planet.Earth.ratio())
    fun onMercury(): Double = round(seconds / Planet.Mercury.ratio())
    fun onVenus(): Double = round(seconds / Planet.Venus.ratio())
    fun onMars(): Double = round(seconds / Planet.Mars.ratio())
    fun onJupiter(): Double = round(seconds / Planet.Jupiter.ratio())
    fun onSaturn(): Double = round(seconds / Planet.Saturn.ratio())
    fun onUranus(): Double = round(seconds / Planet.Uranus.ratio())
    fun onNeptune(): Double = round(seconds / Planet.Neptune.ratio())

    private fun round(number: Double): Double = (DecimalFormat("#.##")).format(number).toDouble()
}
