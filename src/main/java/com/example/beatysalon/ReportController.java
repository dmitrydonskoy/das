package com.example.beatysalon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private final ClientService clientService;

    public ReportController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }
}
