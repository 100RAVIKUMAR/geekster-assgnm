package com.Geekster.Mappings.Service;

import com.Geekster.Mappings.Model.Book;
import com.Geekster.Mappings.Repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public void addabook(Book book) {
        bookDao.save(book);
    }

    public Book getabookbyid(Long id) {
       Optional<Book>book= bookDao.findById(id);
       return book.get();
    }

    public void updatebyid(Long id, String price) {
        Optional<Book>book=bookDao.findById(id);
        Book book1=book.get();
        book1.setPrice(price);
    }

    public void deletebyid(Long id) {
        bookDao.deleteById(id);
    }
}
