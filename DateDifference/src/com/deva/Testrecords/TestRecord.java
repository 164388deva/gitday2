package com.deva.Testrecords;

import com.deva.supp.MyDate;

public class TestRecord {
private MyDate startDate;
private MyDate endDate;
 private int calculatedDifference;

public TestRecord(MyDate startDate, MyDate endDate, int calculatedDifference) {
	super();
	this.startDate = startDate;
	this.endDate = endDate;
	this.calculatedDifference = calculatedDifference;
}
public MyDate getStartDate() {
	return startDate;
}
public MyDate getEndDate() {
	return endDate;
}
public int getCalculatedDifference() {
	return calculatedDifference;
}
}
