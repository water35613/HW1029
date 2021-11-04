package p21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("要選哪條路啦?");
		System.out.println("輸入整數嘿");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int r = Integer.parseInt(str);		
		char ans=(r==1)?'A':'B';
		System.out.println("選擇了"+ans+"路線");

    }
}