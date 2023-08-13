package group_assignment_with_fi;
//import java.lang.*;
public class Circle implements TwoDimentionalShapes {
	   private double rad;
	    private double area;
	    private double perimeter;
	   public void area(){
	        area=(rad*rad)*PI;
	    }
	    public void perimeter(){
	        perimeter=2*PI*rad;
	    }
		public double getRad() {
			return rad;
		}
		public void setRad(double rad) {
			this.rad = rad;
		}
		public double getArea() {
			return area;
		}
		public double getPerimeter() {
			return perimeter;
		}
		public void display(){
			System.out.println("The Area of a circle with the Radius of "+ getRad()+ " is: "+ getArea());
			System.out.println("The Perimeter of a circle with the Radius of "+ getRad()+ " is: "+ getPerimeter());
		}
}

class Square implements TwoDimentionalShapes{
	 private double length;
	 private double area, perimeter;
	 public void area(){
	        area=length*length;
	    }
	    public void perimeter(){
	        perimeter=4*length;
	    }
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public double getArea() {
			return area;
		}
		public double getPerimeter() {
			return perimeter;
		}
		public void display(){
			System.out.println("The Area of a Square with the Size Length of "+ getLength()+ "cm is: "+ getArea()+"cm");
			System.out.println("The Perimeter of a Square with the Size Length of "+ getLength()+ "cm is: "+ getPerimeter());
		}
}

class Triangle implements TwoDimentionalShapes{
	private double base,side1, side2,height, area, perimeter;
	public void area(){
        area=0.5*base*height;
    }
    public void perimeter(){
        perimeter=side1*side2*base;
    }
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}	
	public void display(){
		
	}
}
class Rectangle implements TwoDimentionalShapes{
	private double length,width, area, perimeter;
	public void area(){
        area=length+width;
    }
    public void perimeter(){
        perimeter=2*(length+width);
    }
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void display(){
		
	}
	
}
abstract class Polygon implements TwoDimentionalShapes{
	protected double area,perimeter,side;
	public abstract void display();
	public abstract void area() ;
	public abstract void perimeter();
	public abstract void setSide(double x);
	//public abstract void setSide();
}

class Hexagon extends Polygon{

	public void setSide(double side) {
		this.side=side;
	}
	public void area() {
		area=(3*Math.sqrt(3)/2)*(side*side);
	}
	public void perimeter() {
		perimeter=6*side;
	}
	
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void display(){
		
	}
}
class Heptagon extends Polygon{
	
	public void setSide(double side) {
		this.side=side;
	}
	public void area() {
		area=cotpi*(side*side)*(7/4);
		
	}
	public void perimeter() {
		perimeter=7*side;
	}
	
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void display(){
		
	}
}
class Octagon extends Polygon{
	
	public void setSide(double side) {
		this.side=side;
	}
	
	public void area() {
		area=2*(1+Math.sqrt(2))*(side*side);
	}
	public void perimeter() {
		perimeter=8*side;
	}

	public double getSides() {
		return side;
	}
	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void display(){
		
	}
}