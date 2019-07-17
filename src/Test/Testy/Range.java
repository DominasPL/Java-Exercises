package Test.Testy;

public class Range {

    private final long lowerBound;
    private final long upperBound;

    public Range(long lowerBound, long upperBound) {

        if (lowerBound > upperBound)
            throw new IllegalArgumentException("LowerBound cant be less than upperBound!");

        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }


    public boolean isInRange(long number) {

        return lowerBound <= number && upperBound >= number;
    }

}
