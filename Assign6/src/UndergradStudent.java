public class UndergradStudent extends Student{
	private Module[] module = new Module[10];
	private String programme;
	private int numModules;
	
	public UndergradStudent(String name, int id,String prog)
	{
		super(name,id);
		programme = prog;
		numModules=0;
			
	}
	
	public boolean add(Module obj) {
		if(numModules<=10) {
            this.module[numModules++] = obj;
            return true;
        }
        else {return false; }
	}
	
	public void print()
	{
		super.print();
		System.out.println("Programme: "+programme);
		System.out.println("Registered for modules: ");
		for(int i = 0; i<numModules; i++)
		{
			module[i].display();
		}
	}
	
	 public static void main(String args[]) {
	     UndergradStudent s1 = new UndergradStudent("Mary Murphy", 12345678, "ECE");
	     s1.add(new Module("EE219", "Object Oriented Programming I", 5.0));
	     s1.add(new Module("EE223", "Digital and Analogue Electronics I", 5.0));
	     s1.add(new Module("EE202", "Embedded Systems", 5.0));
	     s1.print();
	  }
}