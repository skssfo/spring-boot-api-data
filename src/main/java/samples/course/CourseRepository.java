package samples.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by sathish.santhanam on 7/9/17.
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String topicId);


}
