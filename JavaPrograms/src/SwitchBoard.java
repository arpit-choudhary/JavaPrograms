class SwitchBoard{
int a=4;
int arpit()
{
System.out.println("tempvalue="+a);
return a;
}
 public static void main(String args[]){
   int iSwitch=2;
SwitchBoard ref=new SwitchBoard();
int c=ref.arpit();
   switch(iSwitch){
     case 0:
     System.out.println("ZERO");
     break;

     case 1:
     System.out.println("ONE");
     break;

     case 2:
     System.out.println("value="+c);
     break;

     case 3:
     System.out.println("THREE");
     break;

     case 4:

     System.out.println("FOUR");
break;

   
 }
}
}