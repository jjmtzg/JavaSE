package com.codefight;

public class KathoVsSuperMario 
{

	public KathoVsSuperMario() 
	{
	}
	public int enteros(int n)
	{
		int result=0;
		System.out.println(n);
		if(n>1&&n<15)
			for (int i = 1; i <=n; i++) 
		{
			if(n%i==0)
			{
				System.out.println(i);
				result+=i;
			}
		}
		return result;
	}
	public boolean isEarlier(int[] time, int[] time2)
	{
		if ((time[0]<time2[0]||time[0]<time2[1])&&(time[1]<time2[0]||time[1]<time2[1]))
			return true;
		return false;
	}
}
