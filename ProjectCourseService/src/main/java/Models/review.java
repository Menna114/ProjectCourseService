package Models;

public class review {
    private int reviewId;
    private String text;
    private int studentId;
    public review() {}
    public review(String text, int studentId) {
        this.text = text;
        this.studentId = studentId;
    }
    public int getReviewId() {
        return reviewId;
    }
    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
