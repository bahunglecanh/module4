package hunglcb.example.spring.controller;

import hunglcb.example.spring.entity.Blog;
import hunglcb.example.spring.entity.Category;
import hunglcb.example.spring.service.IBlogService;
import hunglcb.example.spring.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/api/blogs")
public class RestBlogController {
    @Autowired
    private IBlogService blogService;



    @GetMapping("")
    public ResponseEntity<Page<Blog>> getAll(@RequestParam(name = "page",required = false,defaultValue = "0") int page){

        Pageable pageable= PageRequest.of(page,2);
        Page<Blog> blogs=blogService.getAll(pageable);
        if (blogs.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> detail(@PathVariable(name = "id") long id){
        Blog blog=blogService.findById(id);
        if (blog==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

}
