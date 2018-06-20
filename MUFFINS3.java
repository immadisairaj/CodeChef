import java.util.*;
import java.lang.*;
import java.io.*;

public class MUFFINS3 {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int T;
		T = scan.nextInt();
		while(T-- > 0) {
		    int N;
		    scan.nextLine();
		    N = scan.nextInt();
		    N/=2; N+=1;
		    System.out.println(N);
		}
		scan.close();
	}
}
