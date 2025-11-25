
public class GradeCalculator {
    
    // Responsible for giving the grade according to the marks scored
    public static String computeGrade(double marks) {
        if (marks >= 90) return "S (Outstanding)";
        else if (marks >= 80) return "A (Excellent)";
        else if (marks >= 70) return "B (Very Good)";
        else if (marks >= 60) return "C (Good)";
        else if (marks >= 50) return "D (Pass)";
        else return "F (Fail)";
    }

    // This throws  custom exception if marks are invalid
    public static void validateInput(double marks) throws InvalidGradeException {
        if (marks < 0 || marks > 100) {
            throw new InvalidGradeException("Marks cannot be negative or over 100.");
        }
    }
}
