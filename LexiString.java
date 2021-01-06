import java.util.Scanner;
public class LexiString {
	public static void main(String [] args)
	{
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Type your trial number");
		
		int trial = scn.nextInt();
		System.out.println(trial);
		for(int i = 0; i < trial ; i++) {
			
		System.out.println("Type your p String");
		String p = scn.next();
		System.out.println("Type your s String");
		String s = scn.next();
		System.out.println(smallestLexi(p,s));
		char[] sc = s.toCharArray();
		int sa = sc[0];
		System.out.println(sa);
		}
				
		
	}
	public static String smallestLexi(String p, String s)
	{
		char [] pToCharArray =  p.toCharArray();
		char [] sToCharArray = s.toCharArray();
		int order = 0;
		for(int i = 0; i<pToCharArray.length;i++)
		{
			for(int m = 0;m<sToCharArray.length; m++)
			{
				if(sToCharArray[m]==pToCharArray[i])
				{
					char temp = sToCharArray[order];
					sToCharArray[order]=sToCharArray[m];
					sToCharArray[m] = temp;
					order++;
					m = sToCharArray.length;
					i++;
				}
			}
		}
		
		String answer = new String(sToCharArray);
		return answer;
	}

}
