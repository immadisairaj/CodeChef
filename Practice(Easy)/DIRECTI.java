import java.util.*;
import java.lang.*;
import java.io.*;

public class DIRECTI {
	public static void main (String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        scan.nextLine();
        while(T-- > 0) {
            int n = scan.nextInt();
            scan.nextLine();
            
            ArrayList<String> arr = new ArrayList<>();
            for(int i=0; i<n ;i++) {
                arr.add(scan.nextLine());
            }
            
            System.out.println("Begin"+arr.get(n-1).substring(arr.get(n-1).indexOf(" ")));
            for(int i=n-1; i>0; i--) {
                if(arr.get(i).startsWith("Left")) {
                    System.out.println("Right"+arr.get(i-1).substring(arr.get(i-1).indexOf(" ")));
                } else {
                    System.out.println("Left"+arr.get(i-1).substring(arr.get(i-1).indexOf(" ")));
                }
            }
            System.out.println();
        }
        
        scan.close();
	}
}
