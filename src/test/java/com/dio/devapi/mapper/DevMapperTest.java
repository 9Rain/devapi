package com.dio.devapi.mapper;

import com.dio.devapi.dto.DevDTO;
import com.dio.devapi.dto.PhoneDTO;
import com.dio.devapi.model.Dev;
import com.dio.devapi.model.Phone;
import com.dio.devapi.util.DevUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DevMapperTest {

    @Autowired
    private DevMapper devMapper;

    @Test
    void testGivenDevDTOThenReturnDevEntity() {
        DevDTO devDTO = DevUtil.createFakeDTO();
        Dev dev = devMapper.toModel(devDTO);

        assertEquals(devDTO.getFirstName(), dev.getFirstName());
        assertEquals(devDTO.getLastName(), dev.getLastName());
        assertEquals(devDTO.getCpf(), dev.getCpf());
        assertEquals(devDTO.getEmail(), dev.getEmail());
        assertEquals(devDTO.getLinkedin(), dev.getLinkedin());
        assertEquals(devDTO.getGithub(), dev.getGithub());

        Phone phone = dev.getPhones().get(0);
        PhoneDTO phoneDTO = devDTO.getPhones().get(0);

        assertEquals(phoneDTO.getType(), phone.getType());
        assertEquals(phoneDTO.getNumber(), phone.getNumber());
    }

    @Test
    void testGivenDevEntityThenReturnDevDTO() {
        Dev dev = DevUtil.createFakeEntity();
        DevDTO devDTO = devMapper.toDTO(dev);

        assertEquals(dev.getFirstName(), devDTO.getFirstName());
        assertEquals(dev.getLastName(), devDTO.getLastName());
        assertEquals(dev.getCpf(), devDTO.getCpf());
        assertEquals(dev.getEmail(), devDTO.getEmail());
        assertEquals(dev.getLinkedin(), devDTO.getLinkedin());
        assertEquals(dev.getGithub(), devDTO.getGithub());

        Phone phone = dev.getPhones().get(0);
        PhoneDTO phoneDTO = devDTO.getPhones().get(0);

        assertEquals(phone.getType(), phoneDTO.getType());
        assertEquals(phone.getNumber(), phoneDTO.getNumber());
    }
}