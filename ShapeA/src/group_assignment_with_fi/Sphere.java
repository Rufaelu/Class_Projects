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
	
		System.out.println("The Surface Area of the Sphere with a Radius of "+getRad()+"cm is: "
				+ getSurf());
				System.out.println("The Volume  of the Cylinder with a Radius of "+getRad()+"cm is: "
				+ getVol());
			System.out.println("_____________________________________________________________________________________________________________________________");

		
	}
}

class Cylinder implements ThreeDimentionalShape {
	private double rad, height, surf, vol;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

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
		System.out.println("The Surface Area of the Cylinder with a Radius of "+getRad()+"cm and a Height of "+getHeight()+ "cm is: "
				+ getSurf());
				System.out.println("The Volume  of the Cylinder with a Radius of "+getRad()+"cm and a Height of "+getHeight()+ "cm is: "
				+ getVol());
			System.out.println("_____________________________________________________________________________________________________________________________");

		
		
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
		
		System.out.println("The Surface Area of the Cone with the Radius of "+ getRad()+" cm and the Height of "+ getHeight()+"cm is: "+getSurf());
		System.out.println("The Volume of the Cone with the Radius of "+ getRad()+" cm and the Height of "+ getHeight()+"cm is: "+getSurf());
		System.out.println("_____________________________________________________________________________________________________________________________");
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
		
		System.out.println("The Surface Area of the Cube with a side of "+getSide()+"cm is: "
				+ getSurf());
				System.out.println("The Volume  of the Cube with a side of "+getSide()+"cm is: "
				+ getVol());
			System.out.println("_____________________________________________________________________________________________________________________________");

		
		
		
	}
	
	
}

