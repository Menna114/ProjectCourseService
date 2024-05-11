package Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document("course")
public class course {
    @Id
    private String id;
    private String title;
    private String Duration;
    private int capacity;
    private int numOfStudents;
    private int instructorId;
    private rating rate;
    private ArrayList<review>reviews;
    public course() {}
    public course(String title, String duration, int capacity, int numOfStudents, int instructorId, rating rate, ArrayList<review> reviews) {
        this.title = title;
        Duration = duration;
        this.capacity = capacity;
        this.numOfStudents = numOfStudents;
        this.instructorId = instructorId;
        this.rate = rate;
        this.reviews=new ArrayList<>(reviews);
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDuration() {
        return Duration;
    }
    public void setDuration(String duration) {
        Duration = duration;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getNumOfStudents() {
        return numOfStudents;
    }
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    public int getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
    public rating getRate() {
        return rate;
    }
    public void setRate(rating rate) {
        this.rate = rate;
    }
    public ArrayList<review> getReviews() {
        return reviews;
    }
    public void setReviews(ArrayList<review> reviews) {
        this.reviews = reviews;
    }

}
