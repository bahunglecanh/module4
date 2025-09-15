package hunglcb.example.calculate.controller;

import hunglcb.example.calculate.entity.Operation;
import hunglcb.example.calculate.repository.IOperationRepository;
import hunglcb.example.calculate.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService calculatorService;
    @Autowired
    private IOperationRepository iOperationRepository;

    @GetMapping("/")
    public String showForm(Model model){
        List<Operation> operations=iOperationRepository.findAll();
        model.addAttribute("operations",operations);
        return "index";
    }

    @PostMapping("/operation")
    public String calculate(@RequestParam("num1") double num1,
                            @RequestParam("num2") double num2,
                            @RequestParam("operation") String operation,
                            Model model){
        double result= calculatorService.calculate(num1,num2,operation);
        model.addAttribute("result",result);
        return "result";
    }
}
