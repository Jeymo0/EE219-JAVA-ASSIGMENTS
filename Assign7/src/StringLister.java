public class StringLister
{
public static boolean stringContains(String str, String substring)
{
int whereFound=str.indexOf(substring);
return (whereFound>0);
}
public static int stringContainsWhere(String str,String substring)
{
int whereFound=str.indexOf(substring);
return whereFound;
}
public static int countContaining(String []list,String substring)
{
int count=0;
for(String str:list)
{
if(str.length()>0 && stringContains(str, substring))
count++;
}
return count;
}
public static int countNotContaining(String []list,String substring)
{
int count=0;
for(String str:list)
{
if(str.length()>0 && !stringContains(str, substring))
count++;
}
return count;
}
public static void printLists(String[] list,String substring)
{
int countWith=countContaining(list, substring);
int countWithout=countNotContaining(list, substring);
  
int[] locationWith=new int[countWith];
String []listWith=new String[countWith];
String []listWithout=new String[countWithout];
int indexWith=0; int indexWithout=0;
  
for(String str:list)
{
if(str.length()>0)
{
if(stringContains(str, substring))
{
locationWith[indexWith]=stringContainsWhere(str, substring);
listWith[indexWith++]=str;
}
else
{
listWithout[indexWithout++]=str;
}
}
}
System.out.println("Strings without \""+substring+"\":");
for(int i=0;i<listWithout.length;i++)
{
System.out.println(listWithout[i]);
}
System.out.println("");
System.out.println("Strings with \""+substring+"\":");
for(int i=0;i<listWith.length;i++)
{
System.out.print(listWith[i]);
System.out.println(" (found at postion "+locationWith[i]+")");
}
}
public static void printText(String[] text)
{
System.out.println("Original text: ");
for(String str:text)
{
System.out.println(str);
}
System.out.println("");
}
public static void main(String[] args)
{
String [] text={
"Ever since Newton, we've done",
"science by taking things apart",
"to see how they work. Wha the",
"computer enables us to do is to",
"put things together to see how",
"the work: we're now synthesized",
"rather than analysex.",
"",
"I find one of the most enthralling",
"aspects of computers is limitless",
"communication",
"",
"-- Douglas Adams",
};
String subString="the";
printText(text);
printLists(text, subString);
}
  
}