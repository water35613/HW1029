package p19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("男的?");
		System.out.println("YorN?");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char letter=str.charAt(0);
		
		if (letter=='Y'||letter=='y')
		{
			System.out.println("男的啦");
		}
		else if(letter=='N'||letter=='n')
		{
			System.out.println("女的啦");
		}
		else
		{
			System.out.println("輸入Y或N，OK?");
		}

    }
}