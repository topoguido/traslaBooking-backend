package ar.com.traslabooking.transactional.backend.repository;

import ar.com.traslabooking.transactional.backend.entity.AccommImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface AccommImagesRepo extends JpaRepository<AccommImages, Integer> {
}
