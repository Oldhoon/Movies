# Movie Reviews API

A basic full stack web application built with Spring Boot, MongoDB, and Thymeleaf. It demonstrates a complete flow from database to server-rendered HTML views. Users can view and submit movie reviews, with data persisted in a MongoDB database.

## Features

- Create, read, update, and delete movies
- Add and fetch reviews for each movie
- Server-rendered HTML reviews page with submission form (Thymeleaf)
- REST API endpoints for interacting with movie and review data
- Basic error handling and validation

## Tech Stack

| Layer           | Technology               |
|----------------|--------------------------|
| Backend        | Java, Spring Boot        |
| Frontend       | Thymeleaf (server-side)  |
| Database       | MongoDB                  |
| Build Tool     | Maven                    |

## Project Structure

- `Movie.java`, `Review.java`: Data models
- `MovieController.java`, `ReviewController.java`: API endpoints
- `MovieService.java`, `ReviewService.java`: Business logic
- `MovieRepository.java`, `ReviewRepository.java`: Data access
- `reviews.html`: Thymeleaf template for reviews UI
- `MoviesApplication.java`: Spring Boot entry point

API Endpoints 
PUT /api/v1/reviews/{id} – Update a review

DELETE /api/v1/reviews/{id} – Delete a review

GET /api/v1/reviews/{id} - get a review

POST /api/v1/reviews/reviews – Submit a new review (via form)
