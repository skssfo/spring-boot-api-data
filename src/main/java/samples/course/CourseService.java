package samples.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sathish.santhanam on 7/4/17.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        repository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(final String courseId) {
        return repository.findOne(courseId);
    }

    public void addCourse(Course course) {
        repository.save(course);
    }

    public void updateCourse(Course course) {
        repository.save(course);
    }

    public void deleteCourse(String id) {
        repository.delete(id);
    }
}
