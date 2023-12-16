package Object;

import java.util.ArrayList;

public class Movie {
	private String title;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	

	public Movie(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
//		reviews.add(review1);
	}
	
	public String toString() {
		return String.format("title - %s, author - %s, reviews - [%s]", title, author, reviews);
	}
	
	
}
