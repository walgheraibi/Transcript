//******************

import java.text.NumberFormat;
import java.util.ArrayList;

public class Transcript {

	ArrayList<CourseEnrollment> courses = new ArrayList<CourseEnrollment>();

	public Transcript() {

	}

	public void add(String course, String grade, double credits) {
		CourseEnrollment courseenrollment = new CourseEnrollment();
		courseenrollment.setCourseCode(course);
		courseenrollment.setGrade(grade);
		courseenrollment.setCredits(credits);
		this.addCourse(courseenrollment);
	}

	public void addCourse(CourseEnrollment courseenrollment) {
		this.courses.add(courseenrollment);
	}

	public ArrayList<CourseEnrollment> getCourses() {
		return this.courses;
	}

	public double getOverallGPA() {
		double gpa = 0;
		try
		{
		for (CourseEnrollment course : courses)
		{
			gpa += course.getQualityPoints();
		}
		if (courses.size() <= 0)
			throw new ArithmeticException();
		
		gpa = gpa / courses.size();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Erorr! you must have at least one course enroled in inorder to get the overall GPA.");
		}
		catch(Exception e)
		{
			System.out.println("Erorr! "+e.toString());
		}
		finally
		{
			System.out.println("Finally block will execute");
		}
		return gpa;
	}

	public String getFormattedGPA() {
		NumberFormat number = NumberFormat.getNumberInstance();
		return number.format(this.getOverallGPA());
	}

	@Override
	public String toString() {
		String st = "";
		try
		{
			if(courses.size() ==0)
				throw new Exception();
		for (CourseEnrollment course : courses) {
			// for printing transcript
			st += course.toString();
		}
		}
		catch(Exception e)
		{
			System.out.print("There are no courses enrolled in!");
		}
		return st;
	}
}