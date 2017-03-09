
public class BoxLauncher {

	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		Box box4 = new Box();
		Box box5 = new Box();
		int numBoxes = 5;
		String color = "Tan";
		System.out.println(box1.getColor());
		System.out.println(box1.getSize());
		
		box1.setWidth(2);
		box1.setLength(3);
		box1.setArea(2 * 3);
		System.out.println(box1.getWidth());
		System.out.println(box1.getLength());
		System.out.println(box1.getArea());
		box1.setWidth(4);
		System.out.println(box1.getArea());
		box1.setWidth(10);
		System.out.println(box1.getArea());
		
		box1.setColor("Pink");
		box2.setColor("Blue");
		box3.setColor("Red");
		box4.setColor("Orange");
		box5.setColor("Green");
		System.out.println(box1.getColor());
		System.out.println(box2.getColor());
		System.out.println(box3.getColor());
		System.out.println(box4.getColor());
		System.out.println(box5.getColor());
		
		System.out.println("numBoxes is " + numBoxes);
		box1.changeNum(numBoxes);
		System.out.println("numBoxes is " + numBoxes);
		System.out.println(box1.getColor());
		box1.changeColor(color);
		System.out.println(box1.getColor());
		

	}

}
