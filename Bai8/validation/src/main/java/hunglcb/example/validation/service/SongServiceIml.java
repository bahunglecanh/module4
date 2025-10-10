package hunglcb.example.validation.service;

import hunglcb.example.validation.dto.SongDTO;
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
    public Song save(SongDTO songDTO) {
        Song entity=new Song();
        entity.setId(songDTO.getId());
        entity.setNameSong(songDTO.getNameSong());
        entity.setArtist(songDTO.getArtist());
        entity.setGenre(songDTO.getGenre());
        return songRepository.save(entity);
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id).orElse(null);
    }
}
