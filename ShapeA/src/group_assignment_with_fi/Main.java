package group_assignment_with_fi;

import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int type = 0, choice = 0,n=10,count=0,sqcount=0,tricount=0,circount=0,reccount=0,hexcount=0,heptcount=0,octcount=0,sphcount=0,concount=0,cubcount=0,cylcount=0,tpcount=0,sqpcount=0;
		boolean Exit = false;

		
		

		
		
		Circle c[] = new Circle[n];
		Square sq[] = new Square[n];
		Triangle tr[] = new Triangle[n];
		Rectangle rec[] = new Rectangle[n];
		Polygon hex[]=new Hexagon[n];
		Polygon hept[]= new Heptagon[n];
		Polygon oct[]=new Octagon[n];
		
		//3D shapes
		Sphere sp[]=new Sphere[n];
		Cylinder cy[]=new Cylinder[n];
		Cone con[]=new Cone[n];
		Cube cub[]=new Cube[n];
		Pyramid []tripy=new TriangularPyramid[n];
		Pyramid []sqrpy=new SquarePyramid[n];
		
		for(int i=0;i<n;i++) {
			/*
			 * // c[i] = new Circle(); sq[i]= new Square(); tr[i] = new Triangle(); rec[i] =
			 * new Rectangle(); hex[i]=new Hexagon(); hept[i]= new Heptagon(); oct[i]=new
			 * Octagon();
			 * 
			 * //3D shapes sp[i]=new Sphere(); cy[i]=new Cylinder(); con[i]=new Cone();
			 * cub[i]=new Cube(); tripy[i]=new TriangularPyramid(); sqrpy[i]=new
			 * SquarePyramid();
			 */
		}
	
		while (Exit==false) {
		
			for (int i = 0; i < count+1; i++) {
				System.out.println(" What type of Shape do you want to calculate?");
				System.out.println("1. 2D shapes\n" + "2. 3D shapes\n" + "0. exit");
				type = scan.nextInt();
				if (type == 1) {

					System.out.println("1. Circle\n" + "2. Square\n" + "3. Triangle\n" + "4. Rectangle\n"
							+ "5. Hexagon\n" + "6. Heptagon\n" + "7. Octagon\n" + "0. exit");
					choice = scan.nextInt();
					}
				
					if (type == 2) {
						System.out.println("1. Sphare\n" + "2. Cylinder\n" + "3. Cone\n" + "4. Cube\n"
								+ "5. Triangular Pyramid\n" + "6. Square pyramind\n" + "0. exit");
					}

					if (type == 0) {
						Exit = true;
					} 
					else if(type!=0&&type!=1&&type!=2)
						System.out.println("Invalid input");

					switch (choice) {
					case 1:
						if (type == 1) {
							c[i] = new Circle();
							System.out.println("Enter the Diameter of the Circle: ");
							c[i].setRad(scan.nextDouble());
							c[i].area();
							c[i].perimeter();
							//c[i].display();
							count++;
							circount++;
						}
						if(type==2) {
							System.out.println("Enter the Sphere diameter: ");
							sp[i].setRad(scan.nextDouble()/2);
							sp[i].surfaceArea();
							sp[i].volume();
							count++;
							sphcount++;
							
						}
						break;
					case 2:
						if(type==1) {
							sq[i]= new Square();
							System.out.println("Enter the Square's Length: ");
							sq[i].setLength(scan.nextDouble());
							sq[i].area();
							sq[i].perimeter();
							count++;
							sqcount++;
						}
						if(type==2) {
							cy[i]= new Cylinder();
							System.out.println("Enter the Diameter of the Cylinder: ");
							cy[i].setRad(scan.nextDouble()/2);
							System.out.println("Enter the Height of the cylinder: ");
							cy[i].setHeight(scan.nextDouble());
							cy[i].surfaceArea();
							cy[i].volume();
							count++;
							cylcount++;
						}
						break;
					case 3:
						if(type==1) {
							tr[i]=new Triangle();
							System.out.println("Enter the base of the triangle: ");
							tr[i].setBase(scan.nextDouble());
							System.out.println("Enter the height of the triangle: ");
							tr[i].setHeight(scan.nextDouble());
							System.out.println("Enter the length of the triangle's Side: ");
							tr[i].setSide1(scan.nextDouble());
							System.out.println("Enter the length of the triangle's other Side: ");
							tr[i].setSide2(scan.nextDouble());
							tr[i].area();
							tr[i].perimeter();
							count++;
							tricount++;
						}
						if(type==2) {
							con[i]=new Cone();
							System.out.println("Enter the Diameter of the Cone: ");
							con[i].setRad(scan.nextDouble()/2);
							System.out.println("Enter the height of the Cone:");
							con[i].setHeight(scan.nextDouble());
							con[i].surfaceArea();
							con[i].volume();
							count++;
							concount++;
						}
						break;
					case 4:
						if(type==1) {
							rec[i]=new Rectangle();
							System.out.println("Enter the Length and Width of the Rectangle: ");
							rec[i].setLength(scan.nextDouble());
							rec[i].setWidth(scan.nextDouble());
							rec[i].area();
							rec[i].perimeter();
							count++;
							reccount++;
							
						}
						if(type==2) {
							cub[i]= new Cube();
							System.out.println("Enter the Length of the sides of the Cube: ");
							cub[i].setSide(scan.nextDouble());
							cub[i].surfaceArea();
							cub[i].volume();
							count++;
							cubcount++;
							
						}
						break;
					case 5:
						if(type==1) {
							hex[i]=new Hexagon();
							System.out.println("Enter side of the Hexagon: ");
							hex[i].setSide(scan.nextDouble());
							hex[i].area();
							hex[i].perimeter();
							count++;
							hexcount++;
						}
						if(type==2) {
							tripy[i]=new TriangularPyramid();
							System.out.println("Enter the Triangle Base of the Triangular Pyramid:");
							tripy[i].setTribase(scan.nextDouble());
							System.out.println("Enter the Triangle Height of the Triangular Pyramid:");
							tripy[i].setTriheight(scan.nextDouble());
							System.out.println("Enter the Pyramid Height of the Triangular Pyramid:");
							tripy[i].setPyramheight(scan.nextDouble());
							tripy[i].surfaceArea();
							tripy[i].volume();
							count++;
							tpcount++;
						}
						break;
					case 6:
						if(type==1) {
							hept[i]=new Heptagon();
							
						}
					
					}

				}
			}
		for(int i=0;i<count;i++) {
			//c[i].display();
			sq[i].display();
		}
		}
	}

