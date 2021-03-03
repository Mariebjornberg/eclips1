package simpsonsSwitch;

import java.util.Scanner;

public class SwitchSimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("välj ett tal mellan 1-11");
		System.out.println("1.Homer \n2.Marge \n3.Bart \n4.Lisa \n5.Maggie");
				Scanner scan = new Scanner(System.in);
				int intNumber = Integer.valueOf(scan.nextLine());
				switch(intNumber) {
				case  1:
				System.out.println("D’oh!");
					break;
				case 2:
					System.out.println("Mmm~mmmmm");
					break;
				case 3:
					System.out.println("¡Ay, caramba!");
					break;
				case 4:
					System.out.println("If anyone wants me, I'll be in my room.");
					break;
				case 5:
					System.out.println("(Pacifier Suck)");
					break;
				default:
					System.out.println("please choose a correct carachter");


			}

	}

}
