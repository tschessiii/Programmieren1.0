package Übungen_PR2.Collection;

public class Book {
    private String title;
    private boolean finished;
    private double stars;

    public Book(String title, boolean finished, double stars) {
        this.title = title;
        this.finished = finished;
        this.stars = stars;
    }


    public String getTitle() {
        return title;
    }

    public boolean isFinished() {
        return finished;
    }

    public double getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Title:"+title+" |Finished:"+finished+" |Stars:"+stars;
    }
}
