package hunglcb.example.validation.controller;

import hunglcb.example.validation.entity.User;
import hunglcb.example.validation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping(value = "")
    public String showList(Model model){
        model.addAttribute("message", "Register successful");
        return "home";
    }

    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "register";
    }
    @PostMapping("/submit")
    public String addValidate(@Validated @ModelAttribute(name = "user") User user,
                              BindingResult bindingResult,
                              Model model){
       if (bindingResult.hasErrors()){
           return "register";
       }
       return "redirect:/users";
    }
}
