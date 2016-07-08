public class Solution {
    public double myPow(double x, int n) {
        
		if(n == 0){
			return 1;
		}
		
		if(x == 0){
			return 0;
		}
		
		if(n < 0){
			double ret = x * myPow(x , -(n+1));
			return (double)1/ret;
		}
		
		double ret = myPow(x , n/2);
		ret = ret * ret;
		
		if(n % 2 != 0){
			ret *= x;
		}
		
		return ret;
    }
}