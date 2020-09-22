package javaproject;
public class empcheck {	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String args[]) {
int empHrs=0;
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int empCheck=(int) Math.floor(Math.random()*10)%3;
	int empHrs=0, empWage=0, totalEmpWage = 0, totalWorkingDays = 0;
	while(
    totalWorkingDays < NUM_OF_WORKING_DAYS) {
	totalWorkingDays++;
	int empCheck=(int) Math.floor(Math.random()*10)%3;
	switch(empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
@@ -19,5 +25,12 @@ public static void main(String args[]) {
			default:
				empHrs=0;
	}

	empWage = empHrs * EMP_RATE_PER_HOUR;
	totalEmpWage += empWage;

}
	System.out.println("Total Emp Wage: " + totalEmpWage);

}
} 