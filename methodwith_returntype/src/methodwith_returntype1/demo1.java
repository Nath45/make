package methodwith_returntype1;

public class demo1 
{
		public static void main(String[] args)
		{
			int num1 = addition(10, 20);
			System.out.println(num1);
			
			System.out.println("----");
			
			System.out.println(addition(100, 200));
			System.out.println(addition(500, 600));
			
			System.out.println("-------------------------");
			
			demo1 d1=new demo1();
			int num3 = d1.sub(60, 55);
			System.out.println(num3);
			
			System.out.println(d1.sub(70, 65));
		}	
		
        public static int addition(int a, int b) 
   {
	int sum = a+b;
	return sum;
   }

    public int sub(int c,int d)
{
	int sub = c-d;
	return sub;
}

}
