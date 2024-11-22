package com.example.reportService;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private String phone;

    // Конструкторы, геттеры и сеттеры
    public ClientDTO() {}

    public ClientDTO(Long id, String name, LocalDate birthDate, String phone) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}