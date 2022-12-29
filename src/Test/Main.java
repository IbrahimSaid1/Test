package Test;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		Stack<String> myStack = new Stack<>();
		Scanner sca = new Scanner(System.in);

//		Student obj = new Student();
//		System.out.print("Please enter student name: ");
//		String stusentName = sca.next();
//		obj.setStudentName(stusentName);
//		myStack.push(stusentName);
//		System.out.print("Please enter the mark: ");
//		int mark = sca.nextInt();
//		obj.setMark(mark);
//		String mar = Integer.toString(mark);
//		myStack.push(mar);


		
			try {

				BufferedWriter writer1 = new BufferedWriter(new FileWriter("Student1.pdf"));
				BufferedWriter writer2 = new BufferedWriter(new FileWriter("Student2.pdf"));
				BufferedWriter writer3 = new BufferedWriter(new FileWriter("Student3.pdf"));
				BufferedWriter writer4 = new BufferedWriter(new FileWriter("Student4.pdf"));
				BufferedWriter writer5 = new BufferedWriter(new FileWriter("Student5.pdf"));
				BufferedWriter writer6 = new BufferedWriter(new FileWriter("Student6.pdf"));
				BufferedWriter writer7 = new BufferedWriter(new FileWriter("Student7.pdf"));
				BufferedWriter writer8 = new BufferedWriter(new FileWriter("Student8.pdf"));
				BufferedWriter writer9 = new BufferedWriter(new FileWriter("Student9.pdf"));
				BufferedWriter writer10 = new BufferedWriter(new FileWriter("Student10.pdf"));
				BufferedWriter writer11 = new BufferedWriter(new FileWriter("Student11.pdf"));
				BufferedWriter writer12 = new BufferedWriter(new FileWriter("Student12.pdf"));
				BufferedWriter writer13 = new BufferedWriter(new FileWriter("Student13.pdf"));
				BufferedWriter writer14 = new BufferedWriter(new FileWriter("Student14.pdf"));
				BufferedWriter writer15 = new BufferedWriter(new FileWriter("Student15.pdf"));
				BufferedWriter writer16 = new BufferedWriter(new FileWriter("Student16.pdf"));
				BufferedWriter writer17 = new BufferedWriter(new FileWriter("Student17.pdf"));
				BufferedWriter writer18 = new BufferedWriter(new FileWriter("Student18.pdf"));
				BufferedWriter writer19 = new BufferedWriter(new FileWriter("Student19.pdf"));
				BufferedWriter writer20 = new BufferedWriter(new FileWriter("Student20.pdf"));
				BufferedWriter writer21 = new BufferedWriter(new FileWriter("Student21.pdf"));
				BufferedWriter writer22 = new BufferedWriter(new FileWriter("Student22.pdf"));
				BufferedWriter writer23 = new BufferedWriter(new FileWriter("Student23.pdf"));
				
				writer1.write("Bader \nc++ ");
				writer1.close();
			
				writer2.write("Ali \njava");
				writer2.close();
				
				writer3.write("Ahmed \njava ");
					writer3.close();
			

				writer4.write("Mohmmed \njava ");
					writer4.close();
				
			
			
			
			
			} catch (IOException a) {
			System.out.println("Error");
			a.printStackTrace();
		}

		}
	

}
