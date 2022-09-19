
import java.util.Scanner;

public class Creat {
	StudentInformation cr=new StudentInformation();
	Scanner st=new Scanner(System.in);
	Scanner In=new Scanner(System.in);
	void creat() {
		System.out.print("\nEnter Your First Name: ");
		String FirstName = st.nextLine();
		cr.sFirstName(FirstName);
		System.out.print("Enter Your Last Name: ");
		String LastName = st.nextLine();
		cr.sLastName(LastName);
		System.out.print("Enter Your Semester In Integer Number: ");
		int semester = In.nextInt();
		cr.ssemester(semester);
		System.out.print("Enter Your ID: ");
		String Id = st.nextLine();
		cr.sId(Id);
	}
	void display() {
		System.out.print("Name: "+cr.gFirstName()+" "+cr.gLastName()+"\n");
		System.out.print("Semester: "+cr.gsemester()+"\n");
		System.out.print("ID: "+cr.gId()+"\n");
                System.out.println("\n");
	}
}
	
