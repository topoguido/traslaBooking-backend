package ar.com.traslabooking.transactional.backend.service;

import ar.com.traslabooking.transactional.backend.entity.ActivityType;
import ar.com.traslabooking.transactional.backend.repository.ActivityTypeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ActivityTypeService {

    @Autowired
    ActivityTypeRepo activityTypeRepo;

    public List<ActivityType> findAll(){
        return activityTypeRepo.findAll();
    }

    public ActivityType findById(Integer id){

        return activityTypeRepo.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found")
        );
    }

    public ActivityType save(ActivityType activityType){
        return activityTypeRepo.save(activityType);
    }

    public void deleteById(Integer id){
        activityTypeRepo.deleteById(id);
    }

}
