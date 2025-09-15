package hunglcb.example.sandwich.controller;

import hunglcb.example.sandwich.entity.Condiment;
import hunglcb.example.sandwich.service.ICondimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    @Autowired
    private ICondimentService condimentService;
    @GetMapping("/")
    public String showForm(Model model) {
        List<Condiment> condiments = condimentService.getAll();
        model.addAttribute("condiments",condiments);
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) int[] condimentIds, Model model) {
        List<Condiment> selected = new ArrayList<>();
        if (condimentIds != null) {
            for (int id : condimentIds) {
                Condiment c = condimentService.getById(id);
                if (c != null) {
                    selected.add(c);
                }
            }
        }
        model.addAttribute("selectedCondiments", selected);
        return "result";
    }
}
