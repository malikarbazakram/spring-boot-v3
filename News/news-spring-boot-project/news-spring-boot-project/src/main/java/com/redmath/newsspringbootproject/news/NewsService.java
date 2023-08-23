package com.redmath.newsspringbootproject.news;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    final NewsRepository newsRepository;

    public NewsService (NewsRepository newsRepository)
    {
        this.newsRepository = newsRepository;
    }

    public List<News> findAll()
    {
        return newsRepository.findAll();
    }

}
