package com.hij.Study7;
import java.util.*;

public class Input
{
	Scanner sc = new Scanner(System.in);
	public AddressStore input()
	{
		AddressStore adstore = new AddressStore();
		System.out.printf("input new person's name : ");
		adstore.setname(sc.next());
		System.out.printf("input new person's e-mail : ");
		adstore.setemail(sc.next());
		System.out.printf("input new person's home address : ");
		adstore.sethomeAdd(sc.next());
		System.out.printf("input new person's birthday : ");
		adstore.setbirth(sc.next());
		
		return adstore;
	}
}
