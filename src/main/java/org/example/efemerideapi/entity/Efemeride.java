package org.example.efemerideapi.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "data")
@Data
public class Efemeride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "text", length = 1000)
    private String text;

    public Efemeride(LocalDate date_, String text_) {
        this.date = date_;
        this.text = text_;
    }

    @Override
    public String toString() {
        return "Efemeride{" +
                "id=" + id +
                ", date=" + date +
                ", text='" + text + '\'' +
                '}';
    }
}
