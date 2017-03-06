package iterations;

import java.util.Scanner;

public class ElseIfExample {

	
	public static void seasons(){
		
		//Nested If
//		System.out.println("Enter the month: ");
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
		
/*		if(month==12||month==1||month==2){
			System.out.println("Winter");
		}
		
		else if(month==3||month==4||month==5){
			System.out.println("Spring");
		}
		else if(month==6||month==7||month==8){
			System.out.println("summer");
		}
		else if(month==9||month==10||month==11){
			System.out.println("Autumn");
		}
		else
			System.out.println("Enter the proper month"); */
		
		//Switch case
		
/*		switch(month){
		case 12 :
		case 1:
		case 2:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
		default: 
			System.out.println("This is not a month");
		}*/
		
		
		
		//While loop
		
/*		System.out.println("Printing all the Months later: ");
		while(month<=12 && month >0){
			System.out.println(month);
			month++;
		}*/
		
		//Do-While
		
/*		System.out.println("Printing all the Months later: ");
		do {
			System.out.println(month);
			month++;
		}while(month<=12 && month >0);*/
		
		
		//nested loops
		int n=10;
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print(j*i+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		seasons();

	}

}
