package ar.com.traslabooking.transactional.backend.repository;

import ar.com.traslabooking.transactional.backend.entity.Accommodations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface AccommodationsRepo extends JpaRepository<Accommodations, Integer> {
}
