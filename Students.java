import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner In=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		System.out.print("Enter total number of student: ");
		int no=In.nextInt();
		
		Creat student[]= new Creat[no];
		Enroll student1[] = new Subject[no];
		int k, i=0;
		
		do { 
			
			System.out.println("\n1. Create Students Information");
			System.out.println("2. Display Students Information");
			System.out.println("3. Enroll Subject");
			System.out.println("4. Display Enrolled Subject");
			System.out.print("0. Exit \n"+"Enter Your Choice: ");
		     int n=In.nextInt();
			switch(n) {
			case 1: 
				
				for(i=0;i<no;i++) {
				
				student[i] = new Creat();
                                student[i].creat();
				}

				break;
			case 2:
				
				for(i=0;i<no;i++) {
                                    System.out.println("Student :"+(i+1));
	
				    student[i].display();
				    
				}
				break;
			
			case 3:
				for(i=0;i<no;i++) {
                                    System.out.println("For Student : "+(i+1));
					student1[i]=new Subject();
					student1[i].subject();
				}
				System.out.println("Subjects Enroll Successful!");
				
				break;
			case 4:
				for(i=0;i<no;i++) {
                                 System.out.println("For Student : "+(i+1));
				 student1[i].displaySubjects();
                                    System.out.println("");
				}
				break;
			default:
					System.out.println("Exit Successful!");
					break;
			}
			k=n;
			
	}while(k!=0);
	}
	}

