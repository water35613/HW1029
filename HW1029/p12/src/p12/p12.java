package p12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J���");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		if(n==1)
		{
		  System.out.println("��J���O1");
		}
		else if(n==2) 
		{
			System.out.println("��J���O2");
		}
		else
		{
			System.out.println("�п�J��1��2���o");
		}
          
	}

}
