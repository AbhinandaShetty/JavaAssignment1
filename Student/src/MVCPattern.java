import com.student.controller.StudentController;
import com.student.model.Student;
import com.student.view.StudentView;

public class MVCPattern {
	  public static void main(String[] args) {

	    
	      Student model  = retriveStudentFromDatabase();

	      StudentView view = new StudentView();

	      StudentController controller = new StudentController(model, view);

	      controller.updateView();

	      
	      controller.setStudentName("Anil");

	      controller.updateView();
	   }

	   private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Sunil");
	      student.setRollNo("001");
	      student.setGrade("FirstClass");
	      return student;
	   }
	

}
