//package org.fantisanti.models;
//
//import org.hibernate.annotations.Entity;
//import org.hibernate.annotations.Table;
//import org.springframework.data.annotation.Id;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//
//@Entity
//@Table(name = “events”)
//
//public class Event {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private String isbn;
//    @Column(name = "eventName")
//    private String mainTitle;
//    private String genre;
//    Public Long getd(){
//        return id;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//    Public void setId(Long id){
//        this.id = id;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setSubtitle(String subtitle) {
//        this.subtitle = subtitle;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//}