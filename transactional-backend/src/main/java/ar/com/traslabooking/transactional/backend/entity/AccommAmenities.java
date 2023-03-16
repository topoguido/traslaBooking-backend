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
    
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idAmenitie")
    private Amenities amenitie;

    @ManyToOne
    @JoinColumn(name = "idAccommodation")
    private Accommodations accommodation;

    @Column(name = "quantity")
    private Integer quantity;

}
