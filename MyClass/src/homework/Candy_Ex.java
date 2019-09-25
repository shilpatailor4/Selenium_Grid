package homework;

public class Candy_Ex {
	
	int c = 10;
	
	public void candy(int candy)
	{
		this.c = candy;
		
			if(c<=10) {
				for(int c = 10; c<=10; c++)
				{
					c++;
				System.out.println("Candies in stock");
				
				}
			}
			
			else {
				System.out.println("Candies out of stock");
			}
			
			
			
		}
	

	public static void main(String[] args) {
		
		Candy_Ex can = new Candy_Ex();
		can.candy(6);
		
		System.out.println("Bye child");

	}

}
