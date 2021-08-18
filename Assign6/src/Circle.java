import java.lang.Math.*;
public class Circle {
	private
	double x,y;
	double radius;
	public Circle(double rad) {
		x=0;
		y=0;
		radius=rad;
	}
	public Circle(double x_,double y_,double rad) {
		x=x_;
		y=y_;
		radius=rad;
	}
	double area() {
		double result;
		result = radius*radius*Math.PI;
		System.out.println("The area is: "+result+ " sq units");
	return result;
	}
	
	public void printinfo() {
		System.out.print("The co-ordinates are: (" +x+"," +y+")");
		System.out.print(". The radius is: "+ radius);
		System.out.println();
		
	}
	

	public static void main(String args[]) {
		Circle[] circles;
		circles=new Circle[3];
		
		circles[0] = new Circle(4);
		circles[1] = new Circle(1,2,3);
		circles[2] = new Circle(1,1,5);
		for(int i=0; i<3; i++) {
			circles[i].printinfo();
			circles[i].area();
		}
		
	}
}
