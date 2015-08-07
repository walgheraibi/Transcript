public class CourseEnrollment {
	String courseCode, grade;
	double credits, qualityPoints;

	public double getQualityPoints() {
		return qualityPoints;
	}

	public void setQualityPoints(String courseCode) {
		switch (courseCode.toUpperCase()) {
		case "A":
			this.qualityPoints = 4.0;
			break;
		case "B":
			this.qualityPoints = 3.0;
			break;
		case "C":
			this.qualityPoints = 2.0;
			break;
		case "D":
			this.qualityPoints = 1.0;
			break;
		default:
			this.qualityPoints = 0.0;
			break;
		}

	}

	public CourseEnrollment() {

	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade.toUpperCase();
		this.setQualityPoints(grade);
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {

		return "" + this.courseCode + " " + this.credits + " "
				+ this.getGrade() + " " + this.getQualityPoints() + "\n";
	}
}