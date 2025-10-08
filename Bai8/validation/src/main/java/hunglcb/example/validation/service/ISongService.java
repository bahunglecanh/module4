package hunglcb.example.validation.service;

import hunglcb.example.validation.entity.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    Song save(Song song);
    Song findById(int id);
}
