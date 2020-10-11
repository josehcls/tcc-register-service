package br.com.fermentis.tccregisterservice.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(schema = "system", name = "user_devices")
public class UserDevice {
    @Id
    @Column(name = "user_device_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userDeviceId;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Device device;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;
}
