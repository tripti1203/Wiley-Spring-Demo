package generics;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	public abstract void drawShape();
}

class Square extends Shape{
	
	@Override
	public void drawShape() {
		System.out.println("Drawing Square here..");
	}
}

class Rectangle extends Shape{
	
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle Here..");
	}
}

public class GenericClassExample4 {
	
	public static void drawing(List<? extends Shape> shapeList) {
		for(Shape shape : shapeList) {
			shape.drawShape();
		}

	}

	public static void main(String[] args) {
		
		List<Square> list1 = new ArrayList<Square>();
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());
		list1.add(new Square());
		
		drawing(list1);
		
		List<Rectangle> list2 = new ArrayList<Rectangle>();
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		list2.add(new Rectangle());
		
		drawing(list2);
	}

}
