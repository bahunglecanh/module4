package hunglcb.example.validation.controller;

import hunglcb.example.validation.dto.SongDTO;
import hunglcb.example.validation.entity.Song;
import hunglcb.example.validation.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @Autowired
    ISongService songService;

    @GetMapping("")
    public String showList(Model model){
        List<Song> songs=songService.findAll();
        model.addAttribute("songs",songs);
        return "song/list";
    }

    @GetMapping("/add")
    public String addSong(Model model){
        model.addAttribute("song", new SongDTO());
        return "song/createSong";
    }
    @PostMapping("/add")
    public String create(@Validated @ModelAttribute(name = "song") SongDTO songDTO,
                         BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "song/createSong";
        }
        songService.save(songDTO);
        return "redirect:/songs";
    }

    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable int id,Model model){
        Song song = songService.findById(id);
        if (song != null){
            SongDTO dto = new SongDTO(song.getId(), song.getNameSong(), song.getArtist(), song.getGenre());
            model.addAttribute("song", dto);
            return "song/edit";
        }
        return "redirect:/songs";
    }
    @PostMapping("/edit")
    public String updateSong(@Validated @ModelAttribute(name = "song") SongDTO songDTO,
                             BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "song/edit";
        }
        songService.save(songDTO);
        return "redirect:/songs";
    }
}
