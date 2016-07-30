package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam4 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		List<Integer>  l = new ArrayList<Integer>();
		int[][] k = new int[50][2];
		Integer[] in = new Integer[10];
		int a=0;
		for(int i=0;i<50;i++){
			a=(int)(Math.random()*100);
			k[i][0]=a;
			k[i][1]=a%10;
		}
		System.out.print("随机生成 50个小于100 的数,分别为:"+k[0][0]);
		for(int i=1;i<50;i++)
			System.out.print(","+k[i][0]);
		for(int i =0;i<10;i++){
			for(int j =0;j<50;j++)
			{
				if(k[j][1]==0){
					
				}
			}
		}
	}

}
