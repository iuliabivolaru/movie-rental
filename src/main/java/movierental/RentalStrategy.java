package movierental;

/**
 * Created by iulia on 10/14/2015.
 */
public interface RentalStrategy {

    double getMoviePrice(int numberOfDays);
    int getRentalBonusPoints(int numberOfDays);

}
