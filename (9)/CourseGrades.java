
/**
 * @author Joe Kreke
 *
 */
public class CourseGrades {

	private GradedActivity[] grades = new GradedActivity[4];
	
	/**
	 * 
	 */
	public CourseGrades() {
		
	}
	
	public CourseGrades(GradedActivity[] Grades) {
		this.grades = Grades;
	}

	/**
	 * @return the grades
	 */
	public GradedActivity[] getGrades() {
		return grades;
	}

	/**
	 * @param grades the grades to set
	 */
	public void setGrades(GradedActivity[] grades) {
		this.grades = grades;
	}
	
	public void setLab(GradedActivity lab){
		
	}

}
