package com.dio.devapi.service;

import com.dio.devapi.dto.DevDTO;
import com.dio.devapi.exception.DevNotFoundException;
import com.dio.devapi.mapper.DevMapper;
import com.dio.devapi.repository.DevRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DevService {

    private final DevRepository devRepository;

    private final DevMapper devMapper;

    public DevDTO create(DevDTO devDTO) {
        return devMapper.toDTO(
            devRepository.save(
                devMapper.toModel(devDTO)
            )
        );
    }

    public DevDTO findById(Long id) throws DevNotFoundException {
        return devRepository.findById(id)
            .map(devMapper::toDTO)
            .orElseThrow(() -> new DevNotFoundException(id));
    }

    public List<DevDTO> listAll() {
        return devMapper.toDTOs(
            devRepository.findAll()
        );
    }

    public DevDTO update(DevDTO devDTO) throws DevNotFoundException {
        verifyIfExists(devDTO.getId());

        return devMapper.toDTO(
            devRepository.save(
                devMapper.toModel(devDTO)
            )
        );
    }

    public void delete(Long id) throws DevNotFoundException {
        verifyIfExists(id);
        devRepository.deleteById(id);
    }

    private boolean verifyIfExists(Long id) throws DevNotFoundException {
        var dev =  devRepository.findById(id)
            .orElseThrow(() -> new DevNotFoundException(id));

        return true;
    }
}