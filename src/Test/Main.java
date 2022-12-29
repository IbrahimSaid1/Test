package Test;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;	
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		Scanner sca = new Scanner(System.in);

			try {
				for(int i=1; i<=100; i++) {
				BufferedWriter writer = new BufferedWriter(new FileWriter(i+".pdf"));
				Student obj = new Student();
				System.out.print("Please enter student name: ");
				String stusentName = sca.next();
				obj.setStudentName(stusentName);
				
			
				writer.write("Student File... ");
					writer.write("\n" + stusentName);
					writer.close();
				}

			} catch (IOException a) {
			System.out.println("Error");
			a.printStackTrace();
		}
			
			File folder= new File("pdf");
			boolean option=true;
			while(option) {
				System.out.println("Do you want to search?\n1-Yes\n2-No");
				int j = sca.nextInt();	
				if(j==1) {
				System.out.print("Input the name to find: ");
				String name = sca.next();			 
				if(name.contains(name)) {
				     System.out.println("Found");
				     folder.mkdir();
				 }
				 else {
				     System.out.println("Not Found");
				 }
				}
				else if(j==2) {
					System.out.println("Thank You");
					option=false;
					
				}
			}
			

	}
	

}
