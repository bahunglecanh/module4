package hunglcb.example.validation.service;

import hunglcb.example.validation.entity.Song;
import hunglcb.example.validation.entity.User;
import hunglcb.example.validation.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongServiceIml implements ISongService{

    @Autowired
    ISongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song save(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id).orElse(null);
    }
}
