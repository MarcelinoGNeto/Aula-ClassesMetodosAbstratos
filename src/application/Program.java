package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
/*CLASSES ABSTRATAS
* Reuso dos m�todos nas subclasses;
* Polimorfismo: a superclasse classe gen�rica permite tratar de forma f�cil e uniforme
* todos os tipos de conta, inclusive com polimorfismo.
* Nota��o UML em it�lico (nome da classe)
* M�TODOS ABSTRATOS:
* S�o m�todos que n�o possuem implementa��o
* M�todos precisam ser abstratos quando a classe � gen�rica demais para conter sua implementa��o
* Se uma classe possuir pelo menos um m�todo abstrato, ent�o a classe tbm se torna abstrata
* Nota��o UML em it�lico (nome do m�todo)
*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
			
		sc.close();
	}

}
