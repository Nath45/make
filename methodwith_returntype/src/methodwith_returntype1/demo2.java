package methodwith_returntype1;

public class demo2 
{
		public static void main(String[] args) 
		{
			String s2 = convertStringToUpperCase("Akshay");
			System.out.println(s2);
			
			System.out.println("----");
			
			System.out.println(convertStringToUpperCase("Rahul"));
					
			System.out.println("------------------------");
			
			int length1 = demo3.getLengthOfString("Gaurav");
			System.out.println(length1);
			
			System.out.println(demo3.getLengthOfString("ksanqkldnasdaqfewd"));
		}
		
		
		
		
		public static String convertStringToUpperCase(String name)
		{
			//String s1 = name.toUpperCase();
			//return s1;
			return name.toUpperCase();
		}

	}
	
