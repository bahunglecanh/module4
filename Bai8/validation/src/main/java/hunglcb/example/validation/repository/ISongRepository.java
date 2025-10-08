package hunglcb.example.validation.repository;

import hunglcb.example.validation.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {
}
