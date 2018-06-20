import java.util.*;
import java.lang.*;
import java.io.*;

public class CHOPRT {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int T;
		T = scan.nextInt();
		while(T-- > 0) {
		    int A,B;
		    scan.nextLine();
		    A = scan.nextInt();
		    B = scan.nextInt();
		    if(A > B) {
		        System.out.println(">");
		    } else if(A < B) {
		        System.out.println("<");
		    } else {
		        System.out.println("=");
		    }
		}
		scan.close();
	}
}
