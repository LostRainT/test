package CircleV3;

public class circleV3 {
	/** �뾶 */
	private double radius;
	/** ��� */
	private double area;

	/**
	 * ��ӡ���
	 */
	public void show() {
		System.out.println("���Ϊ�� " + this.getArea());
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
			// this->��ָ��
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
