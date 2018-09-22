package com.example.springdatajpa.controller;

import com.example.springdatajpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/book")
public class BookController {
    private static final String BOOK_DETAIL_PATH_NAME = "bookDetail";
    private static final String BOOK_LIST_PATH_NAME = "bookList";

    @Resource
    BookService bookService;

    @GetMapping("/all")
    public String getBookList(ModelMap map) {
        map.addAttribute("bookList", bookService.getAll());
        return BOOK_LIST_PATH_NAME;
    }

    @GetMapping(value = "/{id}")
    public String getBook(@PathVariable Integer id, ModelMap map) {
        map.addAttribute("book", bookService.get(id));
        return BOOK_DETAIL_PATH_NAME;
    }

}
