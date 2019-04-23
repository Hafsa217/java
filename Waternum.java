class Watersong {
public static void main(String arg[]) {
int waternum = 9;
string word = "bottles;
while (waternum > 0)
{
if(waternum == 1)
{ 
word = "bottle";
}
System.out.println(waternum + " " + word + " of water on the wall");
System.out.println(waternum + " " + word +"of water);
System.out.println("take one down");
System.out.printlln("pass it around");
waternum = waternum - 1;
if(waternum > 0)
{
System.out.printlln(waternum + " " + word + "of water on the wall");
}
else
{
System.out.println("no more bottles of water on the wall");
}
}
 }
}