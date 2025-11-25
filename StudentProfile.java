import java.util.ArrayList;
import java.util.List;

public class StudentProfile {
    // for creating a student profile
    private String fullName;
    private String regNumber;
    private List<CourseDetails> courseList = new ArrayList<>();

    public StudentProfile(String name, String reg) {
        this.fullName = name;
        this.regNumber = reg;
    }

    public void enrollCourse(CourseDetails c) {
        courseList.add(c);
    }

    public List<CourseDetails> getEnrolledCourses() {
        return courseList;
    }

    public String getName() { return fullName; }
    public String getRegNo() { return regNumber; }
}