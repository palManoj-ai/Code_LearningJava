package packageLinkedHashSet;

import java.util.Objects;

public class LinkedSet2Class {
	String name;
	int price;
	float weight;
	
	public LinkedSet2Class(String name, int price, float weight) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "LinkedSet2Class [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedSet2Class other = (LinkedSet2Class) obj;
		return Objects.equals(name, other.name) && price == other.price
				&& Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight);
	}

}
