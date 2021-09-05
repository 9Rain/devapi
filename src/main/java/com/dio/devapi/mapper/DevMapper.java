package com.dio.devapi.mapper;

import com.dio.devapi.dto.DevDTO;
import com.dio.devapi.model.Dev;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DevMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Dev toModel(DevDTO dev);

    DevDTO toDTO(Dev dev);

    List<DevDTO> toDTOs(List<Dev> dev);
}