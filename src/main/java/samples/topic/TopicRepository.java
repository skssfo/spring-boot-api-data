package samples.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by sathish.santhanam on 7/9/17.
 */
public interface TopicRepository extends CrudRepository<Topic, String> {
}
