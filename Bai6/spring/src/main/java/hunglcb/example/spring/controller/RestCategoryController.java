package hunglcb.example.spring.controller;

import hunglcb.example.spring.entity.Category;
import hunglcb.example.spring.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/api/categories")
public class RestCategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping()
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> categories=categoryService.findAll();
        if (categories.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> detail(@PathVariable(name = "id") int id){
        Category category=categoryService.findById(id);
        if (category==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
