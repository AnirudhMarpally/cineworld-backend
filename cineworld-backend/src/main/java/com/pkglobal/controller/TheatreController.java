package com.pkglobal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkglobal.entities.Theatre;
import com.pkglobal.services.TheatreService;

@CrossOrigin("*")
@RestController
@RequestMapping("/theatres")
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/add")
    public Theatre addTheatre(@RequestBody Theatre theatre) {
        return theatreService.saveTheatre(theatre);
    }

    @PutMapping("/update")
    public Theatre updateTheatre(@RequestBody Theatre theatre) {
        return theatreService.updateTheatre(theatre);
    }

    @DeleteMapping("/delete/{theatreId}")
    public void deleteTheatre(@PathVariable int theatreId) {
        theatreService.deleteTheatre(theatreId);
    }

    @GetMapping("/all")
    public List<Theatre> getAllTheatres() {
        return theatreService.getAllTheatres();
    }

    @GetMapping("/{theatreId}")
    public Optional<Theatre> getTheatreById(@PathVariable int theatreId) {
        return theatreService.getTheatreById(theatreId);
    }
    
    
}
