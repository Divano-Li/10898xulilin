package com.hand;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		System.out.print("请输入工资：");
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		double mon = 0;
		d = d-3500;
		if(d<=1500)
		{
			mon =d*0.03;
		}else if (d>1500&&d<=4500) {
			mon = 1500*0.03+(d-1500)*0.1;
		}else if (d>4500&&d<=9000){
			mon = 1500*0.03+3000*0.1+(d-4500)*0.2;
		}else if (d>9000&&d<=35000){
			mon = 45+300+900+(d-9000)*0.25;
		}else if (d>35000&&d<=55000) {
			mon = 345+900+26000*0.25+(d-35000)*0.3;
		}else if(d>55000&&d<=80000){
			mon = 345+900+6500+6000+(d-55000)*0.35;
		}else if(d>80000){
			mon = 345+900+6500+6000+25000*0.35;
		}
		System.out.println("所需要缴纳的税费为："+mon);
	}

}
