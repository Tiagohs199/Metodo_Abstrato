
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;

import entities.Shape;
import entities.enume.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		 

		System.out.print("Enter the number of shpes: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print("Rectangle or Circle (r/c)? ");
			char r = sc.next().charAt(0);
			if(r =='r') {
				System.out.print("Color (black/blue/red): ");
				Color color = Color.valueOf(sc.next());
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new entities.Rectangle(color, width, height));
		
			}else {
				System.out.print("Color (black/blue/red): ");
				Color color = Color.valueOf(sc.next());
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		System.out.println("Shape areas: ");
		for (Shape shape: list) {
			System.out.printf(String.format("%.2f %n",shape.area()));
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
