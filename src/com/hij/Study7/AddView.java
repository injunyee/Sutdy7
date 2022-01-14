package com.hij.Study7;
import java.util.*;

public class AddView
{
	Scanner sc = new Scanner(System.in);
	ArrayList<AddressStore> personlist = new ArrayList<>();
	
	public void search()
	{
		System.out.printf("찾으실 사람의 이름을 입력하세요 ");
		String find = sc.next();
		int i = 0;
		for(i=0; i<personlist.size(); i++)
		{
			AddressStore AS = personlist.get(i);
			if(AS.getname().equals(find))
			{
				System.out.printf("name		: %s\n", AS.getname());
				System.out.printf("e-mail	: %s\n", AS.getemail());
				System.out.printf("home add : %s\n", AS.gethomeAdd());
				System.out.printf("birth 	: %s\n", AS.getbirth());
			}
		}//for end
	}//public void search end
	
	public void remove()
	{
		int removelist[] = new int[personlist.size() / 2];
		int num = 0;
		System.out.printf("삭제할 사람의 이름을 입력하세요 ");
		String find = sc.next();
		int i = 0;
		for(i=0; i<personlist.size(); i++)
		{
			AddressStore AS = personlist.get(i);
			if(AS.getname().equals(find))
			{
				removelist[num] = i;
				num++;
			}
		}// for end
		System.out.printf("검색된 사람은 총%d명 입니다.\n", num);
		
		
	}//public void remove end
}//public class AddView end





