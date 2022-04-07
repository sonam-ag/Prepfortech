package binarySearch;

public class FindSqrt {

	public static int mySqrt(int x) {
		  long start = 1 ,end = x,mid = 0 ,ans = 0;
	        while(start <= end){  
	        	mid = (start + end )/2;

	        	if(mid*mid == x) { 
	        		return (int)mid ;
	        	}
	        	else if(x > mid*mid) {
	           		ans=mid;
	        		start = mid+1;
	        	}else {
	        		end = mid-1 ;
	        	}  
	        }
			return (int)ans;         
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FindSqrt.mySqrt(100));//10
		System.out.println(FindSqrt.mySqrt(8));//2
		System.out.println(FindSqrt.mySqrt(1));//1
		System.out.println(FindSqrt.mySqrt(0));//0
	}
}
