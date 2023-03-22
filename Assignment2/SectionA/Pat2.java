class Pat2{
	
	public static void main(String args[]){
		
		for(char ch = 'A'; ch <= 'E'; ch++)
		{
			for(char c = 'A'; c <= ch; c++)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}
}