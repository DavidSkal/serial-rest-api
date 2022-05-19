package pl.skalski.serialapp.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Serial
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int rating;
    private String review;

    public Serial() {
    }

    public Serial(Long id, String title, int rating, String review) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.review = review;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRevew() {
        return review;
    }

    public void setRevew(String revew) {
        this.review = revew;
    }
}
