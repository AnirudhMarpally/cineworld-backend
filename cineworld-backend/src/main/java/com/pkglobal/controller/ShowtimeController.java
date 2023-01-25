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

import com.pkglobal.entities.Showtime;
import com.pkglobal.services.ShowtimeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/showtimes")
public class ShowtimeController {
    @Autowired
    private ShowtimeService showtimeService;

    @PostMapping("/add")
    public Showtime addShowtime(@RequestBody Showtime showtime) {
        return showtimeService.saveShowtime(showtime);
    }

    @PutMapping("/update")
    public Showtime updateShowtime(@RequestBody Showtime showtime) {
        return showtimeService.updateShowtime(showtime);
    }

    @DeleteMapping("/delete/{showtimeId}")
    public void deleteShowtime(@PathVariable int showtimeId) {
        showtimeService.deleteShowtime(showtimeId);
    }

    @GetMapping("/all")
    public List<Showtime> getAllShowtimes() {
        return showtimeService.getAllShowtimes();
    }

    @GetMapping("/{showtimeId}")
    public Optional<Showtime> getShowtimeById(@PathVariable int showtimeId) {
        return showtimeService.getShowtimeById(showtimeId);
    }
    
    @GetMapping("/ShowsByTheatreAndMovie/{theatreId}/{movieId}")
    public List<Showtime> getShowsByTheatreAndMovie(@PathVariable int theatreId, @PathVariable int movieId){
    	return showtimeService.getShowsByTheatreAndMoviee(theatreId,movieId);
    }
    
    @GetMapping("/ShowsByMovie/{movieId}")
    public List<Showtime> getShowsByMovie(@PathVariable int movieId){
    	return showtimeService.getShowsByMovie(movieId);
    }
    
    @GetMapping("/Day/{day}")
    public List<Showtime> getShowsByDay(@PathVariable String day){
    	return showtimeService.getShowsByDay(day);
    }
    
    @GetMapping("/Time/{time}")
    public List<Showtime> getShowsByTime( @PathVariable String time){
    	return showtimeService.getShowsByTime(time);
    }
    
    
}