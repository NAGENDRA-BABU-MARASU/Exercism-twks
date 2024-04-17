public class Lasagna {
    public int expectedMinutesInOven(){
        int expectedMinutesInsideOven = 40;
        return expectedMinutesInsideOven;
    }


    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        int eachLayerPreparationTime = 2;
        return numberOfLayers * eachLayerPreparationTime;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInLasagna){
        return preparationTimeInMinutes(numberOfLayers) + minutesInLasagna;

    }
}
