package com.assignment.serviceImpl;

import com.assignment.entity.News;
import com.assignment.service.NewsService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.SynchronousSink;

import java.time.Duration;

@Service
public class NewsServiceImpl implements NewsService {

//    @Override
//    public Flux<News> findAll() {
//        return Flux.generate((SynchronousSink<News> sink) ->
//                        sink.next(new News(RandomStringUtils.randomAlphanumeric(15), RandomStringUtils.randomAlphanumeric(39))))
//                .delayElements(Duration.ofSeconds(1L)).take(10);
//    }
}
