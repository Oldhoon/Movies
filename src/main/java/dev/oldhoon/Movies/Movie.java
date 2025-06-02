package dev.oldhoon.Movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies") // documents 
@Data // takes care of getters and setters
@AllArgsConstructor // constructor that takes all args as arguments
@NoArgsConstructor // constructor with no arg 

public class Movie {
    @Id // unique identifier for each movie in db
    private ObjectId id;
    private String imdbId;
    private String title; 
    private String releaseDate;
    private String trailerLinkString;    
    private String poster;
    private String genres;
    private List<String> backdrops;

    @DocumentReference // manual reference relationship 
    private List<Review> reviewIds; 
}
