package extendsStudy;


public class Triangle extends Shape{

	private String color;
	
	Triangle(int weight, int length, String color) {
		super(weight, length);
		this.color = color;
	}
	
	public int area() {
		return (this.getWeight()*this.getLength())/2;
	}

}
