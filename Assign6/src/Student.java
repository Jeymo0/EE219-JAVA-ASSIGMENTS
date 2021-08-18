public abstract class Student {
   private String name;
   private int ID;
   public Student(String nm, int id) {
      name = nm;
      ID = id;
   }
   void print() {
      System.out.println("Name: " + name + "\nID: " + ID);
   }
}
