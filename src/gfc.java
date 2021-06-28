import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class gfc {
	public void findit(String str)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] charArray = str.toCharArray();
		for(Character ch :charArray)
		{
			if(map.containsKey(ch))
			{
				
			}
			else
			{
				map.put(ch,1);
			}
			Set<Character> keys = map.keySet();
			for(Character ch1:keys)
			{
				if(map.get(ch)>1)
				{
					System.out.println(ch+"is"+map.get(ch)+"times");
				}
			}
		}
	}
	public static void main(String[]args)
	{
		gfc g = new gfc();
		g.findit("geeks");
	}


}
