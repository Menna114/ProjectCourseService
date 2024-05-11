import Models.course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface courseRepo extends MongoRepository<course, String> {
}
