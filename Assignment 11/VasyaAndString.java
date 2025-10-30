import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int k =sc.nextInt();
		String st=sc.next();
		System.out.println(Math.max(longer(st,k,'a'),longer(st,k,'b')));
	}
	public static int longer(String st, int k,char ch){
	    int si=0,ei=0,cnt=0,ans=0;
	    while(ei<st.length()){
	        if(st.charAt(ei)!=ch) cnt++;
	        while(cnt>k){
	            if(st.charAt(si)!=ch)  cnt--;
	            si++;
	        }
	        ans=Math.max(ans,ei-si+1);
	        ei++;
	        
	    }
	    return ans;
	}
}
