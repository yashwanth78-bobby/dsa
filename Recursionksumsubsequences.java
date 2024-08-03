import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,2,1};
	    int n=3;
	    int k=2;
	    ArrayList<Integer> ds=new ArrayList<>();
	    printSubsequences(0,0,arr,n,k,ds);
        return;
	}
	static void printSubsequences(int ind,int currSum,int arr[],int n,int k,ArrayList<Integer> ds){
	    if(ind==n){
	        if(currSum==k){
	            for(int i=0;i<ds.size();i++) System.out.print(ds.get(i));
	            System.out.println();
	        }
	        return;
	    }
	    currSum+=arr[ind];
	    ds.add(arr[ind]);
	    printSubsequences(ind+1,currSum,arr,n,k,ds);
	    ds.remove(ds.size()-1);
	    currSum-=arr[ind];
	    printSubsequences(ind+1,currSum,arr,n,k,ds);
	}
}
