package p21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p21 {

	public static void main(String[] args)throws IOException
	{
		System.out.println("�n���������?");
		System.out.println("��J��ƼK");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int r = Integer.parseInt(str);		
		char ans=(r==1)?'A':'B';
		System.out.println("��ܤF"+ans+"���u");

    }
}