package hunglcb.example.bai2.controller;

import hunglcb.example.bai2.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;
    @GetMapping("/")
    public String showForm() {
        return "translate"; // index.jsp
    }
    @PostMapping("/translate")
    public String translateLanguage(@RequestParam("word") String word,
                                    Model model){
        String result=iDictionaryService.findVietnamese(word);
        model.addAttribute("word",word);
        model.addAttribute("result",result);
        return  "translate";
    }
}
