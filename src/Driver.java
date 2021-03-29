
public class Driver {

	public static void main(String[] args) throws Exception {
		Polygon polygon = new Polygon();
		polygon.addPoint(new Point(3, 4));
		polygon.addPoint(new Point(9, 8));
		polygon.addPoint(new Point(2, 7));
		polygon.addPoint(new Point(15, 6));
		polygon.end();
		polygon.display();
		System.out.println("Polygon toString " + polygon.toString());
		Rectangle rectangle = new Rectangle(new Point(1, 2), new Point(5, 8));
		rectangle.display();
		System.out.println(rectangle);
		Rectangle rectangle2 = new Rectangle(new Point(5, 8), new Point(1, 2));
		rectangle2.display();
		System.out.println(rectangle2);
		Rectangle rectangle3 = new Rectangle(new Point(1, 8), new Point(5, 2));
		rectangle3.display();
		rectangle3.setColor(100, 200, 150);
		rectangle3.setColor(256, 100, 100);
		rectangle3.setColor(100, 256, 100);
		rectangle3.setColor(120, 100, 256);
		rectangle3.setColor(-1, 100, 100);
		rectangle3.setColor(100, -1, 100);
		rectangle3.setColor(120, 100, -1);
		System.out.println(rectangle3);
		Rectangle rectangle4 = new Rectangle(new Point(5, 2), new Point(1, 8));
		rectangle4.display();
		System.out.println(rectangle4);
		try {
			Rectangle rectangle5 = new Rectangle(new Point(8, 19), new Point(8, 30));
			rectangle5.display();
		} catch (Exception e) {
			System.out.println("throws exception for rectangle");
		}
		Square square1 = new Square(new Point(4, 5), new Point(8, 9));
		square1.display();
		System.out.println(square1);
		try {
			Square square2 = new Square(new Point(8, 19), new Point(10, 30));
			square2.display();
		} catch (Exception e) {
			System.out.println("throws exception for square");
		}
	}

}
