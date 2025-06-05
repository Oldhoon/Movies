package dev.oldhoon.Movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import jakarta.annotation.Nonnull;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate; //another way to update records in MongoDB

    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewId").value(review))
                .first(); // update the first matching movie document
        
        return review;
    }

    public void deleteReview(ObjectId reviewId) {
        if (!reviewRepository.existsById(reviewId)) {
            throw new ReviewNotFoundException("Review with ID " + reviewId + " not found");
        }
        reviewRepository.deleteById(reviewId);

    }

    public Review updateReview(String reviewId, String updatedBody) {
        Review review = reviewRepository.findById(new ObjectId(reviewId)).orElseThrow(()->new ReviewNotFoundException("not found"));
        review.setBody(updatedBody);
        return reviewRepository.save(review);
    }

    @Nonnull
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
