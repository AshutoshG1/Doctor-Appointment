package com.practo.practo.service;

import com.practo.practo.entity.Booking;
import com.practo.practo.payload.BookingDto;
import com.practo.practo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepo;

    public void bookAnAppiontment(BookingDto dto){
        List<String> availableTimeSlots = new ArrayList<>();
        availableTimeSlots.add("10:15 AM");
        availableTimeSlots.add("11:15 AM");
        availableTimeSlots.add("12:15 PM");

        Booking booking = new Booking();

        for(String slots:availableTimeSlots){
          if(slots.equals(dto.getBookingTime())){
              booking.setBookingTime(dto.getBookingTime());
              availableTimeSlots.remove(slots);
          }
        }

        ScheduledExecutorService executor = Executors.newScheduledThreadPool("")


        booking.setDoctorId(dto.getDoctorId());
        booking.setPatientId(dto.getPatientId());

        bookingRepo.save(booking);

        if (booking.getBookingTime()!=null){
            bookingRepo.save(booking);
        }else {
            System.out.println("Ttme Slot Not Available");
        }
    }
}
