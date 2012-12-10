
public class RomanNumerals {

	public String toRoman(int nmber)
	{
		if(nmber<1|| nmber>3999)
			return "-1";
		
		int[] aArray={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] sArray={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String number="";
		
		for(int i=0;i<aArray.length;i++)
		{
			while(nmber>=aArray[i])
			{
				number+=sArray[i];
				nmber-=aArray[i];
			}
		}
		return number;
	}

}
