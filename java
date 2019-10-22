import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        while(n!=0){
            
            int t=n%10;
            
            if(t%2==0){
                
                // e=0;
                    e=t+e;
                  //System.out.println(e);    
            }
            else{
                //o=0;
                o=t+o;
            //    System.out.println(o);
            }
            n=n/10;
            
        }
        
        System.out.println(e+" "+o);
	}
}
