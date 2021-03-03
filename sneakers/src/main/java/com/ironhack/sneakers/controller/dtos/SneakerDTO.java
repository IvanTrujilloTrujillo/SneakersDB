package com.ironhack.sneakers.controller.dtos;

public class SneakerDTO {
    private Integer id;
    private String name;
    private String price;
    private boolean specialEdition;
    private String author;
    private String creationDate;
    private String artistCollaborator;

    public SneakerDTO() {
    }

    public SneakerDTO(Integer id, String name, String price, boolean specialEdition, String author, String creationDate, String artistCollaborator) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.specialEdition = specialEdition;
        this.author = author;
        this.creationDate = creationDate;
        this.artistCollaborator = artistCollaborator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean getSpecialEdition() {
        return specialEdition;
    }

    public void setSpecialEdition(boolean specialEdition) {
        this.specialEdition = specialEdition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getArtistCollaborator() {
        return artistCollaborator;
    }

    public void setArtistCollaborator(String artistCollaborator) {
        this.artistCollaborator = artistCollaborator;
    }

    @Override
    public String toString() {
        return "SneakerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", specialEdition=" + specialEdition +
                ", author='" + author + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", artistCollaborator='" + artistCollaborator + '\'' +
                '}';
    }
}
