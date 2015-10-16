package movierental;

/**
 * Created by iulia on 10/14/2015.
 */

public class NewReleaseRentalStrategy implements RentalStrategy {

    private static final double COMMISION = 3;

    private static final NewReleaseRentalStrategy _instance =
            new NewReleaseRentalStrategy();

    private NewReleaseRentalStrategy() {
    }

    public static NewReleaseRentalStrategy getInstance() {
        return _instance;
    }

    @Override
    public double getMoviePrice(int numDays) {
        return numDays * COMMISION;

    }

    @Override
    public int getRentalBonusPoints(int numDays) {
        int points = 1;
        if(numDays > 1)
            points++;
        return points;
    }


}