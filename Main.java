import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int n = sc.nextInt();
		int i=0;
		LinkedHashMap<String,Float> hm = new LinkedHashMap<String,Float>();
		for(i=0;i<n;i++)
		{
			String s = sc.next();
			float f = sc.nextFloat();
			hm.put(s, f);
		}
		UserMainCode r = new UserMainCode();
		LinkedHashMap<String,String> hm2 = new LinkedHashMap<String,String>();
		hm2 = UserMainCode.calculategrade(hm);
		Iterator<String> it = hm2.keySet().iterator();
		while(it.hasNext())
		{
			String ss = it.next();
			String dd = hm2.get(ss);
			System.out.println(ss);
			System.out.println(dd);
		}
	}
}