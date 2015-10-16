package movierental;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals;
	private int renterPoints;

	public Customer(String name) {
		this.name = name;
		rentals = new ArrayList<>();
		renterPoints = 0;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
		renterPoints += arg.getBonusPoints();
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String getName() {
		return name;
	}

	public int getRenterPoints() { return renterPoints; }


	public String printMovieRentalDetails() {
		CustomerPrinter printer = new CustomerPrinter(this);
		return printer.printCustomerRentalDetails();
	}
}