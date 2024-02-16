package com.practo.practo.controller;

import com.practo.practo.entity.Doctor;
import com.practo.practo.entity.Review;
import com.practo.practo.payload.DoctorDto;
import com.practo.practo.repository.DoctorRepository;
import com.practo.practo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private DoctorRepository doctorRepository;
   @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Review review){
        return new ResponseEntity<>(reviewService.createReview(review),HttpStatus.CREATED);
    }
@GetMapping("/{doctorId}")
    public ResponseEntity<DoctorDto> getReviewSByDoctorId(@PathVariable long doctorId){
        Doctor doctor = doctorRepository.findById(doctorId).get();
        List<Review> reviews = reviewService.getReviewByDoctorId(doctorId);
        DoctorDto dto = new DoctorDto();
        dto.setDoctor(doctor);
        dto.setReviews(reviews);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
