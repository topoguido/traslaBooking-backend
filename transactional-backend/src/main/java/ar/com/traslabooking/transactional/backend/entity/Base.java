package ar.com.traslabooking.transactional.backend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Base implements Serializable {

    @Column(name = "ip")
    private String ip;

    @Column(name = "user", length = 30)
    private String user;

    @Column(name = "dateTime")
    @JsonFormat(pattern = "yyy-MM-dd HH:mm:ss", timezone = "GMT-3")
    private Date dateTime;

}
