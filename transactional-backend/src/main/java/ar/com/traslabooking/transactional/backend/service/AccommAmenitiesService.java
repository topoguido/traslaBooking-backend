package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.AccommAmenities;
import ar.com.traslabooking.transactional.backend.repository.AccommAmenitiesRepo;
import ar.com.traslabooking.transactional.backend.repository.AccommImagesRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Transactional
public class AccommAmenitiesService {

    @Autowired
    AccommAmenitiesRepo accommAmenitiesRepo;

    public List<AccommAmenities> findAll(){
        return accommAmenitiesRepo.findAll();
    }

    public AccommAmenities findById(Integer id){
        return accommAmenitiesRepo.findById(id).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found")
                );
    }

    public AccommAmenities save(AccommAmenities accommAmenities){
        return accommAmenitiesRepo.save(accommAmenities);
    }

    public void deleteById(Integer id){
        accommAmenitiesRepo.deleteById(id);
    }
}
