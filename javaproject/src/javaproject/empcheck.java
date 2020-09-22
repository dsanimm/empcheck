package javaproject;
public class empcheck {


	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static void main(String args[]) {
int empHrs=0;
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

		int empCheck=(int) Math.floor(Math.random()*10)%3;
	switch(empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
				break;
			case IS_PART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
	}
}
} 