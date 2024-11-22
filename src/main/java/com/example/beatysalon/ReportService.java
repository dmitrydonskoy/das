package com.example.beatysalon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ReportService {

    private final RestTemplate restTemplate;
    private final String secondServiceUrl;

    public ReportService(RestTemplate restTemplate,
                         @Value(value = "http://localhost:8081") String secondServiceUrl) {
        this.restTemplate = restTemplate;
        this.secondServiceUrl = secondServiceUrl;
    }

    public List getReportData() {
        String url = secondServiceUrl + "/report";
        return restTemplate.getForObject(url, List.class);
    }
}