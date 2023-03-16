package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.Accommodations;
import ar.com.traslabooking.transactional.backend.repository.AccommodationsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@Transactional
public class AccommodationsService {

    @Autowired
    AccommodationsRepo accommodationsRepo;

    public List<Accommodations> findAll(){
        return accommodationsRepo.findAll();
    }

    public Accommodations findById(Integer id){
        return accommodationsRepo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found")
                );
    }

    public Accommodations save(Accommodations accommodations){
        return accommodationsRepo.save(accommodations);
    }

    public void deleteById(Integer id){
        accommodationsRepo.deleteById(id);
    }
}
