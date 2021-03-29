/**
 * 
 * @author Christopher Lara-Betancourt Polygon class- Will be use for storing
 *         points by using the point class. ICS 372 Dathan Brahma
 *
 */
public class Polygon implements Shape {
	private Point[] points;
	private int numberOfPoints;

	/**
	 * Creates the array to hold at most 10 Point objects. The addPoint() method
	 * expands the size as needed.
	 */
	public Polygon() {
		points = new Point[10];
	}

	/**
	 * Adds one more vertex to the polygon
	 *
	 * @param point
	 */
	public void addPoint(Point point) {
		if (this.points.length == numberOfPoints + 1) {
			Point[] temp = new Point[numberOfPoints * 2];
			System.arraycopy(points, 0, temp, 0, numberOfPoints);
			points = temp;
		}
		points[numberOfPoints++] = point;
		points[numberOfPoints] = point;
	}

	/**
	 * Adds the first vertex as the last vertex, so the drawing (if we are drawing)
	 * would be complete.
	 */
	public void end() {
		points[numberOfPoints] = points[0];
	}

	@Override
	public void display() {
		System.out.println("Polygon " + toString());
	}

	@Override
	public String toString() {
		String string = "Vertices ";
		for (int index = 0; index < numberOfPoints; index++) {
			string += "(" + points[index].getX() + ", " + points[index].getY() + ") ";
		}
		return string;
	}

}
