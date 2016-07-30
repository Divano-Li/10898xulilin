package com.hand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		int n = 1; boolean flag = true;
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 102; i < 200; i++) {
			flag =true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if (i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag)
			{
				n++;
				l.add(i);
			}
		}
		System.out.print("101-200间总共有"+n+"个素数分别是：101");
		Iterator<Integer> iter = l.iterator();
		while(iter.hasNext()){
			int a = iter.next();
			System.out.print(","+a);
			
	}
	}

	}
