package com.deva.Test;

import com.deva.supp.MyDate;

public class DateDifferenceProvider2 {
	static final int leapYear[] = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31,
			30, 31 };
	static final int nonLeapYear[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
			31, 30, 31 };

	public int differeceCalculator(MyDate startDate, MyDate endDate) {

		if (sameDate(startDate, endDate) && sameMonth(startDate, endDate)&& sameYear(startDate, endDate)) {
			return 0;
		} else if (sameYear(startDate, endDate)
				&& sameMonth(startDate, endDate)) {
			return endDate.getDd() - startDate.getDd();
		}

		else if (sameYear(startDate, endDate) && !sameMonth(startDate, endDate)) {
			return remainingDaysInMonth(startDate)
					+ daysInIntervingMonth(startDate, endDate)
					+ leadingMonth(endDate);
		} else {
			return remainingDaysInMonth(startDate)
					+ intervingMonthFromStartDateToDecember(startDate)
					+ leadingMonth(endDate)
					+ intervingMonthFromJanuaryToEndMonth(endDate)
					+ daysInInterveningYear(startDate, endDate);
		}

	}

	private int intervingMonthFromJanuaryToEndMonth(MyDate endDate) {
		int noOfDays = 0;
		if (!leapYear(endDate.getYyyy())) {
			for (int index = 1; index < endDate.getMm(); index++) {
				noOfDays += nonLeapYear[index];
			}
		} else {
			for (int index = 1; index < endDate.getMm(); index++) {
				noOfDays += leapYear[index];
			}
		}

		return noOfDays;
	}

	private int intervingMonthFromStartDateToDecember(MyDate startDate) {

		int noOfDays = 0;
		if (!leapYear(startDate.getYyyy())) {
			for (int index = startDate.getMm() + 1; index <= 12; index++) {
				noOfDays += nonLeapYear[index];
			}
		} else if (leapYear(startDate.getYyyy())) {
			for (int index = startDate.getMm() + 1; index <= 12; index++) {
				noOfDays += leapYear[index];
			}

		}

		return noOfDays;
	}

	private boolean leapYear(int year) {

		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));

	}

	private int daysInInterveningYear(MyDate startDate, MyDate endDate) {
		int noOfDays = 0;
		for (int index = startDate.getYyyy() + 1; index < endDate.getYyyy(); index++) {
			if (leapYear(index)) {
				noOfDays += 366;
			} else {
				noOfDays += 365;
			}
		}

		return noOfDays;
		// TODO Auto-generated method stub

	}

	private int leadingMonth(MyDate endDate) {
		int noOfDays = 0;
		noOfDays = endDate.getDd();

		return noOfDays;
	}

	private int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		// TODO Auto-generated method stub
		int noOfDays = 0;
		if (!leapYear(endDate.getYyyy())) {
			for (int index = startDate.getMm() + 1; index < endDate.getMm(); index++) {
				noOfDays += nonLeapYear[index];
			}

		} else {
			for (int index = startDate.getMm() + 1; index < endDate.getMm(); index++) {
				noOfDays += leapYear[index];
			}

		}

		return noOfDays;
	}

	private int remainingDaysInMonth(MyDate startDate) {
		// TODO Auto-generated method stub
		int noOfDays = 0;
		if (leapYear(startDate.getYyyy())) {
			noOfDays = leapYear[startDate.getMm()] - startDate.getDd();

		} else {
			noOfDays = nonLeapYear[startDate.getMm()] - startDate.getDd();

		}

		return noOfDays;
	}

	private boolean sameYear(MyDate startDate, MyDate endDate) {
		// TODO Auto-generated method stub
		if (startDate.getYyyy() == endDate.getYyyy()) {
			return true;

		}
		return false;
	}

	private boolean sameMonth(MyDate startDate, MyDate endDate) {
		// TODO Auto-generated method stub
		if (startDate.getMm() == endDate.getMm()) {
			return true;

		}
		return false;

	}

	private boolean sameDate(MyDate startDate, MyDate endDate) {
		if (startDate.getDd() == endDate.getDd()) {
			return true;

		}
		return false;
	}
}