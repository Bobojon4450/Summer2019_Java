package day11_Ifreview;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2020;// 366 days in leap year
		boolean leapYear = year % 4 == 0;

		if (leapYear) {
			System.out.println("Year " + year + " is a leap year!");
		} else
			System.out.println("Year " + year + " is not a leap year!");

/***************************************************************/

		int grade = 150;
		boolean A = (grade >= 90 && grade <= 100);
		boolean B = (grade >= 80 && grade <= 89);
		boolean C = (grade >= 70 && grade <= 79);
		boolean D = (grade >= 60 && grade <= 69);
		boolean gradeValid = grade >= 0 && grade <= 100;

		if (gradeValid) {
			if (A) {
				System.out.println("The grade is A\n");
			} else if (B) {
				System.out.println("The grade is B\n");
			} else if (C) {
				System.out.println("The grade is C\n");
			} else if (D) {
				System.out.println("The grade is D\n");
			} else
				System.out.println("The grade is F\n");
		} else
			System.out.println("Invalid value!\n");

		// Second version of the same problem.

		if (grade >= 90 && grade <= 100) {
			System.out.println("The grade is A\n");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("The grade is B\n");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("The grade is C\n");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("The grade is D\n");
		} else if (grade < 60) {
			System.out.println("The grade is F\n");
		} else {
			System.out.println("Invalid value!\n");
		}

/***************************************************************/

		int age = 30;
		boolean goodPerson = false;
		
		if (age >= 18) {
			if (goodPerson) {
				System.out.println("Alcohol is bad for your health.\n");
			}else {
				System.out.println("Allowed to buy a cigarretts only\n");
				if (age >= 21) {
					System.out.println("Allowed to buy a cigarretts and hookah\n");
				}if (age >= 25) {
					System.out.println("Allowed to buy a cigarretts, hookah and alcohol\n");
				}
			}
		} else {
			System.out.println("Allowed to buy milk only\n");
		}


/***************************************************************/
		/*
		 Find number of days in a month. Must use nested if statement.
		 
		 1		2		3		4		5		6		7		8		9		10		11		12
		 Jan	Feb 	March 	Apr		May		June	July	Aug		Sep 	Oct		Nov		Dec
		 31		28		31		30		31		30		31		31		30		31		30		31
		
		 28 days: 2
		 30 days: 4,6,9,11
		 31 days: 1,3,5,7,8,10,12
		 
		 even number of 30 days: 4 & 6
		 odd numbers of 30 days: 9 & 11
		 
		 even number of 31 days: 8, 10 & 12
		 odd number of 31 days: 1, 3, 5 & 7
		
		*/
		
//		int month = 7;
//		if (month > 0 && month <13) {
//			if (month == 1) {
//				System.out.println("31 days\n");
//			}else if (month == 2) {
//				System.out.println("28 days\n");
//			}else if (month == 3) {
//				System.out.println("31 days\n");
//			}else if (month == 4) {
//				System.out.println("30 days\n");
//			}else if (month == 5) {
//				System.out.println("31 days\n");
//			}else if (month == 6) {
//				System.out.println("30 days\n");
//			}else if (month == 7) {
//				System.out.println("31 days\n");
////			}else if (month == 8) {
////				System.out.println("31 days");
////			}else if (month == 9) {
////				System.out.println("30 days");
////			}else if (month == 10) {
////				System.out.println("31 days");
////			}else if (month == 11) {
////				System.out.println("30 days");
////			}else if (month == 12) {
////				System.out.println("31 days");
////			}
//			}else if (month % 2 == 0) {
//				System.out.println("31 days\n");
//			}else {
//			System.out.println("30 days\n");
//			}	
//		}else {
//			System.out.println("Invalid Month\n");
//		}
		
		/*
		  1		2		3		4		5		6		7		8		9		10		11		12
		 Jan	Feb 	March 	Apr		May		June	July	Aug		Sep 	Oct		Nov		Dec
		 31		28		31		30		31		30		31		31		30		31		30		31
		 
		 */
		
	int month2 = 12;
	
		if (month2 > 0 && month2 <13) {
			if(month2 <= 7 ) {
				if (month2 % 2 == 0) {
					if(month2 == 2) {
						System.out.println("28 days");
					}else {
						System.out.println("30 days");
					}
				}else {
					System.out.println("31 days");
				}
			}else if (month2 > 7) {
				if (month2 % 2 == 0) {
					System.out.println("31 days");
				}else {
					System.out.println("30 days");
				}
			}
		}else {
			System.out.println("Invalid month\n");
		}
		
	/***************************************************************/
		
		int year2 = 2019;// 366 days in leap year
		boolean leapYear2 = year2 % 4 == 0;//leap year if true.
		int month3 = 2;
		
		if (month3 > 0 && month3 < 13) {
			if (month3 == 2) {
				if (leapYear2) {
					System.out.println("29 days");
				}else {
					System.out.println("28 days\n");
				}
			} else if (month3 == 4 || month3 == 6) {
				System.out.println("30 days\n");
			} else if (month3 == 9 || month3 == 11) {
				System.out.println("30 days\n");
			} else {
				System.out.println("31 days\n");
			}
		}else {
			System.out.println("Invalid month!");
		}
		
		

	}
}
