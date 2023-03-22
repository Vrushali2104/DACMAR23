class Pat5{
	
	public static void main(String args[]){
		
		for (char ch = 'A'; ch <= 'E'; ch++)
		{
			for(char c = 'A'; c <= ch; c++)
			{
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}