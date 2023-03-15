package ar.com.traslabooking.transactional.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@Table(name = "accommAmenities")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class AccommAmenities extends Base{

    @ManyToOne
    @JoinColumn(name = "id")
    private Amenities amenities;

    @ManyToOne
    @JoinColumn(name = "idAccommodation")
    private Accommodations accommodation;

    @Column(name = "quantity")
    private Integer quantity;

}
