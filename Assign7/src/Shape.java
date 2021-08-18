
public abstract class Shape {
	protected
	Color clr;
	Color black=new Color(0,0,0);
	public Shape(){
	this.clr= black;	
	}
	
	public Shape(Color obj) {
	
	}
	public double area(){
		return 0;	
	}
	
	public String getType() {
		return null;
	}
	public String toString() {
		return this.getType()+this.clr+this.area();
	}
	//why static?
static class Point{
	protected
	 double x;
	 double y;
	
	public Point(double x_,double y_) {
		x=x_;
		y=y_;
	}
	public double x() {return x;}
	
	public double y() {return y;}
	
	public String toString() {
		String result;
		result="("+this.x+","+this.y+")";
		
		return result;
	}
}

}
