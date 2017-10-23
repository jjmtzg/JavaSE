package com.codefight;

public class tournament {

	public tournament() {
		// TODO Auto-generated constructor stub
		
	}
	public int[] fractionDivision(int[] a, int[] b) {
	    int[] r;
	    r=new int[2];
	    if(a[0]>b[0])
	        r[0]=((a[0]/b[0]));
	    else
	        r[0]=((a[0]*10)/b[0]);
	    if(a[1]>b[1])
	        r[1]=(a[1]/b[1]);
	    else
	        r[1]=((a[1]*10)/b[1]);
	    return r;
	}

}
