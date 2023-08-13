package group_assignment_with_fi;

public class Sphere implements ThreeDimentionalShape {
	private double rad, surf, vol;

	public void surfaceArea() {
		surf = 4 * PI * (rad * rad);
	}

	public void volume() {
		vol = (4 / 3) * PI * (rad * rad * rad);
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
	public void display() {	
		System.out.println("The Radius of the Sphere is: "
				+ getRad());
		System.out.println("The volume of of the Sphere is: "
				+ getVol());
		System.out.println("The Surface Area of the Sphere is: "
				+ getSurf());
		System.out.println("The Radius of the Sphere is: "
				+ getRad());
		
		
		
	}
}

class Cylinder implements ThreeDimentionalShape {
	private double rad, height, surf, vol;

	public void surfaceArea() {
		surf = 2 * PI * rad * (rad + height);
	}

	public void volume() {
		vol = PI * (rad * rad) * height;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
	
	public void display() {	
		System.out.println("The Radius of the Sphere is: "
				+ getRad());
		System.out.println("The volume of of the Sphere is: "
				+ getVol());
		System.out.println("The Surface Area of the Sphere is: "
				+ getSurf());
	
		
		
	}
}
class Cone implements ThreeDimentionalShape {
	private double rad, height, surf, vol;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void surfaceArea() {
		surf =  PI * rad * (rad + Math.sqrt((rad*rad)+(height*height)));
	}

	public void volume() {
		vol = (1/3)* PI* (rad * rad) * height;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
	public void display() {
		System.out.println("The Radius of the Cone is: "
			+ getRad());
		System.out.println("The Height of the Cone is: "
		+ getHeight());
		System.out.println("The volume of of the Cone is: "
				+ getVol());
		System.out.println("The Surface Area of the Cone is: "
				+ getSurf());

		
		
	}
}
class Cube implements ThreeDimentionalShape {
	private double sideLength,surf,vol;
	public void surfaceArea() {
		surf = 6*(sideLength*sideLength) ;
	}
	public void setSide(double s) {
	sideLength=s;
	
	}	
	public double getSide() {
		return sideLength;
		
		}	
	public void volume() {
		vol = sideLength*sideLength*sideLength;
	}

	public double getSurf() {
		return surf;
	}

	public double getVol() {
		return vol;
	}
	public void display() {
		System.out.println("The Side of the Cube is: "
				+ getSide());
		System.out.println("The volume of of the Cube is: "
				+ getVol());
		System.out.println("The Surface Area of the Cube is: "
				+ getSurf());
	
		
		
		
	}
	
	
}

