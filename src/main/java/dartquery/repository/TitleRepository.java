package dartquery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import dartquery.repository.dto.Title;

public interface TitleRepository extends MongoRepository<Title, String>{

}
