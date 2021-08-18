public class HTMLTableGenerator {
	private int row=0;
	private int column=0;
	private int CurrRow=0;
	private String table [] [];
	
	public HTMLTableGenerator(int r,int c) {
		this.row=r;
		this.column=c;
		table = new String[row][column];
	}
	
	public void addRow(String fields[]) {
		        if(fields.length <= column && CurrRow != row){
		            for(int i=0;i<fields.length;i++){
		                table[CurrRow][i] = fields[i];
		            }
		            CurrRow++;
		        }
		        else{
		            return;
		        }
		    }
	
	public void print(){
        System.out.println("<html>");
        System.out.println("<head>\r\n"
        		+ "<style>\r\n"
        		+ "table, th, td {\r\n"
        		+ "  border: 1px solid white;\r\n"
        		+"border-collapse: collapse;\r\n"
        		+ "}\r\n"
        		+ "</style>\r\n"
        		+ "</head>\r\n"
        		+ "<body>"
        		+ "<h2>Completed Table</h2>");
        System.out.println( "<table style=\"width:100%;background-color:#ff0000; border: 1px solid black;z\">");
        for(int i=0; i<CurrRow;i++){
            System.out.println("<tr>");
            for(int j=0; j < column ;j++){
                System.out.println("<th>"+table[i][j]+"</th>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>\n" + "<html>\n");
}
    
    public static void main(String args[]) {
    	   HTMLTableGenerator table = new HTMLTableGenerator(5,4);
    	   table.addRow(new String[] { "Name",         "ID",       "Grade", "Class Rank" } );
    	   table.addRow(new String[] { "Joe Blogs",    "12345670", "65"   , "3"          } );
    	   table.addRow(new String[] { "Jane Blogs",   "12345671", "75"   , "2"          } );
    	   table.addRow(new String[] { "Teresa Green", "12345672", "85"   , "1"          } );
    	   table.addRow(new String[] { "Mary Malone",  "12345673", "60"   , "4"          } );
    	   table.print();
    	}
}
