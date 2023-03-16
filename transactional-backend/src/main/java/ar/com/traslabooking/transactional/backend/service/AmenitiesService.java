package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.Amenities;
import ar.com.traslabooking.transactional.backend.repository.AmenitiesRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AmenitiesService {

    @Autowired
    AmenitiesRepo amenitiesRepo;

    public List<Amenities> findAll(){
        return amenitiesRepo.findAll();
    }

    public Amenities findById(Integer id){

        return amenitiesRepo.findById(id).orElseThrow(() ->
              new ResponseStatusException( HttpStatus.NOT_FOUND, "Not found")
        );
    }

    public Amenities save(Amenities amenities){
        return amenitiesRepo.save(amenities);
    }

    public void deleteById(Integer id){
        amenitiesRepo.deleteById(id);
    }
}
