package lz77;

public class compression {
	private String data="abaababaabbbbbbbbbbbba";
	private String m3aya_mn_data="";
	private String checkMode="";
	private String compress="";
	int whil=0,i=0,index=0,Return=0;
	public void readFromAfile()
		{
		
		}
	public void compress()
		{
		while(whil<data.length())
			{
			checkMode="";
			char c;
			c=data.charAt(whil);
			checkMode+=c;
			if(m3aya_mn_data.contains(checkMode))
				{
				while(m3aya_mn_data.contains(checkMode))
					{
					whil++;
					Return++;
					if(whil>=data.length())
					  {
						break;
					  }
					checkMode +=data.charAt(whil);
					}
				m3aya_mn_data += checkMode.subSequence(0,checkMode.length()-1);
				index= m3aya_mn_data.length()-m3aya_mn_data.indexOf((String) checkMode.subSequence(0,checkMode.length()-1));
				compress +="<"+index+","+Return+","+data.charAt(whil-1)+">";
				}else{
					m3aya_mn_data +=checkMode;
					compress +="<0,0,"+data.charAt(whil)+">";
					whil++;
				}
			
			}	
		System.out.println(compress);
		}
	
}
