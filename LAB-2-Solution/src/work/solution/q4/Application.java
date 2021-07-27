package work.solution.q4;

import java.util.*;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<Student>();

		String wantToContinue="Y";
		System.out.println("******* Welcome *******");
		do {

			System.out.println("Enter 1 :Create Student Object");
			System.out.println("Enter 2 :Display Student Information");

			int input = sc.nextInt();

			if (input == 1) {

				System.out.println("Enter Student Information");
				System.out.println("format : id_name_grade");
				String studentData = sc.next();
				String studentInfo[] = studentData.split("_");
				if (studentInfo.length == 1) {
					// we have entered a single parameter only
					studentList.add(new Student(studentInfo[0]));
				} else if (studentInfo.length == 2) {
					// we have entered two parameter for name and id
					studentList.add(new Student(studentInfo[1], studentInfo[0]));
				}else {
					// we have entered all the three parameters
					studentList.add(new Student(studentInfo[1], studentInfo[0], Double.parseDouble(studentInfo[2])));
				}

				System.out.println("*** Student Added Successfully ***");
				System.out.println();
				
			} else if (input == 2) {
				
				if(studentList.size()==0) {
					System.out.println("!!! Empty Student List");
					System.out.println();
					continue;
				}
				
				System.out.println("Enter Year : ");
				int year=sc.nextInt();
				
				for(int i=0;i<studentList.size();i++) {
					Student student=studentList.get(i);
					student.display(year);
				}
				
			} else {
				System.out.println("Wrong choice,please enter correct number");
				continue;
			}
			System.out.println("Do you want to continue ,if yes then press Y else N");
			wantToContinue=sc.next();
		} while (wantToContinue.equals("Y")||wantToContinue.equals("y"));

		System.out.println("****Successfully Exited****");
		
	}
}
