import java.util.*;
class Employee_present_not{
	public static void main(String args[]){
		int isFull_time=1;
		double check=Math.floor(Math.random()*10)%2;
		if(isFull_time==check){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is not present");
		}
	}
}
