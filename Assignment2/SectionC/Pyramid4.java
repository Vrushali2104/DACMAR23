class Pyramid4{
	
	public static void main(String args[]){
		
		for(int i=1; i<=9; i++)
		{
			for(int k=8; k>=i; k--)
			{
				System.out.print("  ");
			}
			for(int j= 1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			int m=1;
			for(int b = 2; b<=i; b++)
			{
				System.out.print((m-(b-i))+" ");
			}
			m++;
			System.out.println();
		
		}
		
	}
}