package studentdatabaseapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Courses {
    private Set<String> courses = new HashSet<>();

    public Set<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }


}
