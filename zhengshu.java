package zhengshu;

import java.util.Scanner;

public class zhengshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = 1 ,count = 1;
		int sum = 0;
		while(x/10 != 0){
			int a = x%10;
			if(a%2 == count%2){
				sum += n ;
			}
			count = count + 1;
			n = n*2;
			x = x/10;
		}
		if(x/10 == 0){
			int a = x%10;
			if(a%2 == count%2){
				sum += n ;
			}
		}
		System.out.println(sum);
	}

}
