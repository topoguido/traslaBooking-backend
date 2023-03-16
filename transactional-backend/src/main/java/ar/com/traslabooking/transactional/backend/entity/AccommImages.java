package ar.com.traslabooking.transactional.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name="acommImages")
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class AccommImages extends Base{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true, nullable = false)
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "idAccommodation")
    private Accommodations accommodation;


    @Column(name="imageUrl")
    private String imageUrl;

    @Column(name="principal")
    private Boolean principal;

}
