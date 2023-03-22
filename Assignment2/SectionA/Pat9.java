class Pat9{
	
	public static void main(String args[]){
		
		for(char ch ='A'; ch <= 'E'; ch++)
		{
			for(char cr = 'D'; cr>= ch; cr--)
			{
				System.out.print(" ");
			}
			for(char c='A'; c <= ch; c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}