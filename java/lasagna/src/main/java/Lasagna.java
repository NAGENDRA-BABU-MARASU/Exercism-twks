public class Lasagna {
    public static final int EXPECTED_MINUTES_INSIDE_OVEN = 40;

    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_INSIDE_OVEN;
    }


    public int remainingMinutesInOven(int actualMinutesInOven) {
        return EXPECTED_MINUTES_INSIDE_OVEN - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        int eachLayerPreparationTime = 2;
        return numberOfLayers * eachLayerPreparationTime;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInLasagna){
        return preparationTimeInMinutes(numberOfLayers) + minutesInLasagna;
    }
}
