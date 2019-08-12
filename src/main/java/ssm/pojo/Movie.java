package ssm.pojo;

public class Movie {
    private Integer movieId;

    private String movieName;

    private String type;

    private Double box;

    private Double movieScore;

    private String movieDirector;

    private String movieActor;

    private String movieArea;

    private String movieTime;

    private String img;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBox() {
        return box;
    }

    public void setBox(Double box) {
        this.box = box;
    }

    public Double getMovieScore() {
        return movieScore;
    }

    public void setMovieScore(Double movieScore) {
        this.movieScore = movieScore;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieActor() {
        return movieActor;
    }

    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }

    public String getMovieArea() {
        return movieArea;
    }

    public void setMovieArea(String movieArea) {
        this.movieArea = movieArea;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", type='" + type + '\'' +
                ", box=" + box +
                ", movieScore=" + movieScore +
                ", movieDirector='" + movieDirector + '\'' +
                ", movieActor='" + movieActor + '\'' +
                ", movieArea='" + movieArea + '\'' +
                ", movieTime='" + movieTime + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}