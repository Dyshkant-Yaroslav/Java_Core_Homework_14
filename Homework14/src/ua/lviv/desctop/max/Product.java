package ua.lviv.desctop.max;

public class Product {

	private String name;
	private int lenght;
	private int width;
	private int weight;

	public Product(String name, int lenght, int width, int weight) {
		super();
		this.name = name;
		this.lenght = lenght;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", lenght=" + lenght + ", width=" + width + ", weight=" + weight + "]";
	}

}
