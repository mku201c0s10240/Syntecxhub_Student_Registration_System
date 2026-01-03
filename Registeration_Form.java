package student_registeration_system;

import java.util.*;

public class Registeration_Form {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Registeration_Process rp=new Registeration_Process();
		
		while(true) {
			header("       ...STUDENT REGISTERATION FORM...");
			System.out.println("1. Add Students");
			System.out.println("2. View Student");
			System.out.println("3. Update Student");
			System.out.println("4. Delete student");
			System.out.println("5. Exist \n");
			System.out.println("Choose any Option");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:rp.addStudent();
			break;
			case 2:rp.viewStudent();
			break;
			case 3:rp.updateStudent();
			break;
			case 4:rp.deleteStudent();
			break;
			case 5:System.out.println("Thank You");
			return;
			default :System.out.println("Invalid Choice");
			break;
			}
		}

	}
	public static void header(String text) {
		System.out.println("==============================================");
		System.out.println(text);
		System.out.println("==============================================");
	}

}
