package com.Geekster.Mappings.Controller;

import com.Geekster.Mappings.Model.Book;
import com.Geekster.Mappings.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public void addabook(@RequestBody Book book){
        bookService.addabook(book);
    }
    @GetMapping("/fetch/{id}")
    public Book getbookbyid(@PathVariable Long id){
        return bookService.getabookbyid(id);
    }
    @PutMapping("/update/{id}/{price}")
    public void updatebyid(@PathVariable Long id,@PathVariable String price){
        bookService.updatebyid(id,price);
    }
    @DeleteMapping("/delete/{id}")
    public void deletebyid(@PathVariable Long id){
        bookService.deletebyid(id);
    }
}
