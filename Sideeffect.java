class Sideeffect {
 public static void main(String args[]) {
int i;
 i = 0;
 if(false & (++i < 100)) 
System.out.println("this wont not executed");
System.out.println("if statement executed; "+i);
 if(false && (++i < 100));
System.out.println("thsis is displayed;");
System.out.println("if statement eecuted; " + i);

}
}