package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

	private Movie _movie;
	private RentalStrategy _rentalStrategy;
	private int _daysRented;

	public Rental(Movie movie, int daysRented, RentalStrategy st) {
		_movie = movie;
		_daysRented = daysRented;
		_rentalStrategy = st;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	/* delegation */
	public double getRentalPrice() {
		return _rentalStrategy.getMoviePrice(_daysRented);
	}

	/* middle man */
	public int getBonusPoints() {
		return _rentalStrategy.getRentalBonusPoints(_daysRented);
	}


}