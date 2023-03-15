package ar.com.traslabooking.transactional.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "amenities")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper=false)
public class Amenities extends Base{

    @Column(name="id", nullable= false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", length = 50)
    private String name;

    @Column(name="description", length = 100)
    private String description;
}
