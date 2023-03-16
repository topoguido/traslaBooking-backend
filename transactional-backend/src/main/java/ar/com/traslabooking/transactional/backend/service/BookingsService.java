package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.Bookings;
import ar.com.traslabooking.transactional.backend.repository.BookingsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Transactional
public class BookingsService {

    @Autowired
    BookingsRepo bookingsRepo;

    public List<Bookings> findAll(){
        return  bookingsRepo.findAll();
    }

    public Bookings findById(Integer id){
        return bookingsRepo.findById(id).orElseThrow( () ->
                new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found")
        );
    }

    public Bookings save(Bookings booking){
        return bookingsRepo.save(booking);
    }

    public void deleteById(Integer id){
        bookingsRepo.deleteById(id);
    }
}
