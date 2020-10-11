package br.com.fermentis.tccregisterservice.model.repository;

import br.com.fermentis.tccregisterservice.model.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
