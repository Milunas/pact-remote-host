package com.example.pactfile;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@AllArgsConstructor
public class BookController {

    private final BookLogic bookLogic;

    @GetMapping("books")
    ResponseEntity<List<Book>> getAllForType(@RequestParam(required = false) BookType type) {
        return new ResponseEntity(bookLogic.getBooks(type), HttpStatus.OK);
    }
}
