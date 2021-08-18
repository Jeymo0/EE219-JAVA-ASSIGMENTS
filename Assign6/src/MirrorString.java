public class MirrorString {
   public static void mirrorString(String str) {
      mirrorString(str, 0);
   }
   private static void mirrorString(String str, int i) {
	   
	   if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            mirrorString(str.substring(i,str.length()-1)); 
        } 
	   
	}
   public static void main(String args[]) {
      mirrorString("Hello World!");
   }
}