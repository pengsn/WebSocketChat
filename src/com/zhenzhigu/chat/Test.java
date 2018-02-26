package com.zhenzhigu.chat;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String[]args)
	{
		int[] a = {2,3,3,2,1};
		int[] b = Arrays.copyOf(a, 10);
		
		for(int i=0;i<b.length; i++)
		{
			System.out.print(b[i] + ",");
		}
	}
	
}
