import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] ar=new int[n+1];
		    for(int i=1;i<=n;i++){
		        ar[i]=sc.nextInt();
		    }
		    boolean[] peak=new boolean[n];
		    int cnt=0;
		    for(int i=2;i<n;i++){
		        if(ar[i]>ar[i-1] && ar[i]>ar[i+1]){
		            peak[i]=true;
		        }
		    } 
		    for(int i=2;i<k;i++){
		        if(peak[i])  cnt++;
		    }
		    int max=cnt, ii=1, l=2, r=k+1;
		    while(r<=n){
		        if(peak[l])  cnt--;
		        if(peak[r-1])  cnt++;
		        if(cnt>max){
		            max=cnt;
		            ii=l;
		        }
		        l++;r++;
		    }
		    System.out.println(max+1+" "+ii);
		}
	}
}
