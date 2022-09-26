package com.assignment.controller;

import com.assignment.entity.News;
import com.assignment.service.NewsService;
import com.assignment.utils.ApiConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(ApiConstant.API_NEWS)
public class NewsController {
    @Autowired
    private NewsService newsService;

//    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<News> findAll(){
//        return newsService.findAll();
//    }
}
