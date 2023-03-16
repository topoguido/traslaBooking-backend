package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.BookingActivity;
import ar.com.traslabooking.transactional.backend.repository.BookingActivityRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Transactional
public class BookingActivityService {

    @Autowired
    BookingActivityRepo bookingActivityRepo;

    public List<BookingActivity> findAll(){
        return bookingActivityRepo.findAll();
    }

    public BookingActivity findById(Integer id){
        return bookingActivityRepo.findById(id).orElseThrow( ()->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found")
                );
    }

    public BookingActivity save(BookingActivity bookingActivity){
        return bookingActivityRepo.save(bookingActivity);
    }

    public void deleteById(Integer id){
        bookingActivityRepo.deleteById(id);
    }
}
