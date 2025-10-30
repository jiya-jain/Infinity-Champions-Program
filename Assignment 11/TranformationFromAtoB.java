import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		boolean f=true;
		List<Integer> ar=new ArrayList<>();
		ar.add(b);
		while(b>a){
		    if(b%2==0){
		        b/=2;
		        ar.add(b);
		    }
		    else if(b%10==1){
		        b=(b-1)/10;
		        ar.add(b);
		    }
		    else{
		        System.out.print("NO");
		        return;
		    }
		}
		if(b==a){
		    Collections.reverse(ar);
		    System.out.println("YES");
		    System.out.println(ar.size());
		    for(int i:ar)
		        System.out.print(i+" ");
		    
		}
		else
		    System.out.print("NO");
		    
	}
}
