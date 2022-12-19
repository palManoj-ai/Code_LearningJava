package packageTreeSet;

import java.util.Objects;

public class TreeSet2Class implements Comparable<TreeSet2Class> {
	String name;
	int price;
	float weight;
	
	public TreeSet2Class(String name, int price, float weight) {
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
		return "TreeSet2Class [name=" + name + ", price=" + price + ", weight=" + weight + "]";
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
		TreeSet2Class other = (TreeSet2Class) obj;
		return Objects.equals(name, other.name) && price == other.price
				&& Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight);
	}

	@Override
	public int compareTo(TreeSet2Class o) {
		// TODO Auto-generated method stub
		int x=o.getPrice()-this.getPrice();
		return x;
	}
	
	
}
