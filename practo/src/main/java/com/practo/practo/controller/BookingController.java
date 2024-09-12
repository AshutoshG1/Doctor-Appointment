package com.practo.practo.controller;

import com.practo.practo.payload.BookingDto;
import com.practo.practo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    public ResponseEntity<String> bookAnAppointment(BookingDto bookingDto){
        return null;

    }
}
