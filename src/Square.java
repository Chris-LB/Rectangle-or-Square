/**
 * 
 * @author Christopher Lara-Betancourt Square class - Will take in two points
 *         and use the rectangle constructor to store them in the polygon class.
 *         ICS 372 Dathan Brahma
 *
 */
public class Square extends Rectangle implements FilledShape {

	/**
	 * It will check that if both don't equal each other because if they do it would
	 * mean the two points would form a line. It will throw an exception if the two
	 * points form a line.
	 * 
	 * @param point1
	 * @param point2
	 * @throws Exception
	 */
	public Square(Point point1, Point point2) throws Exception {
		super(point1, point2);
		if (point2.getX() - point1.getX() != point2.getY() - point1.getY()) {
			throw new Exception("These points will not be able to make a square");
		}
	}

	@Override
	public void display() {
		System.out.println("Square " + toString());
	}

}
