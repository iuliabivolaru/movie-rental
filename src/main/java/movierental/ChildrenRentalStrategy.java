package movierental;

/**
 * Created by iulia on 10/14/2015.
 */
public class ChildrenRentalStrategy implements RentalStrategy {

    private static final double COMMISSION = 1.5;
    private static final int DAYS_THRESHOLD = 3;

    private static final ChildrenRentalStrategy instance =
            new ChildrenRentalStrategy();

    private ChildrenRentalStrategy(){  }

    public static ChildrenRentalStrategy getInstance() {
        return instance;
    }

    @Override
    public double getMoviePrice(int numberOfDays) {
        double price = COMMISSION;
        if (numberOfDays > DAYS_THRESHOLD) {
            return price + (numberOfDays - DAYS_THRESHOLD) * COMMISSION;
        }

        return price;
    }

    @Override
    public int getRentalBonusPoints(int numberOfDays) {
        return 1;
    }
}