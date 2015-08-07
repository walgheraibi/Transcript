//import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the transcript application");
		System.out.println();
		// variables decelerations
		Scanner keyboard = new Scanner(System.in);
		String choice = "y";
		Transcript transcript = new Transcript();
		while (choice.equalsIgnoreCase("y")) {
			String course = Validator.getString(keyboard, "Enter course: ");
			String grade = Validator.getString(keyboard, "Enter grade: ");
			double credits = Validator.getDouble(keyboard, "Enter credits: ",
					1, 20);
			transcript.add(course, grade, credits);
			choice = Validator.getString(keyboard, "Another course? (y/n) ");
			System.out.println();
		}
		print(transcript);
	}
	public static void print(Transcript transcript)
	{
		try
		{
			if(transcript.equals(null))
				throw new NullPointerException();
		// printing
		System.out.println("Course Credits Grade Quality Points");
		System.out.println("----- ------- ----- --------------");
		System.out.println(transcript.toString());
		System.out.println(" GPA : " + transcript.getFormattedGPA());
		}
		catch(NullPointerException e)
		{
			System.out.println("You have to print an existing transcript");
		}

	}

}