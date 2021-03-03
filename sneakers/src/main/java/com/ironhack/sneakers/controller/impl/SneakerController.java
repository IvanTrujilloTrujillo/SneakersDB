package com.ironhack.sneakers.controller.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.sneakers.controller.dtos.SneakerDTO;
import com.ironhack.sneakers.model.Sneaker;
import com.ironhack.sneakers.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class SneakerController {

    @Autowired
    private SneakerRepository sneakerRepository;

    @GetMapping("/sneakers")
    @ResponseStatus(HttpStatus.OK)
    public List<Sneaker> getSneakers() {
        return sneakerRepository.findAll();
    }

    @PostMapping("/sneaker")
    @ResponseStatus(HttpStatus.CREATED)
    public Sneaker newSneaker(@RequestBody String sneakerJSON) {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(sneakerJSON);
        SneakerDTO sneakerDTO = null;
        try {
            sneakerDTO = objectMapper.readValue(sneakerJSON, SneakerDTO.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(sneakerDTO.toString());
        System.out.println(sneakerDTO.getCreationDate().substring(0, 10));
        Sneaker sneaker = new Sneaker();
        sneaker.setName(sneakerDTO.getName());
        sneaker.setAuthor(sneakerDTO.getAuthor());
        sneaker.setArtistCollaborator(sneakerDTO.getArtistCollaborator());
        sneaker.setPrice(Double.valueOf(sneakerDTO.getPrice()));
        sneaker.setSpecialEdition(sneakerDTO.getSpecialEdition());
        sneaker.setCreationDate(Date.valueOf(sneakerDTO.getCreationDate().substring(0, 10)));

        return sneakerRepository.save(sneaker);
    }
}
