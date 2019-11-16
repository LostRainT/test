package CircleV3;

public class circleV3 {
	/** 半径 */
	private double radius;
	/** 面积 */
	private double area;

	/**
	 * 打印面积
	 */
	public void show() {
		System.out.println("面积为： " + this.getArea());
	}

	/**
	 * 
	 * @param radius
	 */
	public circleV3(double radius) {
		this.setRadius(radius);
	}

	/**
	 * 
	 * @return
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius
	 */
	public void setRadius(double radiusForSetter) {
		if (radius <= 0) {
			radius = 1;
		} else {
			// this->自指针
			this.radius = radiusForSetter;
		}

	}

	/**
	 * 
	 * @return
	 */
	public double getArea() {
		area = radius * radius * Math.PI;
		return area;

	}

}
