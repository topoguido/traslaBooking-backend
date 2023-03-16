package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.AccommImages;
import ar.com.traslabooking.transactional.backend.repository.AccommImagesRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class AccommImagesService {

    @Autowired
    AccommImagesRepo accommImagesRepo;

    public List<AccommImages> findAll(){
        return accommImagesRepo.findAll();
    }

    public AccommImages findById(Integer id){
        return accommImagesRepo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found")
        );
    }

    public AccommImages save(AccommImages accommImages){
        return accommImagesRepo.save(accommImages);
    }

    public void deleteById(Integer id){
        accommImagesRepo.deleteById(id);
    }
}
