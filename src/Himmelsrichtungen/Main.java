package Himmelsrichtungen;

public class Main {
    public static void main(String[] args) {
        WheaterForecast tomorrow = new WheaterForecast();

        System.out.println(tomorrow.forecast(25, 75, true, DirectionEnum.EAST));
        System.out.println(tomorrow.forecast(26, 75, false, DirectionEnum.NORTH));



    }
}
