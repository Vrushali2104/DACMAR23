class Pat10{
	
	public static void main(String args[]){
		
		for(char ch = 'E'; ch >= 'A'; ch--)
		{
			for(char cr = 'A'; cr<= ch; cr++)
			{
				System.out.print(" ");
			}
			for(char c = ch; c<= 'E';c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}