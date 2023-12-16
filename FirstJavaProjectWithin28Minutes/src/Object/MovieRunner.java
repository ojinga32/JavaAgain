package Object;

public class MovieRunner {

	public static void main(String[] args) {
		Movie movie = new Movie("Harry Poter", "JK");
		movie.addReview(new Review("reviewer", "interesting", 5));
		movie.addReview(new Review("critic", "wonderful", 5));
		movie.addReview(new Review("Son", "fantastic", 5));
		System.out.println(movie);

	}

}
