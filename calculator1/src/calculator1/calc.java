package calculator1;
import java.util.*;

public class calc{

	
	public static void main(String[] args) {
		int op;
		char ch;
		
		
 System.out.print("this is a calculator applicatin\n \n");
 Scanner sc=new Scanner(System.in);
 do {
 System.out.println("enter two number\n");
 int x=sc.nextInt();
 int y=sc.nextInt();
 System.out.println("chooose the operation \n");
 System.out.println("1.addition");
 System.out.println("2.subtraction");
 System.out.println("3.multiplication");
 System.out.println("4.division");
 op=sc.nextInt();
 switch(op) {
 case 1: operation p=new addition();
		    p.op(x,y);
		    break;
 case 2: operation s=new subtract();
              s.op(x,y);
              break;
 case 3: operation m=new multiply();
  		    m.op(x,y);
  		    break;
 case 4:    operation d=new divide();
              d.op(x,y);
              break;
 default:System.out.print("invalid operation");
 }
System.out.print("\nwant to do more calculation(y/n)");
 ch=sc.next().charAt(0);
 }while(ch=='y');
 sc.close();
	}

}
