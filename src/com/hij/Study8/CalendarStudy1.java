package com.hij.Study8;
import java.util.*;

public class CalendarStudy1
{
	public static void main(String args[])
	{
		Calendar cal = new GregorianCalendar();
		Calendar ca = Calendar.getInstance();
		
		System.out.printf("%s\n", ca.getTime());
		System.out.print(Calendar.YEAR+"\n");
		System.out.printf("%s\n", ca.get(Calendar.YEAR));
		int m = ca.get(Calendar.MONTH);
		System.out.printf("%d\n", m+1);
		int d = ca.get(Calendar.DATE);
		System.out.printf("%d\n", d);
	}
}
