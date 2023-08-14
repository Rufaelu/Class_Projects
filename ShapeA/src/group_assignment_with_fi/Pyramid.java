package group_assignment_with_fi;

public abstract class Pyramid implements ThreeDimentionalShape{
	protected double surf,vol,baseArea,sq_side,pyramheight, lateral_area;
	public abstract void surfaceArea();
	public abstract void volume();
	public abstract void display();
	public abstract void setPyramheight(double pyramheight);
}
class TriangularPyramid extends Pyramid implements TwoDimentionalShapes{
	private double tribase, triheight;
	TriangularPyramid(double base,double height){
		tribase=base;
        triheight=height;
	}
	public void surfaceArea() {
		area();
		area(pyramheight);// trying to overload
		perimeter();
		surf=baseArea+lateral_area;
	}
	public void volume() {
		vol= (baseArea*pyramheight)/2;
	}
	public void area(double x) {
		lateral_area=0.5*(tribase*x);
	}
	public void area() {
		baseArea=0.5*tribase*triheight;
	}
	public void perimeter() {
		lateral_area*=3;
	}
	public double getTribase() {
		return tribase;
	}
	public void setTribase(double tribase) {
		this.tribase = tribase;
	}
	public double getTriheight() {
		return triheight;
	}
	public void setTriheight(double triheight) {
		this.triheight = triheight;
	}
	public double getPyramheight() {
		return pyramheight;
	}
	public void setPyramheight(double pyramheight) {
		this.pyramheight = pyramheight;
	}
	public double getBaseArea() {
		return baseArea;
	}
	public double getLateral_area() {
		return lateral_area;
	}
	public double getSurf() {
		return surf;
	}
	public double getVol() {
		return vol;
	}
	public void display() {
		System.out.println("The Surface Area of The Triangular Pyramid with a Triangle Base "+getTribase()+"cm, a Pyramid of "+getTriheight()+"cm and a Triangle Base of "+getTribase()+ "cm is: "
				+ getSurf());
		System.out.println("The volume of The Triangular Pyramid with a Triangle Base "+getTribase()+"cm, a Pyramid of "+getTriheight()+"cm and a Triangle Base of "+getTribase()+ "cm is: "
				+ getVol());
		System.out.println("_____________________________________________________________________________________________________________________________");
	}
}
class SquarePyramid extends Pyramid implements TwoDimentionalShapes{
	SquarePyramid(double side){
		sq_side=side;
	}
	public void surfaceArea() {
		area();
		area(pyramheight);// trying to overload
		perimeter();	
		surf=baseArea+lateral_area;
	}
	public void volume() {
		vol= (baseArea*pyramheight)/2;
	}
	 void area(double x) {
		lateral_area=0.5*(sq_side*x);
	}
	public void area() {
		baseArea=sq_side*sq_side;
	}
	public void perimeter() {
		lateral_area*=4;
	}
	public double getBaseArea() {
		return baseArea;
	}
	public double getLateral_area() {
		return lateral_area;
	}
	public double getSurf() {
		return surf;
	}
	public double getVol() {
		return vol;
	}	
	public void setPyramheight(double pyramheight) {
	this.pyramheight=pyramheight;	
	}
	double getSq_side() {
		return sq_side;
	}
	double getPyramheight(){
		return pyramheight;
	}

	public void display() {
		System.out.println("The Surface Area of The Square Pyramid with a Side of "+getSq_side()+"cm and a Pyramid Height of "+getPyramheight()+"cm is: "
				+ getSurf());
		System.out.println("The Volume of The Square Pyramid with a Side of "+getSq_side()+"cm and a Pyramid Height of "+getPyramheight()+"cm is: "
				+ getVol());
			System.out.println("_____________________________________________________________________________________________________________________________");

	}
}

