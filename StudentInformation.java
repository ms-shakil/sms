
import java.util.*;
public class StudentInformation {
private String FirstName;
private String LastName;
private int semester;
private String Id;


Scanner st=new Scanner(System.in);
Scanner In=new Scanner(System.in);
public void sFirstName(String FirstName) {
	this.FirstName = FirstName;
	}
public void sLastName(String LastName) {
	
	this.LastName = LastName;
	}
public void ssemester(int semester) {
	
	this.semester = semester;
	}
public void sId(String Id) {
	
	this.Id = Id;
	}
public String gFirstName() {
	return FirstName;
}
public String gLastName() {
		return LastName;
	}
public String gId() {
		return Id;
	}
public int gsemester() {
		return semester;
	}


}
