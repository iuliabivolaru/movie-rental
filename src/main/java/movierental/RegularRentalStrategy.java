package movierental;

/**
 * Created by iulia on 10/14/2015.
 */
public class RegularRentalStrategy implements RentalStrategy {

    private static final int DAYS_THRESHOLD = 2;
    private static final double COMMISION = 1.5;
    private static final int INITIAL_COMMISION = 2;

    private static final RegularRentalStrategy _instance =
            new RegularRentalStrategy();;

    private RegularRentalStrategy() {
    }

    public static RegularRentalStrategy getInstance() {
        return _instance;
    }

    @Override
    public double getMoviePrice(int numDays) {
        double price = INITIAL_COMMISION;
        if (numDays > DAYS_THRESHOLD) {
            return price + (numDays - DAYS_THRESHOLD) * COMMISION;
        }

        return price;
    }

    @Override
    public int getRentalBonusPoints(int numDays) {
        return 1;
    }
}