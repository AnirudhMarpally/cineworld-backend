package com.pkglobal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkglobal.entities.Theatre;
import com.pkglobal.repository.TheatreRepository;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    public Theatre saveTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public Theatre updateTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public void deleteTheatre(int theatreId) {
        theatreRepository.deleteById(theatreId);
    }

    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }

    public Optional<Theatre> getTheatreById(int theatreId) {
        return theatreRepository.findById(theatreId);
    }

	
}
