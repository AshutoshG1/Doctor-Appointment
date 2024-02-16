package com.practo.practo.service;
import com.practo.practo.entity.Doctor;
import com.practo.practo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor addDoctor(Doctor doctor) {
        // Add any additional business logic or validation here before saving
        return doctorRepository.save(doctor);
    }

    public List<Doctor> searchDoctorsByNameOrSpecializations(String search) {
        return doctorRepository.searchByNameOrSpecializations(search);
    }
}
