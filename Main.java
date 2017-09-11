
import java.util.Date;
public class Main {

	public static void main(String[] args) {
StudentGroup sg=new StudentGroup(20);
Date a=new Date(1996,8,2);
Student s5=new Student(1,"sneha",a,70.0);
sg.addFirst(s5);
System.out.println(sg.getStudent(0).getId());
	}

}
