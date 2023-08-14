package group_assignment_with_fi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int type = 9, choice = 0, n = 100, count = 0;
		boolean Exit = false;

		Circle c[] = new Circle[n];
		Square sq[] = new Square[n];
		Triangle tr[] = new Triangle[n];
		Rectangle rec[] = new Rectangle[n];
		Polygon hex[] = new Hexagon[n];
		Polygon hept[] = new Heptagon[n];
		Polygon oct[] = new Octagon[n];

		// 3D shapes
		Sphere sp[] = new Sphere[n];

		Cylinder cy[] = new Cylinder[n];
		Cone con[] = new Cone[n];
		Cube cub[] = new Cube[n];
		Pyramid[] tripy = new TriangularPyramid[n];
		Pyramid[] sqrpy = new SquarePyramid[n];
		while (Exit == false) {


			for (int i = 0; i < count + 1; i++) {
				
				while (type != 0 && type != 1 && type != 2){
					
				System.out.println(" What type of Shape do you want to calculate?");
				System.out.println("1. 2D shapes\n" + "2. 3D shapes\n" + "0. exit");
				type = scan.nextInt();
				if (type != 0 && type != 1 && type != 2){
				System.out.println("Invalid input");}
				else 
				break;
					}
				if (type == 1) {

					System.out.println("1. Circle\n" + "2. Square\n" + "3. Triangle\n" + "4. Rectangle\n"
							+ "5. Hexagon\n" + "6. Heptagon\n" + "7. Octagon\n" + "0. exit");
					choice = scan.nextInt();
				}

				if (type == 2) {
					System.out.println("1. Sphare\n" + "2. Cylinder\n" + "3. Cone\n" + "4. Cube\n"
							+ "5. Triangular Pyramid\n" + "6. Square pyramind\n" + "0. exit");
					choice = scan.nextInt();
				}

				if (type == 0) {
					Exit = true;
				}

				switch (choice) {
					case 1:
						if (type == 1) {
							c[i] = new Circle();
							System.out.println("Enter the Diameter of the Circle: ");
							c[i].setRad(scan.nextDouble());
							c[i].area();
							c[i].perimeter();
							// c[i].display();
							count++;
							
						}
						if (type == 2) {
							System.out.println("Enter the Sphere diameter: ");
							sp[i].setRad(scan.nextDouble() / 2);
							sp[i].surfaceArea();
							sp[i].volume();
							count++;
							

						}
						break;
					case 2:
						if (type == 1) {
							sq[i] = new Square();
							System.out.println("Enter the Square's Length: ");
							sq[i].setLength(scan.nextDouble());
							sq[i].area();
							sq[i].perimeter();
							count++;
							
						}
						if (type == 2) {
							cy[i] = new Cylinder();
							System.out.println("Enter the Diameter of the Cylinder: ");
							cy[i].setRad(scan.nextDouble() / 2);
							System.out.println("Enter the Height of the cylinder: ");
							cy[i].setHeight(scan.nextDouble());
							cy[i].surfaceArea();
							cy[i].volume();
							count++;
							
						}
						break;
					case 3:
						if (type == 1) {
							tr[i] = new Triangle();
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
							
						}
						if (type == 2) {
							con[i] = new Cone();
							System.out.println("Enter the Diameter of the Cone: ");
							con[i].setRad(scan.nextDouble() / 2);
							System.out.println("Enter the height of the Cone:");
							con[i].setHeight(scan.nextDouble());
							con[i].surfaceArea();
							con[i].volume();
							count++;
							
						}
						break;
					case 4:
						if (type == 1) {
							rec[i] = new Rectangle();
							System.out.println("Enter the Length and Width of the Rectangle: ");
							rec[i].setLength(scan.nextDouble());
							rec[i].setWidth(scan.nextDouble());
							rec[i].area();
							rec[i].perimeter();
							count++;
							

						}
						if (type == 2) {
							cub[i] = new Cube();
							System.out.println("Enter the Length of the sides of the Cube: ");
							cub[i].setSide(scan.nextDouble());
							cub[i].surfaceArea();
							cub[i].volume();
							count++;
							

						}
						break;
					case 5:
						if (type == 1) {
							hex[i] = new Hexagon();
							System.out.println("Enter side of the Hexagon: ");
							hex[i].setSide(scan.nextDouble());
							hex[i].area();
							hex[i].perimeter();
							count++;
							
						}
						if (type == 2) {
							double tribase = 0, triheight = 0;
							System.out.println("Enter the Triangle Base of the Triangular Pyramid:");
							tribase = scan.nextDouble();
							System.out.println("Enter the Triangle Height of the Triangular Pyramid:");
							triheight = scan.nextDouble();
							tripy[i] = new TriangularPyramid(tribase, triheight);
							System.out.println("Enter the Pyramid Height of the Triangular Pyramid:");
							tripy[i].setPyramheight(scan.nextDouble());
							tripy[i].surfaceArea();
							tripy[i].volume();
							count++;
							
						}
						break;
					case 6:
						if (type == 1) {
							hept[i] = new Heptagon();
							System.out.println("Enter the side of the Heptagon: ");
							hept[i].setSide(scan.nextDouble());
							hept[i].area();
							hept[i].perimeter();
							count++;
							
						}
						if (type == 2) {
							System.out.println("Enter the side of the Squares of the Square pyramid: ");
							sqrpy[i] = new SquarePyramid(scan.nextDouble());
							System.out.println("Enter the Height of the Square Pyramid: ");
							sqrpy[i].setPyramheight(scan.nextDouble());
							sqrpy[i].surfaceArea();
							sqrpy[i].volume();
							count++;
							
						}
						break;
					case 7:
						if (type == 1) {
							oct[i] = new Octagon();
							System.out.println("Enter the side of the Octagon: ");
							oct[i].setSide(scan.nextDouble());
							oct[i].area();
							oct[i].perimeter();
							count++;
							
						}
						break;
					case 0:
						if (type == 1)
							Exit = true;
						if (type == 2)
							Exit = true;
						break;
					default:
						System.out.println("Invalid Input");
						i--;
				}

			}
		}
		for (int i = 0; i < count; i++) {

			if (sq[i] != null) {//Checks if it is a null or not and then Displays
				sq[i].display();

			}

			if (c[i] != null) {
				c[i].display();
			}

			if (tr[i] != null) {
				tr[i].display();
			}

			if (rec[i] != null) {
				rec[i].display();
			}

			if (hex[i] != null) {
				hex[i].display();
				
			}

			if (hept[i] != null) {
				hept[i].display();
			}

			if (oct[i] != null) {
				oct[i].display();
			}
			if (sp[i] != null) {
				sp[i].display();
			}

			if (cy[i] != null)
				cy[i].display();
			if (con[i] != null) {
				con[i].display();
			}
			if (cub[i] != null) {
				cub[i].display();
			}
			if (tripy[i] != null) {
				tripy[i].display();
			}
			if (sqrpy[i] != null) {
				sqrpy[i].display();
			}

		}
	}
}
