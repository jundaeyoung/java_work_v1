package ch04;

// T는 Meterial를 상속받은 녀석으로 제한
public class GenericPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	private String toStirng() {
		return material.toString();
	}
	
	
	
}
