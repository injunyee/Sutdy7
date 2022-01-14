package com.hij.Study7;
import java.util.*;

public class Menu
{
	AddView addview = new AddView();
	Scanner sc = new Scanner(System.in);
	
	public void menu()
	{
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
				int i = 0;
				for(i=0; i<addview.personlist.size(); i++)
				{
					AddressStore AS = addview.personlist.get(i);
					System.out.printf("name		: %s\n", AS.getname());
					System.out.printf("e-mail	: %s\n", AS.getemail());
					System.out.printf("home add : %s\n", AS.gethomeAdd());
					System.out.printf("birth 	: %s\n", AS.getbirth());
				}
			}
			else if(push == 2)
			{
				System.out.printf("찾으실 사람의 이름을 입력하세요 ");
				String find = sc.next();
				int i = 0;
				for(i=0; i<addview.personlist.size(); i++)
				{
					AddressStore AS = addview.personlist.get(i);
					if(AS.getname().equals(find))
					{
						
					}
				}
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
		}//while end
	}//public void menu end
}
