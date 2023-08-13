package group_assignment_with_fi;

import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int type = 0, choice = 0,n;
		boolean Exit = false;

	
		

		System.out.println("Hello, How many shapes do you want to calculate Today?");
		n = scan.nextInt();
		
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
		
		System.out.println(" What type of Shape do you want to calculate?");
		while (Exit = false) {
			
			for (int i = 0; i < n; i++) {
				
				System.out.println("1. 2D shapes\n" + "2. 3D shapes\n" + "0. exit");
				type = scan.nextInt();
				if (type == 1) {

					System.out.println("1. Circle\n" + "2. Square\n" + "3. Triangle\n" + "4. Rectangle\n"
							+ "5. Hexagon\n" + "6. Heptagon\n" + "7. Octagon\n" + "0. exit");
					choice = scan.nextInt();
					}
				
					if (type == 2) {
						System.out.println("1. Sphare" + "2. Cylinder\n" + "3. Cone\n" + "4. Cube\n"
								+ "5. Triangular Pyramid\n" + "6. Square pyramind\n" + "0. exit");
					}

					if (type == 0) {
						Exit = true;
					} else
						System.out.println("Invalid input");

					switch (choice) {
					case 1:
						if (type == 1) {
							c[0] = new Circle();

						}
					}

				}
			}
		}
	}

