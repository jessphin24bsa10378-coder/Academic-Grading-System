import java.util.Scanner;

public class GradingManager {
    
    public void startSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- University Grading Automation ---");
        
        System.out.print("Enter Student Full Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Registration Number: ");
        String reg = scanner.nextLine();
        
        StudentProfile student = new StudentProfile(name, reg);
        
        while(true) {
            System.out.print("\nEnter Subject Name (Type 'exit' to finish): ");
            String sub = scanner.nextLine();
            
            if(sub.equalsIgnoreCase("exit")) break;
            
            try {
                System.out.print("Enter Marks Obtained: ");
                double m = Double.parseDouble(scanner.nextLine());
                
                // Using our custom exception to validate
                GradeCalculator.validateInput(m); 
                
                System.out.print("Enter Credits: ");
                int c = Integer.parseInt(scanner.nextLine());
                
                student.enrollCourse(new CourseDetails(sub, m, c));
                System.out.println(">> Entry Saved.");
                
            } catch (InvalidGradeException e) {
                System.out.println("Validation Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Input Error: Please enter valid numbers.");
            }
        }
        
        // Save the file at the end
        ReportGenerator.generateTextFile(student);
    }
}