class Rellogs {
 public static void main(String args[]) {
int i, j;
boolean b1,b2; 

 i = 10;
j = 11;
 if(i < j)  System.out.println("i < j");
 if(i <= j) System.out.println(" i <= j");
  if( i != j) System.out.println("i !=j");
 if( i == j) System.out.println("thiss iis wont not executed");
 if( i >= j) System.out.println("this is not executed");
 

  b1 = true;
  b2 = false;
 if(!(b1 & b2))  System.out.println("!(b1 & b2) is true");
 if(b1 | b2) System.out.println("b1 | b2 is true");
 if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
  }
    }