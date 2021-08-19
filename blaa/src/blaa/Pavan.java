package blaa;

import java.io.*;
import java.util.*;
public class Pavan {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char a[]=str.toCharArray();
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch:a)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
				
			}
			else
			{
				hm.put(ch,1);
			}
		}
		Set<Character> keys=hm.keySet();
		for(char ch:keys)
		{
			if(hm.get(ch)==1)
			{
				System.out.println("element is "+ ch);
				break;
			}
		}
	}
}
