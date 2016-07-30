package com.hand;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import org.omg.Messaging.SyncScopeHelper;

public class Exam3 {

	public static void main(String[] args) {
		int year=0,mon=0,day=0,sum=0;
		int[] mons = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.print("请输入日期：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split("-");
		year = Integer.parseInt(s[0]);
		mon = Integer.parseInt(s[1]);
		day = Integer.parseInt(s[2]);
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			if (mon>2) {
				for(int i=0;i<mon-1;i++)
					sum+=mons[i];
				System.out.println("你输入的日期为当年的第 "+(sum+day+1)+"天");
			}else if(mon==1){
				System.out.println("你输入的日期为当年的第 "+day+"天");
			}else if (mon==2) {
				System.out.println("你输入的日期为当年的第 "+(31+day)+"天");
			}
		}else{
			for(int i=0;i<mon-1;i++)
				sum+=mons[i];
			System.out.println("你输入的日期为当年的第 "+(sum+day)+"天");
		}
		
	}
	
	

}
