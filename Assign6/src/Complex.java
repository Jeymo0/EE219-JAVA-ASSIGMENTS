 class Complex {
	private
	    double re;
	    double im;
	public
	    Complex(){re=0;im=0;}
		Complex(double r,double i){re=r; im=i;}
	
	
	public Complex add(Complex obj) {
		double result_re=re+obj.re;
		double result_im=im+obj.im;
		return new Complex(result_re,result_im);
		}
	public Complex divide(Complex obj) {
		double result_re=((re*obj.re)+(im*obj.im))/((obj.re*obj.re)+(obj.im*obj.im));
		double result_im=((im*obj.re)-(re*obj.im))/((obj.re*obj.re)+(obj.im*obj.im));
		return new Complex(result_re,result_im);
	}
	public Complex subtract(Complex obj) {
		double result_re=re-obj.re;
		double result_im=im-obj.im;
		return new Complex(result_re,result_im);
	}
	public Complex multiply(Complex obj) {
		double result_re=((re*obj.re-(im*obj.im)));
		double result_im=re*obj.im+(obj.re*im);
		return new Complex(result_re,result_im);
	}
	public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }
	
	public static void main(String args[]) {
	      Complex c1 = new Complex(1,-2);
	      Complex c2 = new Complex(3,-4);
	      Complex c3 = new Complex(-3,2);
	      System.out.println(c1.add(c2).subtract(c2).subtract(c1));
	     System.out.println(c1.subtract(c2).divide(c3).add(c1.multiply(c3)));
	   }
}
