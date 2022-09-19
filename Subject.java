
import java.util.*;
class Subject extends Enroll {
	Scanner st=new Scanner(System.in);
	Scanner in=new Scanner(System.in);
	int z,j=0;
	String[] SubjectName= new String[10];
        @Override
      void subject() {
          
		System.out.print("How Many Subjects Do You want  to Enroll: ");
		z=in.nextInt();
		
		for(j=0;j<z;j++) {
		
		System.out.print("Enter Subject Name: ");
		SubjectName[j]=st.nextLine();
		}
                System.out.println("");
		
	}
        @Override
	void displaySubjects() {
		System.out.println("Your Enrolled subjects are:");
		for(j=0;j<z;j++) {
			System.out.print(SubjectName[j]+"\n");
                        
	}
	

}
}
