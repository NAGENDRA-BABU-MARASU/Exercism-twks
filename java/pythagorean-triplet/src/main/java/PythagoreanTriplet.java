import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private final int numberOne;
    private final int numberTwo;
    private final int numberThree;

    PythagoreanTriplet(int numberOne, int numberTwo, int numberThree) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return numberOne == that.numberOne && numberTwo == that.numberTwo && numberThree == that.numberThree;
    }


    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum;
        int maxFactor = Integer.MAX_VALUE;

        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> tripletsList = new ArrayList<>();
            findAllValidPythagoreanTriplets(tripletsList);
            return tripletsList;
        }


        private void findAllValidPythagoreanTriplets(List<PythagoreanTriplet> tripletsList) {
            for (int numOne = 1; numOne <= sum / 3 && numOne <= maxFactor; numOne++) {
                for (int numTwo = numOne + 1; numTwo <= sum / 2 && numTwo <= maxFactor; numTwo++) {
                    int numThree = sum - numOne - numTwo;
                    if (numThree <= maxFactor) {
                        if (isPythagoreanTriplet(numOne,numTwo,numThree)) {
                            tripletsList.add(new PythagoreanTriplet(numOne, numTwo, numThree));
                        }
                    }
                }
            }
        }

        private static boolean isPythagoreanTriplet(int numOne, int numTwo, int numThree) {
            int numOneSquare = numOne*numOne;
            int numTwoSquare = numTwo*numTwo;
            int numThreeSquare = numThree*numThree;
            return numOneSquare + numTwoSquare == numThreeSquare;
        }

    }

}