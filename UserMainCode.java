import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMainCode {
	public static LinkedHashMap<String, String> calculategrade(LinkedHashMap<String,Float> hm)
	{
		LinkedHashMap<String,String> hm2 = new LinkedHashMap<String,String>();
		String r = new String();
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			String s = it.next();
			float a = hm.get(s);
			if( a >= 60)
			{
				r = "PASS";
			}
			else if(a <60)
			{
				r= "FAIL";
			}
			hm2.put(s,r);
		}
		
		
		return hm2;
		
	}
}