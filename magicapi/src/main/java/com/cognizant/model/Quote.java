package com.cognizant.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties
@Table(name = "quote")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String author;
    @Column(unique = true)
    private String quote;

    public Quote(Integer id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote1 = (Quote) o;
        return Objects.equals(id, quote1.id) && Objects.equals(author, quote1.author) && Objects.equals(quote, quote1.quote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
