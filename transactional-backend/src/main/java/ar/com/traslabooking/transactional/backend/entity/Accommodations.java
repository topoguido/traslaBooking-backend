package ar.com.traslabooking.transactional.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@Table(name = "accommodations")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Accommodations extends Base{

    @Id
    @Column(name="idAccommodation", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAccommodation;

    @Column(name = "title", length = 50)
    private String title;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "geolocation", length = 50)
    private String geolocation;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "additionalText", length = 500)
    private String additionalText;

    @Column(name = "host", length = 20)
    private String host;

    @Column(name = "hostContactInfo", length = 50)
    private String hostContactInfo;

    @Column(name = "visible")
    private Boolean visible;

    @Column(name = "guestCapacity")
    private Integer guestCapacity;

    @Column(name = "price")
    private Double price;

}
