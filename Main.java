import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;
import java.util.*;




public class Main {
	
	public static BigInteger factorialNum(int n) {
		
		BigInteger fact = new BigInteger("1");
			// system.out.println(" Factorial of: "+ n);
		for ( int i=2; i<=n;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
			
				return fact;
					
		}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean isExit = true;
		// boolean studentdetails = true;
		boolean isSchoolExit = true;
		boolean isStudentExit = true;
		boolean isSubjectExit = true;
		
		int currancy;
		double monyAmount=0;
		double totalCalculation=0;
		double Amount;
		boolean isExitSmallMenue = true;
		boolean userPassword = true;
		
		
				
		Stack<String> history = new Stack<String>();
		Set<String> hashEmailSet = new HashSet<String>();
    	List<String> listDuplicateEmail=new ArrayList<>();
		ArrayList<School> schoolList = new ArrayList<>();
		ArrayList<Student> listStudent = new ArrayList<>();
		ArrayList<Subject> listSubject = new ArrayList<>();
		ArrayList<Mark> listMark = new ArrayList<>();
        Map<String, Double> currancyMap= new HashMap<>();
        Map<String, Map<String, Double>> compairMap= new HashMap<>();
       
        String username;
		String password;
		while (userPassword) {
			System.out.print("Enter username:");// username:safa
			username = sc.nextLine();
			System.out.print("Enter password:");// password:sa12345
			password = sc.nextLine();
			if (username.equals("safa") && password.equals("sa12345")) {
				System.out.println("username Successful welcome to System");
		
        
        do {

			System.out.println("*****************");
			System.out.println("**** Welcome ****");
			System.out.println("*****************");
			System.out.println("\t \t \t Please choose an option \t \t \t");

			
			System.out.println("1.Enter student details");
			System.out.println("2.Report");
			System.out.println("3.history");
			System.out.println("4.dupplecate email");
			System.out.println("5.currancy");
			System.out.println("6.coding problem Menue ");
			System.out.println("7.Exit");

			int option = sc.nextInt();

			switch (option) {

			// School mySchool = new School();

			case 1:

				// while School///
				while (isSchoolExit) {
					School mySchool = new School();
					System.out.println("Enter school name");
					String schoolName = sc.next();
					mySchool.setschoolName(schoolName);
					history.push(schoolName);

					System.out.println("Enter school Registration Number");
					mySchool.setschoolRegistrationNo(sc.nextInt());
//    	    		List<Subject> mySubject1 = new ArrayList<>();
//    	        	List<Mark> myMark1 = new ArrayList<>();

					// while student
					while (isStudentExit) {
						Student myStudent = new Student();
						System.out.println("Enter student name");
						String studentName = sc.next();
						myStudent.setstudentName(studentName);
						history.push(studentName);

						System.out.println("Enter student ID");
						int studentId = sc.nextInt();
						String stdId = Integer.toString(studentId);
						myStudent.setstudentId(studentId);
						history.push(stdId);

						System.out.println("Enter student Email");
						String studentEmail = sc.next();
						myStudent.setstudentEmail(studentEmail);
						listDuplicateEmail.add(studentEmail);
						history.push(studentEmail);

						// while subject
						while (isSubjectExit) {
							Subject mySubject = new Subject();
							System.out.println("Enter Subject name");
							String subjectName = sc.next();
							mySubject.setsubjectName(subjectName);
							history.push(subjectName);

							Mark myMark = new Mark();

							System.out.println("Enter Test1 Mark");
							int test1M = sc.nextInt();
							String mark1 = Integer.toString(test1M);
							myMark.setmarkOfTest1(test1M);
							history.push(mark1);

							System.out.println("Enter Test2 Mark");
							int test2M = sc.nextInt();
							String mark2 = Integer.toString(test2M);
							myMark.setmarkOfTest2(test2M);
							history.push(mark2);

							System.out.println("do you want to add new subject prees 1 if not press 0");
							int isExitSubjectinput = sc.nextInt();
							if (isExitSubjectinput == 0) {

								// isStudentExit=true;
								isSubjectExit = false;

							}
							listMark.add(myMark);
							
							
							
							
							mySubject.setsubMark(listMark);
							listSubject.add(mySubject);
							
							myStudent.setlistSubject(listSubject);
							
							

						}

						System.out.println("do you want to add new Student prees 1 if not press 0");
						int isExitStudentinput = sc.nextInt();
						if (isExitStudentinput == 1) {

							isStudentExit = true;
							isSubjectExit = true;
						} else {
							isStudentExit = false;
							isSubjectExit = false;
						}
						listStudent.add(myStudent);
					}
					
					mySchool.setlistStudent(listStudent);

					// use if condation for while of school to add more school
					// comber with other condation of while student and subject

					System.out.println("do you want to add new School prees 1 if not press 0");
					int isExitSchoolinput = sc.nextInt();
					if (isExitSchoolinput == 1) {
						isSchoolExit = true;
						isStudentExit = true;
						isSubjectExit = true;

					} else {
						isSchoolExit = false;
						isStudentExit = false;
						isSubjectExit = false;

					}

					/// close while subject
					/// close while student
					// close while school
					// while for school

					schoolList.add(mySchool);
					
					
				}
				break;

			case 2:
				System.out.println("*****Report*****");

				for (School s : schoolList) {
					System.out.println("schoolName: \t" + s.schoolName + "\n" +
				"schoolRegistrationNo: \t" + "\n"+ s.schoolRegistrationNo);

				for (Student stud : s.listStudent) {
					System.out.println("studentName: \t" + stud.studentName + "\n" + "studentId: \t"
								+ stud.studentId + "\n" + "studentEmail: \t" + stud.studentEmail + "\n");

				for (Subject su : stud.getlistSubject()) {

				for (Mark m : su.getlistMark()) {
					System.out.println("subjectName: \t"+su.subjectName+"\n"+
							"markOfTest1:  \t"+ m.getmarkOfTest1()+"\n"+
							"markOfTest2:  \t"+ m.getmarkOfTest2());
							}
						}
					}
				}

				break;

			case 3:
				while (history.empty() == false) {
					System.out.println(history.pop());
				}

				break;
			case 4:
			
				 for(String email : listDuplicateEmail ) {
					 if(hashEmailSet.add(email) == false) {
						 System.out.println("Deplicate email is: "+ " " + email );
				
					 }
				 }
				break;
			case 5:
				String currancyName= "cu";
				System.out.println(" Enter student Name: \t");
				String userIn = sc.next();
				System.out.println(" choose currancy you want to convert :  \n" +" 1.KWD \n"+ " 2.AED \n"
				+ " 3.USD \n" );
				
				//to see variable
//				double monyAmount=0;
//				double totalCalculation=0;
//				double Amount;
				
				currancy = sc.nextInt();
				System.out.println(" Enter  Amount you want to convert : ");
				monyAmount=sc.nextDouble();
				
				if (currancy==1) {
					totalCalculation=monyAmount*0.8;	
					currancyName="KWD";
				}
				
				else if (currancy==2) {
					totalCalculation=monyAmount*9.54;	
					currancyName="AED";
				}
				
				else if (currancy==3) {
					totalCalculation=monyAmount*2.6;	
					currancyName="USD";
				}
				
				currancyMap.put(currancyName, totalCalculation);
				compairMap.put(userIn, currancyMap);
				//System.out.println(currancyMap);
				System.out.println(compairMap);
				
				
				break;
               case 6:
            	   
				do {
				   System.out.println("******************************************");
            	   System.out.println("***** Welcom To Coding Problem Menue *****");
            	   System.out.println("******************************************");
            	   System.out.println("1.Find The Factorial ");
            	   System.out.println("2.Fibonacci");
            	   System.out.println("3. Back To First Menue");
            	   
				int option2=sc.nextInt();
				switch (option2) {
				
				 case 1:
					
						System.out.println("Enter A Number To Find Its  Factorial : \n");
						int n = sc.nextInt();
						BigInteger factorial=factorialNum(n);
						
						System.out.println(" Factorial of Number  \t" + n + "is : \t" + factorial ); 
						
						break;
						
				 case 2:
					 System.out.println(" please Enter the length  : \t"+ "\n");
					 int addNum=sc.nextInt();
					 int number1=0;
					 int number2=1;
					 int number3;
					 System.out.println(number1 + " " + number2 );
					 for ( int i=2;i<=addNum;i++) {
						 
						 number3=number1+number2;
						 if (number3<=100) {
							 System.out.println(" "+ number3);
							 number1=number2;
							 number2=number3;
						 }
					 }
					
						break;
						
						
				 case 3:
					 isExitSmallMenue = false;
						break;

			}

				} 
				while (isExitSmallMenue);
				break;
				
				
			    case 7:
			    System.out.println(" See You Soon ");
				System.exit(0);
				
				break;

			}
}
        while(isExit);
			}
		System.out.println("Username and Password Failed");
	}
	userPassword = false;
}
}
	
