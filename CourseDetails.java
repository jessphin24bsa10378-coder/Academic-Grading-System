
public class CourseDetails {
    private String subjectTitle;
    private double obtainedScore;
    private int credits;

    public CourseDetails(String title, double score, int cr) {
        this.subjectTitle = title;
        this.obtainedScore = score;
        this.credits = cr;
    }

    public double getScore() { return obtainedScore; }
    public String getTitle() { return subjectTitle; }
    public int getCredits() { return credits; }
    
    @Override
    public String toString() {
        return subjectTitle + " | Score: " + obtainedScore;
    }
}