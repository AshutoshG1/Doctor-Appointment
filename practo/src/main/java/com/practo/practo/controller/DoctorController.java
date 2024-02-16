package com.practo.practo.controller;

import com.practo.practo.entity.Doctor;  // Assuming you have a Doctor entity
import com.practo.practo.service.DoctorService;  // Assuming you have a DoctorService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")  // Change the request mapping
public class DoctorController {

    @Autowired
    private DoctorService doctorService;  // Change the service type
    @PostMapping("/add")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
        Doctor addedDoctor = doctorService.addDoctor(doctor);
        return new ResponseEntity<>(addedDoctor, HttpStatus.CREATED);
    }
    @GetMapping("/search")
    public List<Doctor> searchDoctors(@RequestParam String search) {
        return doctorService.searchDoctorsByNameOrSpecializations(search);
    }
}
