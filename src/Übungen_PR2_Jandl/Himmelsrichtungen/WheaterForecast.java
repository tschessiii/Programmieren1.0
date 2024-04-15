package Übungen_PR2_Jandl.Himmelsrichtungen;

public class WheaterForecast {


    //Übungen_PR2.Konstanten erstellt mit "Rechtklick"-"Refactor"-"Introduce Constant"
    public static final String WILL_BE_CLOUDY = "Weather tomorrow will be cloudy.";
    public static final String WILL_BE_SUNNY = "Weather tomorrow will be sunny";
    public static final String WILL_BE_RAINY = "Weather tomorrow will be rainy.";


    //Attribute
    private DirectionEnum direction;
    private double temperature;
    private double humidity;
    private boolean isCloudy;


    //Ausgabe der Attribute
    public String forecast(double temperature, double humidity, boolean isCloudy, DirectionEnum direction) {
        if (direction.equals(DirectionEnum.EAST)) {//Wenn Himmelsrichtung East ist und
            if (isCloudy) {//ist automatisch True
                if (temperature > 25.3 && humidity > 74.6) {//Temperatur über 25.3° und Luftfeuchtgkeit über 74
                    return WILL_BE_RAINY;// Dann Regen
                } else if (temperature > 25 && humidity < 74) {
                    return WILL_BE_CLOUDY;//Konstante
                }else {
                    return WILL_BE_SUNNY;//Konstante
                }
            }else {
                if(temperature <10 && humidity >12){
                    return WILL_BE_SUNNY;//Konstante
                }else if (temperature >25 && humidity >80){
                    return WILL_BE_RAINY;//Konstante
                }else {

                    return WILL_BE_CLOUDY;//Konstante
                }
            }
        } else if (direction.equals(DirectionEnum.NORTH)) {
            if (isCloudy) {//ist automatisch True
                if (temperature > 25.3 && humidity > 74.6) {
                    return WILL_BE_RAINY;//Konstante
                } else if (temperature > 25 && humidity < 74) {
                    return WILL_BE_CLOUDY;//Konstante
                }else {
                    return WILL_BE_SUNNY;//Konstante
                }
            }else {
                if(temperature <10 && humidity >12){
                    return WILL_BE_SUNNY;//Konstante
                }else if (temperature >25 && humidity >80){
                    return WILL_BE_RAINY;//Konstante
                }else {
                    return WILL_BE_CLOUDY;//Konstante
                }
            }
        }else {
            return WILL_BE_CLOUDY;//Konstante
        }

    }


}
