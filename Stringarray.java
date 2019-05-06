class Stringarray {
public static void main(String args[]) {
String strs [] = { "this is a test" };
 System.out.println("original array");
for(String s : strs)
System.out.println( s + " ");
System.out.println("\n");
strs [1] = "was";
strs [3] = "test too";
System.out.println("modiefied array'");
for(String s : strs)
System.out.print(s + " ");
}
}