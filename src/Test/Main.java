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
				for(int i=1; i<=5; i++) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(i+".pdf"));
				Student obj = new Student();
				System.out.print("Please enter student name: ");
				String stusentName = sca.next();
				obj.setStudentName(stusentName);
				//myStack.push(stusentName);
				
			
				writer.write("Student File ");
					 
					writer.write("\n" + stusentName);
				
					writer.close();
				}
				
			} catch (IOException a) {
			System.out.println("Error");
			a.printStackTrace();
		}

	}
	

}
