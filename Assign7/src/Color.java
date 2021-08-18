
public class Color {
	private double red;
	private double blue;
	private double green;
	private String hex;
	
	public Color(double _red,double _green,double _blue) {
		this.red=_red;
		this.green=_green;
		this.blue=_blue;
		this.hex='#'+Integer.toHexString((int)(255*red)<<16|((int)(255*green)<<8|((int)(255*blue)<<0)));
	}
	/* variable casting*/
	public Color(String _hex) {
		this.hex=_hex;
	}
	
	public String toString() {
		  return this.hex;
	}
	
	public static void main(String args[]) {
	      Color pink = new Color(1.0,0.0,0.5);
	      System.out.println(pink);
	      Color orange = new Color("#FFA500");
	      System.out.println(orange);
	    
	   }

}
