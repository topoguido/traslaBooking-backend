package ar.com.traslabooking.transactional.backend.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ar.com.traslabooking.transactional.backend.entity.ActivityType;

@Repository
@Transactional
public interface ActivityTypeRepo  extends JpaRepository<ActivityType, Integer> {
}
