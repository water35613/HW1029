package p34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p34 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要跳過第幾次處理?(1~10)");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int r =Integer.parseInt(str);
		for(int i=1;i<=10;i++)
		{
			
			if(i==r)
				continue;
			System.out.println("第"+i+"次的處理");
		}
          
	}

}
