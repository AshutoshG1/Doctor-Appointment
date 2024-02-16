package com.practo.practo.service;

import com.practo.practo.entity.Patient;
import com.practo.practo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient createPatient(Patient patient){
        Patient savePatient = patientRepository.save(patient);
        return patient;
    }
}
