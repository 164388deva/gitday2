package com.deva;

import com.deva.supp.MyDate;

public class DateDifferenceProvider {
	 final int leapYear[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
	 final int nonLeapYear[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	private boolean leapYear(int year){
		
		return (((year % 4 == 0) && (year % 100 != 0)) || 
		        (year % 400 == 0)); 
			
			
		}
	
public   int differeceCalculator(MyDate startDate,MyDate endDate){
	int startYear= startDate.getYyyy();
	int endYear=endDate.getYyyy();
	int startMonth= startDate.getMm();
	int endMonth=endDate.getMm();
	int startDay=startDate.getDd();
	int endDay=endDate.getDd();
	int remainingdays=0;
	
	if(startYear==endYear && !leapYear(startYear)){
		if( startMonth==endMonth ){
			return Math.abs(endDay-startDay);
		}
		else 
		{
		 remainingdays=nonLeapYear[startMonth]-startDay;
		 for(int index=startMonth+1;index<endMonth;index++){
			 remainingdays+=nonLeapYear[index];	 
		 }
		 remainingdays+=endDay;
		return remainingdays;	
		}		
	}
	else if(startYear==endYear && leapYear(startYear)){
		if( startMonth==endMonth ){
			return Math.abs(endDay-startDay);
		}
		else 
		{
		  remainingdays=leapYear[startMonth]-startDay;
		 for(int index=startMonth+1;index<endMonth;index++){
			 remainingdays+=leapYear[index];	 
		 }
		 remainingdays+=endDay;
		return remainingdays;	
		}		
	}
	
	else {
		if(leapYear(startYear)){
			 remainingdays=leapYear[startMonth]-startDay;
			 for(int internalIndex=startMonth+1;internalIndex<=12;internalIndex++){
				 remainingdays+=leapYear[internalIndex];
			
		}
		}
			 else if(!leapYear(startYear)){
					 remainingdays=nonLeapYear[startMonth]-startDay;
					 for(int internalIndex=startMonth+1;internalIndex<=12;internalIndex++){
						 remainingdays+=nonLeapYear[internalIndex];
					
				}
			 }
		for(int index=startYear+1;index<endYear;index++){
			if(leapYear(index)){
				remainingdays+=366;
			}
			else{
				remainingdays+=365;
			}
			
		}
		if(leapYear(endYear)){
			remainingdays+=endDay;
			 for(int internalIndex=1;internalIndex<endMonth;internalIndex++){
				 remainingdays+=leapYear[internalIndex];
			
		}
		}
			 else if(!leapYear(endYear))
			 {
					remainingdays+=endDay;
					 for(int internalIndex=1;internalIndex<endMonth;internalIndex++){
						 remainingdays+=nonLeapYear[internalIndex];
					
					 }
		
	 }
		return remainingdays;
	
  }
}
}

