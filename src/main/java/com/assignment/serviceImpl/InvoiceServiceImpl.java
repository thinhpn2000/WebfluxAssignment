package com.assignment.serviceImpl;

import com.assignment.entity.Invoice;
import com.assignment.repository.InvoiceRepository;
import com.assignment.service.InvoiceService;
import com.assignment.utils.ExternalApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.blockhound.BlockHound;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private WebClient webClient;

    @Override
    public Flux<Invoice> findAll() throws InterruptedException {
        Flux<Invoice> invoice = webClient.get()
                .uri(ExternalApi.URI_GET_ALL_INVOICE)
                .retrieve()
                .bodyToFlux(Invoice.class)
                .timeout(Duration.ofMillis(10_000));
        return invoice;
    }

//    @Override
//    public Flux<String> find() {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8081/invoice/";
//        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
//        String result = response.getBody().toString();
//        return Flux.just(result);
//
//    }
}
