class Operatorsss {
 public static void main(String args[]) {
 
  string x = "sher";
  string y = "locked";
  
scanner s = new scanner (System.in);
System.out.print("enter uername");
 string uuid = s.next();
string upwd = s.next();

 if ((uuid.equals(x) && upwd.euals(y)) || (uuid.equals(y) && upwd.equals(x))) {
else {
System.out.priintln("wrong uid or password");
 }
}
}