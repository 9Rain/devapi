package com.dio.devapi.controller;

import com.dio.devapi.dto.DevDTO;
import com.dio.devapi.exception.DevNotFoundException;
import com.dio.devapi.service.DevService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/devs")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DevController {

    private final DevService devService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DevDTO create(@RequestBody @Valid DevDTO devDTO) {
        return devService.create(devDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DevDTO findById(@PathVariable Long id) throws DevNotFoundException {
        return devService.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DevDTO> listAll() {
        return devService.listAll();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DevDTO update(@PathVariable Long id, @RequestBody @Valid DevDTO devDTO) throws DevNotFoundException {
        devDTO.setId(id);
        return devService.update(devDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws DevNotFoundException {
        devService.delete(id);
    }
}