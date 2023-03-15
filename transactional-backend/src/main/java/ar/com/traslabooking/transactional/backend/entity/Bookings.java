package ar.com.traslabooking.transactional.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Bookings extends Base {

    @Id
    @Column(name = "idBooking", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBooking;

    @ManyToOne
    @JoinColumn(name = "idAccommodation")
    private Accommodations accommodation;

    @Column(name = "guestName", length = 50)
    private String guestName;

    @Column(name = "guestLastName", length = 50)
    private String guestLastName;

    @Column(name = "guestEmail", length = 50)
    private String email;

    @Column(name = "guestPhone", length = 50)
    private String guestPhone;

    @Column(name = "bookingFrom")
    private Date bookingFrom;

    @Column(name = "bookingTo")
    private Date bookingTo;

    @Column(name = "guestQuantity")
    private Integer guestQuantity;

    @Column(name = "confirmed")
    private Boolean confirmed;

    @Column(name = "comments", length = 100)
    private String comments;

}
