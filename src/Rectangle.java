/**
 * 
 * @author Christopher Rectangle class- This class will take two points and
 *         store them into the polygon class. ICS 372 Dathan Brahma
 *
 */
public class Rectangle implements FilledShape {
	private Polygon polygon = new Polygon();
	private int red;
	private int blue;
	private int green;

	/**
	 * Will take in two points to make a rectangle. It will go through the 4 case.
	 * Each case will input the x and y value that is smaller into the polygon class
	 * first. Since the smaller values start out at the upper left hand corner. In
	 * the document is said counter clock wise. It will throw an exception if both
	 * points have the same x or y value.
	 * 
	 * @param point1
	 * @param point2
	 * @throws Exception
	 */
	public Rectangle(Point point1, Point point2) throws Exception {
		if (point1.getX() == point2.getX() || point1.getY() == point2.getY()) {
			throw new Exception("This will not make a rectangle");
		}
		if ((point1.getX() < point2.getX() && point1.getY() > point2.getY())) {
			polygon.addPoint(point1);
			polygon.addPoint(new Point(point1.getX(), point2.getY()));
			polygon.addPoint(point2);
			polygon.addPoint(new Point(point2.getX(), point1.getY()));
		} else if ((point1.getX() < point2.getX() && point1.getY() < point2.getY())) {
			polygon.addPoint(point1);
			polygon.addPoint(new Point(point2.getX(), point1.getY()));
			polygon.addPoint(point2);
			polygon.addPoint(new Point(point1.getX(), point2.getY()));
		} else if (point1.getX() > point2.getX() && point1.getY() < point2.getY()) {
			polygon.addPoint(point1);
			polygon.addPoint(new Point(point1.getX(), point2.getY()));
			polygon.addPoint(point2);
			polygon.addPoint(new Point(point2.getX(), point1.getY()));
		} else if (point1.getX() > point2.getX() && point1.getY() > point2.getY()) {
			polygon.addPoint(point1);
			polygon.addPoint(new Point(point2.getX(), point1.getY()));
			polygon.addPoint(point2);
			polygon.addPoint(new Point(point1.getX(), point2.getY()));
		}
		polygon.end();
	}

	@Override
	public void display() {
		System.out.println("Rectangle " + toString());

	}

	@Override
	public void setColor(int red, int green, int blue) {
		if ((red <= 255 && red >= 0) && (green <= 255 && green >= 0) && (blue <= 255 && blue >= 0)) {
			this.red = red;
			this.blue = blue;
			this.green = green;
		}

	}

	@Override
	public String toString() {
		String descriptionString = polygon.toString();
		descriptionString += "filled in (r = " + red + ", g = " + green + ", b = " + blue + ")";
		return descriptionString;
	}

}
