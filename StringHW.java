public class StringHW
{
	public static void main(String[] args)
	{
		System.out.println(findString("Hello", "ll", 0));
		System.out.println(countString("Hello", "o"));
		System.out.println(convertItalics("I__ like _ pizza.  "));
	}

	public static int findString(String o, String s, int start)
	{
		String x = o.substring(start);
	
		int r = x.indexOf(s);
	
		if (r == -1)
			return r;
		else
			return r + start;
	}

	public static int countString(String o, String s)
	{
		int index = 0;
	
		int count = 0;
	
		while (index < o.length())
		{
			if (o.substring(index, index + s.length()).equals(s))
			{
				index += 1;
				count += 1;
			}
			else
				index += 1;
		}
		return count;
	}

	public static String convertItalics(String s)
	{

		int count = 0;
	
		int index = 0;
	
		int holder = 0;
	
		while (index < s.length() - 2)
		{
			if (s.substring(index,index + 2).equals(("__")))
			{
				holder = index;
				index += 2;
				count += 1;
			}
			else if (s.substring(index,index +1 ).equals(("_")))
			{
				holder = index;
				index += 1;
				count += 1;
			}
			else
				index += 1;
		}
	
		if (count % 2 == 1)
			return s;
		else
		{
			index = 0;
			String line = "";
			while (index <= holder - 2)
			{
				if (s.substring(index, index + 1).equals(("_")) || s.substring(index,index + 2).equals(("__")))
				{
					line = line + "<I>";
					index += 1;
				}
				else
				{
					line = line + s.charAt(index);
					index += 1;
				}
			}
			while (index < s.length() - 2)
			{
				if  (s.substring(index, index + 1).equals(("_")) || s.substring(index,index + 2).equals(("__")))
				{
					line = line + "</I>";
					holder = index;
					index += 1;
				}
				else 
				{
					line = line + s.charAt(index);
					index += 1;
				}
			}
			return line;
		
		}
	}	
}		