package dev.oldhoon.Movies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/movies") // endpoint will be controlled by this controller 
public class MovieController {
    @GetMapping()
    public ResponseEntity<String> allMovies() {
        return new ResponseEntity<>("All Movies", HttpStatus.OK); // for returning proper status codes (200) 
    }
    
}
