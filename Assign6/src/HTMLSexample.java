public class HTMLSexample {
    private int maxRow=0;
    private int maxColumn=0;
    private int currentRow=0;
    private String table[][];

    public HTMLSexample(int _row,int _column){
        this.maxRow = _row;
        this.maxColumn = _column;
        table = new String[maxRow][maxColumn];
    }

    public void addRow(String fields[]){
        if(fields.length <= maxColumn && currentRow != maxRow){
            for(int i=0;fields.length > i;i++){
                table[currentRow][i] = fields[i];
            }
            currentRow = currentRow+1;
        }
        else{
            return;
        }
    }

    public void print(){
            System.out.println("<html>\n" + "<table style=\"width:100%;background-color:#00FFFF; border: 1px solid black;z\">");
            for(int i=0; i<currentRow;i++){
                System.out.println("<tr>");
                for(int j=0; j < maxColumn ;j++){
                    System.out.println("<th>"+table[i][j]+"</th>");
                }
                System.out.println("</tr>");
            }
            System.out.println("</table>\n" + "<html>\n");
    }
    public static void main(String args[]) {
    		HTMLSexample table = new HTMLSexample(5,4);
    	   table.addRow(new String[] { "Name",         "ID",       "Grade", "Class Rank" } );
    	   table.addRow(new String[] { "Joe Blogs",    "12345670", "65"   , "3"          } );
    	   table.addRow(new String[] { "Jane Blogs",   "12345671", "75"   , "2"          } );
    	   table.addRow(new String[] { "Teresa Green", "12345672", "85"   , "1"          } );
    	   table.addRow(new String[] { "Mary Malone",  "12345673", "60"   , "4"          } );
    	   table.print();
    	}
}
