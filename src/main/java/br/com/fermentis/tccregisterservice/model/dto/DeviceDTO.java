package br.com.fermentis.tccregisterservice.model.dto;

import br.com.fermentis.tccregisterservice.model.entity.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
public class DeviceDTO {
    @JsonProperty("device_id")
    private Long deviceId;

    @JsonProperty("model")
    private String model;

    @JsonProperty("version")
    private String version;

    @JsonProperty("registered_at")
    private Date createdAt;

    public DeviceDTO (Device device) {
        this.deviceId = device.getDeviceId();
        this.model = device.getModel();
        this.version = device.getVersion();
        this.createdAt = device.getCreatedAt();
    }
}
