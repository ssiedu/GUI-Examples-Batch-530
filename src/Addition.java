
import java.util.Scanner;

public class Addition {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First No. : ");
        int n1=sc.nextInt();
        System.out.println("Enter Second No. : ");
        int n2=sc.nextInt();
        int res=n1+n2;
        System.out.println("Addition : "+res);
        
    }
}
