class Guess4 {
 public static void main(String args[])  {
 throws java .io.IOException {
    
 char ch,ignore,answer = 'k';
 
  do {
 System.out.println("i am thinking af a latter between A and Z.");
System.out.print(" can you guess it");
 ch =(char)System.in.read();
} while(ignore != '\n');

 if(ch == answer) System.out.println("** Right**");
 else {
 System.out.print("... sorry you are ");
 if(ch < answer) System.out.println("too low");
else System.out.println("too high");
System.out.println("try Again\n") ;
}
while(answer!=ch);
}
 }
  }