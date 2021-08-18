import static java.lang.Math.*;
public class Circle extends Shape {
	Shape.Point centerpoint;
	private double radius;
	private Color color;
	public Circle(Shape.Point centerpoint ,double rad ) {
		this.radius=rad;
	}
	public Circle(Shape.Point centerpoint,double rad,Color _clr) {
		this.radius=rad;
		this.centerpoint=centerpoint;
		this.color=_clr;
		
	}
	@Override
	public double area(){
		double result;
		result= PI*radius*radius;
		return result;	
	}
	@Override
	public String getType() {
		return "Circle";
	}
	public String toString() {
		return "Shape Type: "+this.getType()+ " - Color: " +this.color+ " - Area: " +this.area()+" sq units "+"- Center:" +centerpoint+ " - Radius: "+this.radius;
		
	}
	
	 public static void main(String args[]) {
	     Shape s1 = new Circle(new Shape.Point(1,1), 2.5, new Color(0.5,0.5,0));
	     System.out.println(s1);
	  }

}

