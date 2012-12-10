
public class RomanNumerals {

	public String toRoman(int nmber)
	{
		if(nmber<1|| nmber>3999)
			return "-1";
		
		int[] aArray={50,40,10,9,5,4,1};
		String[] sArray={"L","XL","X","IX","V","IV","I"};
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
