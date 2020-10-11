package br.com.fermentis.tccregisterservice.service;

import br.com.fermentis.tccregisterservice.model.dto.DeviceDTO;
import br.com.fermentis.tccregisterservice.model.entity.Device;
import br.com.fermentis.tccregisterservice.model.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Transactional(readOnly = true)
    public List<DeviceDTO> getDevices() {
        List<Device> devices = deviceRepository.findAll();
        return devices.stream().map(DeviceDTO::new).collect(toList());
    }
}
