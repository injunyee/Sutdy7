package com.hij.Study7;

import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		AddView addview = new AddView();
		Scanner sc = new Scanner(System.in);
		int push = 0;
		while(true)
		{
			System.out.printf("1.View All Person in handbook\n");
			System.out.printf("2.Search Sepecific person\n");
			System.out.printf("3.Add new person\n");
			System.out.printf("4.Remove existing person\n");
			System.out.printf("5.Program finish\n");
			push = sc.nextInt();
			
			if(push == 1)
			{
				
			}
			else if(push == 2)
			{
				
			}
			else if(push == 3)
			{
				Input ip = new Input();
				addview.personlist.add(ip.input());
			}
			else if(push == 4)
			{
				
			}
			else if(push == 5)
			{
				break;
			}
			else
			{
				System.out.printf("잘못된 입력입니다.\n");
				continue;
			}
		}
	}
}
