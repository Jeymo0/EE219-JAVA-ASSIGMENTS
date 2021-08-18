public class Triangle extends Shape{
     Shape.Point p1;
     Shape.Point p2;
     Shape.Point p3;
     private Color clr;
     public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        p1 = new Point(x1,y1);
        p2 = new Point(x2,y2);
        p3 = new Point(x3,y3);
     }
     public Triangle(Shape.Point p1, Shape.Point p2,Shape.Point p3, Color _clr){
         this.p1=p1;
         this.p2=p2;
         this.p3=p3;
         this.clr=_clr;
     }
 
     public double distance(Point v1,Point v2){ return Math.sqrt(Math.pow(v1.x-v2.x,2)+Math.pow(v1.y-v2.y,2)); }
 
 
     @Override
     public double area() { 
    	 return  0.25*(distance(p1,p3)+distance(p3,p2)+distance(p1,p2))*(-distance(p1,p3)+distance(p3,p2)+distance(p1,p2))
             *(distance(p1,p3)-distance(p3,p2)+distance(p1,p2))*(distance(p1,p3)+distance(p3,p2)-distance(p1,p2));
    	 }
 
     @Override
     public String getType() { return "Triangle";}
 
    @Override
    public String toString() {
        return  "Shape Type: "+this.getType()+ " - Color: " +this.clr+ " - Area: " +this.area()+" sq units "+" - Point 1: "+this.p1+" - Point 2: "+this.p2+" - Point 3: "+this.p3;
    }
    public static void main(String args[]) {
	     Shape s1 = new Circle(new Shape.Point(1,1), 2.5, new Color(0.5,0.5,0));
	     Shape s2 = new Circle(new Shape.Point(1,2), 3, new Color(0.5,0.5,1));
	     Shape s3 = new Triangle(new Shape.Point(1,1),new Shape.Point(2,5),new Shape.Point(3,3), new Color(0.5,0.5,0));
	     Shape s4 = new Triangle(new Shape.Point(1,1),new Shape.Point(2,5),new Shape.Point(3,3), new Color(0.8,0.7,0.6));
	    
	     Shape []shape=new Shape[4];
	      shape[0]=s1;
	      shape[1]=s2;
	      shape[2]=s3;
	      shape[3]=s4;
	     for (int i=0; i<4; i++) {
	    	 System.out.println(shape[i]) ;
	     }
	     
	    
}
}