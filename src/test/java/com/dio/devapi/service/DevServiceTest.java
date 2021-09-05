package com.dio.devapi.service;

import com.dio.devapi.dto.DevDTO;
import com.dio.devapi.mapper.DevMapper;
import com.dio.devapi.model.Dev;
import com.dio.devapi.repository.DevRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static com.dio.devapi.util.DevUtil.createFakeDTO;
import static com.dio.devapi.util.DevUtil.createFakeEntity;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class DevServiceTest {

    @Mock
    private DevRepository devRepository;

    @Mock
    private DevMapper devMapper;

    @InjectMocks
    private DevService devService;

    @Test
    void testGivenDevDTOThenReturnSavedDev() {
        DevDTO devDTO = createFakeDTO();
        Dev expectedSavedDev = createFakeEntity();

        when(devMapper.toModel(devDTO)).thenReturn(expectedSavedDev);
        when(devRepository.save(any(Dev.class))).thenReturn(expectedSavedDev);
    }
}