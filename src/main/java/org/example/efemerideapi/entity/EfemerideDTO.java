package org.example.efemerideapi.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EfemerideDTO {
    private LocalDate date;
    private String text;

    public EfemerideDTO(LocalDate date_, String text_) {
        this.date = date_;
        this.text = text_;
    }

    @Override
    public String toString() {
        return "EfemerideDTO{" +
                "date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
