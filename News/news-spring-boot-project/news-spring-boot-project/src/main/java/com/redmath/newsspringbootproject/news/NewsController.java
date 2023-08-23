package com.redmath.newsspringbootproject.news;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService)
    {
        this.newsService = newsService;
    }

    @GetMapping
    public ResponseEntity<List<News>> getAll()
    {
        return  ResponseEntity.ok(newsService.findAll());
    }

}
