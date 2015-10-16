package movierental;

import java.util.List;

/**
 * Created by iulia on 10/15/2015.
 */
public class CustomerPrinter {

    private static final String RENTAL_RECORD_FOR = "Rental Record for ";
    private static final String AMOUNT_OWED = "Amount owed is ";

    private Customer customer;
    private StringBuilder output;

    public CustomerPrinter (Customer customer) {
        this.customer = customer;
        output = new StringBuilder();
    }

    public String printCustomerRentalDetails() {
        output.setLength(0);
        //environment independency-with System.getProperty()
        output.append(RENTAL_RECORD_FOR).append(customer.getName()).append(System.getProperty("line.separator"));

        double rentalFee = processRentalsPerCustomer(customer.getRentals());

        output.append(AMOUNT_OWED).append(rentalFee).append(System.getProperty("line.separator"));
        output.append("You earned ").append(customer.getRenterPoints()).append(" frequent renter points");

        return output.toString();
    }

    private double processRentalsPerCustomer(List<Rental> rentals) {
        double totalRentalAmount = 0;
        for (Rental each : rentals) {
            totalRentalAmount += each.getRentalPrice();
            output.append(processRentalPerMovie(each));

        }

        return totalRentalAmount;
    }

    private StringBuilder processRentalPerMovie(Rental rental) {
        return new StringBuilder()
                .append("\t")
                .append(rental.getMovie().getTitle())
                .append("\t")
                .append(rental.getRentalPrice())
                .append(System.getProperty("line.separator"));
    }
}