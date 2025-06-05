package dev.oldhoon.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    // This interface extends MongoRepository, which provides methods for CRUD operations.
    // No additional methods are needed here unless you want to define custom queries.
    // You can add custom query methods if needed, for example:
    // List<Review> findByMovieId(ObjectId movieId);
    
}
