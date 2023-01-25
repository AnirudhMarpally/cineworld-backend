package com.pkglobal.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkglobal.entities.Showtime;
import com.pkglobal.repository.ShowtimeRepository;

@Service
public class ShowtimeService {

    @Autowired
    private ShowtimeRepository showtimeRepository;

    public Showtime saveShowtime(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    public Showtime updateShowtime(Showtime showtime) {
        return showtimeRepository.save(showtime);
    }

    public void deleteShowtime(int showtimeId) {
        showtimeRepository.deleteById(showtimeId);
    }

    public List<Showtime> getAllShowtimes() {
        return showtimeRepository.findAll();
    }

    public Optional<Showtime> getShowtimeById(int showtimeId) {
        return showtimeRepository.findById(showtimeId);
    }

	public List<Showtime> getShowsByTheatreAndMoviee(int theatreId, int movieId) {
		// TODO Auto-generated method stub
		return showtimeRepository.getShowsByTheatreAndMovie(theatreId,movieId);
	}

	public List<Showtime> getShowsByMovie(int movieId) {
		// TODO Auto-generated method stub
		return showtimeRepository.getShowsByMovie(movieId);
	}

	public List<Showtime> getShowsByDay(String day) {
		// TODO Auto-generated method stub
		return showtimeRepository.getShowsByDay(day);
	}

	public List<Showtime> getShowsByTime(String time) {
		// TODO Auto-generated method stub
		return showtimeRepository.getShowsByTime(time);
	}
}