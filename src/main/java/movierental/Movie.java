package movierental;

public class Movie {

	/* new release may change to regular, it is a volatile field
	A movie can be rented for a customer, as a new release,
	and for another customer as a children movie / student deduction */

	private String title;

	public Movie(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

}