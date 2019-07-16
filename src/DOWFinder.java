
public class DOWFinder {

		
	public String findDOW(int date,int month,int year)
	{
		int remDays=((year-1900)*365);
		remDays=remDays+((year-1900)/4);
		boolean isLeap=false;
		
		  if(isLeap && month<=2) remDays=remDays-1;
		 
		int i=1;
		while(i<=month)
		{
			if(i==month)
				remDays+=date;
			else
			{
			if(i<=7)
			{
				if(i%2!=0)
					remDays=remDays+31;
				else
				{
					if(i==2)
						remDays=remDays+28;
					else
						remDays=remDays+30;
				}
			}
			else 
			{
				if(i%2==0)
					remDays=remDays+31;
				else
					remDays=remDays+30;
			}
			}
			
			i++;
		}
		int remainder=remDays%7;
		String day="";
		switch(remainder)
		{
		case 0:{day+="sunday";break;}
		case 1:{day+="monday";break;}
		case 2:day+="tuesday";break;
		case 3:day+="wednesday";break;
		case 4:day+="thursday";break;
		case 5:day+="friday";break;
		case 6:day+="saturday";break;
		}
		System.out.println(day);
		return day;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int date=31;
		int month=7;
		int year=1991;
		DOWFinder d=new DOWFinder();
		String day=d.findDOW(date,month,year);
		System.out.println("the day of the mentioned date is "+day);

	}

}
