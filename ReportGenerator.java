import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    
    public static void generateTextFile(StudentProfile s) {
        String fileName = s.getRegNo() + "_Final_Report.txt";
        
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("=== OFFICIAL ACADEMIC TRANSCRIPT ===\n");
            writer.write("Student Name: " + s.getName() + "\n");
            writer.write("Register No: " + s.getRegNo() + "\n");
            writer.write("------------------------------------------------------------\n");
            writer.write(String.format("%-25s | %-6s | %-8s | %-5s\n", "SUBJECT", "SCORE", "GRADE", "CREDITS"));
            writer.write("------------------------------------------------------------\n");
            
            double totalWeightedPoints = 0;
            int totalCredits = 0;
            
            for(CourseDetails c : s.getEnrolledCourses()){
                String grade = GradeCalculator.computeGrade(c.getScore());
                int points = getGradePoints(c.getScore()); // Convert score to 10-point scale
                
                // WEIGHTED CALCULATION: Points * Credits
                totalWeightedPoints += (points * c.getCredits());
                totalCredits += c.getCredits();
                
                writer.write(String.format("%-25s | %-6.1f | %-8s | %-5d\n", c.getTitle(), c.getScore(), grade, c.getCredits()));
            }
            
            // Avoid division by zero
            double cgpa = (totalCredits > 0) ? (totalWeightedPoints / totalCredits) : 0.0;
            
            writer.write("------------------------------------------------------------\n");
            writer.write("TOTAL CREDITS: " + totalCredits + "\n");
            writer.write("OVERALL CGPA:  " + String.format("%.2f", cgpa) + " / 10.0\n");
            writer.write("------------------------------------------------------------\n");
            
            writer.close();
            System.out.println("\n[System]: Report generated successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving the file: " + e.getMessage());
        }
    }
    
    // Helper to get Grade Points (S=10, A=9, etc.)
    private static int getGradePoints(double marks) {
        if(marks >= 90) return 10;
        if(marks >= 80) return 9;
        if(marks >= 70) return 8;
        if(marks >= 60) return 7;
        if(marks >= 50) return 6;
        return 0; // Fail
    }
}