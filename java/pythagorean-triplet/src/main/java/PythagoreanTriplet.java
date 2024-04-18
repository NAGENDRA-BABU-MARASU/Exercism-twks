import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private final int a;
    private final int b;
    private final int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
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
            for(int a = 1; a <= sum/3; a++){
                if(a <= maxFactor) {
                    for(int b = a+1; b <= sum/2; b++){
                        if(b <=maxFactor){
                            int c = sum - a - b;
                            if(c <=maxFactor){
                                int aSquare = a*a;
                                int bSquare = b*b;
                                int cSquare = c*c;
                                if(aSquare + bSquare == cSquare){
                                    tripletsList.add(new PythagoreanTriplet(a,b,c));
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}