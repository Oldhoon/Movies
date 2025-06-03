package dev.oldhoon.Movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository // talks to database and gets data from it
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // This interface extends MongoRepository, which provides methods for CRUD operations.
    // No additional methods are needed here unless you want to define custom queries.
    Optional<Movie> findMovieByImdbId(String imdbId);
}
