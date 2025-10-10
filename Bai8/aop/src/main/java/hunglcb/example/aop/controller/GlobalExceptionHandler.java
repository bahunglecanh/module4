package hunglcb.example.aop.controller;

import hunglcb.example.aop.service.LibraryExceptions.InvalidTicketException;
import hunglcb.example.aop.service.LibraryExceptions.OutOfStockException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({OutOfStockException.class, InvalidTicketException.class, IllegalArgumentException.class})
	public String handleBusiness(RuntimeException ex, Model model) {
		model.addAttribute("message", ex.getMessage());
		return "error/business";
	}
}


