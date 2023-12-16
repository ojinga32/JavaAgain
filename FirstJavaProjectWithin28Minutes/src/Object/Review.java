package Object;

public class Review {
	private String name;
	private String description;
	private int rank;
	
	public Review(String name, String description, int rank) {
		this.name = name;
		this.description = description;
		this.rank = rank;
	}
	
	public String toString() {
		return String.format("name - %s, description - %s, rank - %d", name, description, rank);
	}
}
