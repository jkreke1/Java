
public class Box {
	private String color;
	private int size;
	private int area;
	private int length;
	private int width;
	
	public Box() {
		System.out.println("The constructor has been called.");
	}
	
	public int getArea() {
		return this.length * this.width;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getColor(){
		return color;
	}
	
	public void setColor(String col){
		this.color = col;
	}
	
	
	public int getSize(){
		return size;
	}
	
	public void changeNum(int num){
		num = 635;
		System.out.println("numBoxes is " + num);
	}
	
	public void changeColor(String col){
		this.color = col;
		System.out.println(this.getColor());
	}

}
