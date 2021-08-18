
public class Module {

	protected 
	String modulename;
	String modulecode;
	double modulecredits;
	
	public Module (String mCode,String mName,double mCred)
	{
		modulecode = mCode;
		modulename = mName;
		modulecredits=mCred;
	}
	
	public void display()
	{
		System.out.println("Module Code: " + modulecode + "\nModule Name: " + modulename+" ("+modulecredits+")");
	}
	
	public String toString() {
		return "Module Code: "+modulecode+"\nModule Name: "+modulename+" ("+modulecredits+" credits)";
	}


	
	 public static void main(String args[]) {
	      Module m1 = new Module("EE219", "Object Oriented Programming I", 5.0);
	      System.out.println(m1);
	   }
	}
