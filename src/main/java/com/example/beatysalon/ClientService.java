package com.example.beatysalon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientDTO> getAllClients() {
        return clientRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public ClientDTO getClientById(Long id) {
        return clientRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = new Client(null, clientDTO.getName(), clientDTO.getBirthDate(), clientDTO.getPhone());
        Client savedClient = clientRepository.save(client);
        return convertToDTO(savedClient);
    }

    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        return clientRepository.findById(id).map(client -> {
            client.setName(clientDTO.getName());
            client.setBirthDate(clientDTO.getBirthDate());
            client.setPhone(clientDTO.getPhone());
            return convertToDTO(clientRepository.save(client));
        }).orElse(null);
    }

    public boolean deleteClient(Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private ClientDTO convertToDTO(Client client) {
        return new ClientDTO(client.getId(), client.getName(), client.getBirthDate(), client.getPhone());
    }
}