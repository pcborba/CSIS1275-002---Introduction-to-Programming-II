package quiz2;

public class bubbleSort {

	public static void main(String[] args) {
		String[] names = {"Simon","Ray","Victor","Ivan","Nelson","Jim"};
		int length = names.length;
		String temp = "";
		for (int x =0; x<length;x++)
		{
			for(int y = 0; y<length-1;y++)
			{
				if(names[y].compareToIgnoreCase(names[y+1]) >=0)
				{
					temp = names[y];
					names[y]=names[y+1];
					names[y+1]=temp;
				}
			}
		}
		
		for (int x = 0; x<length;x++)
		{
			System.out.print(names[x]+" ");
		}

	}

}
