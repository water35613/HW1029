package p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		if(n==1)
		{
		  System.out.println("輸入的是1");
		}
		else if(n==2) 
		{
			System.out.println("輸入的是2");
		}
		else
		{
			System.out.println("請輸入的1或2謝囉");
		}
          
	}

}
