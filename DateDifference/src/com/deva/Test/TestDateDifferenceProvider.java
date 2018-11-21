package com.deva.Test;

import com.deva.DateDifferenceProvider;
import com.deva.Testrecords.TestRecord;
import com.deva.supp.MyDate;

public class TestDateDifferenceProvider {
public static void main(String[] args) {
	
	TestRecord [] testRecords=new TestRecord[15];
	testRecords[0]=new TestRecord(new MyDate(4,6,2011), new MyDate(4,6,2011),0);
	testRecords[1]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,4,2011),12);
	testRecords[2]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,5,2011),42);
	testRecords[3]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,6,2011),73);
	testRecords[4]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,12,2011),256);
	testRecords[5]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,12,2012),622);
	testRecords[6]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,12,2013),987);
	testRecords[7]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,12,2113),37511);
	testRecords[8]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,12,2413),147084);
	testRecords[9]=new TestRecord(new MyDate(6,4,2011), new MyDate(18,12,2813),293181);
	testRecords[10]=new TestRecord(new MyDate(6,1,2011), new MyDate(6,3,2011),59);
	testRecords[11]=new TestRecord(new MyDate(6,1,2012), new MyDate(6,3,2012),60);
	testRecords[12]=new TestRecord(new MyDate(6,2,2012), new MyDate(6,3,2012),29);
	testRecords[13]=new TestRecord(new MyDate(22,1,2012), new MyDate(15,11,2012),298);
	testRecords[14]=new TestRecord(new MyDate(6,2,2012), new MyDate(6,12,2012),304);
	/*for(TestRecord temp:testRecords ){
		DateDifferenceProvider DT=new DateDifferenceProvider();
		
		if(DT.differeceCalculator(new MyDate(4,6,2011), new MyDate(4,6,2011))==temp.getCalculatedDifference()){
			
			System.out.println("Testcase passed");
		}
		else{
			
			System.out.println("Test case failed");
		}
		
	}*/
	
	for(int index=0;index<testRecords.length;index++){
		DateDifferenceProvider2 DT=new DateDifferenceProvider2();
		int calculateddiff=DT.differeceCalculator(testRecords[index].getStartDate(), testRecords[index].getEndDate());
		if(calculateddiff==testRecords[index].getCalculatedDifference()){
			System.out.println("test case passed");
			
		}
		else{
			
			System.out.println("test case failed");
			System.err.println("actual:"+testRecords[index].getCalculatedDifference() +"calculated:"+calculateddiff);
		}
		
	}

	for(int index=0;index<testRecords.length;index++){
		DateDifferenceProvider DT1=new DateDifferenceProvider();
		int calculateddiff=DT1.differeceCalculator(testRecords[index].getStartDate(), testRecords[index].getEndDate());
		if(calculateddiff==testRecords[index].getCalculatedDifference()){
			System.out.println("test case passed");
			
		}
		else{
			
			System.out.println("test case failed");
			System.err.println("actual:"+testRecords[index].getCalculatedDifference() +"calculated:"+calculateddiff);
		}
		
	}
	
}
}
