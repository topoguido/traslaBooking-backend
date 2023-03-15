package ar.com.traslabooking.transactional.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Table(name = "bookingActivity")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class BookingActivity extends Base{

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "activityType")
    private ActivityType activityType;

    @ManyToOne
    @JoinColumn(name = "idBooking")
    private Bookings booking;


}
