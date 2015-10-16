package movierental;

/**
 * Created by iulia on 10/14/2015.
 */

public class NewReleaseRentalStrategy implements RentalStrategy {

    private static final double COMMISSION = 3;

    private static final NewReleaseRentalStrategy instance =
            new NewReleaseRentalStrategy();

    private NewReleaseRentalStrategy() {
    }

    public static NewReleaseRentalStrategy getInstance() {
        return instance;
    }

    @Override
    public double getMoviePrice(int numDays) {
        return numDays * COMMISSION;

    }

    @Override
    public int getRentalBonusPoints(int numberOfDays) {
        int points = 1;
        if(numberOfDays > 1)
            points++;
        return points;
    }


}