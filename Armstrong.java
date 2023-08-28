
public class Armstrong {
	public int findArmstrong(int n) {
		int tempnum=n;
		int count=0;
		int res=0;
		
		while(tempnum!=0)
		{
			tempnum=tempnum/10;
			count++;
		}
		
		
		while(n!=0)
		{
			int rem=n%10;
			res=res+(int) Math.pow(rem,count);
			n=n/10;
		}
		return res;
	}

}
