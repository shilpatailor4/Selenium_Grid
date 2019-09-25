package homework;

public class Candy {
	
	public void getCandy(int stock, int demand)
	{
		for(int i=1;  i<= demand; i++)
		{
			if(i<=stock)
			{
				System.out.println("Candies in stock");
			}
			else
			{
				System.out.println("Candies is out of stock");
			}
		}
		
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		
		Candy can = new Candy();
		can.getCandy(0, 8);
		

	}

}
