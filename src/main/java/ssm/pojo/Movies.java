package ssm.pojo;

import org.apache.solr.client.solrj.beans.Field;

public class Movies {
    @Field
    private Integer id;

    @Field("movie_title")
    private String title;

    @Field("movie_time")
    private String time;

    @Field("movie_director")
    private String director;

    @Field("movie_actor1")
    private String actor1;

    @Field("movie_actor2")
    private String actor2;

    @Field("movie_actor3")
    private String actor3;

    @Field("movie_actor4")
    private String actor4;

    @Field("movie_area")
    private String area;

    @Field("movie_box")
    private Double box;

    @Field("movie_imgAddress")
    private String imgAddress;

    @Field("movie_type")
    private String type;

    @Field("movie_score")
    private Double score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    public String getActor4() {
        return actor4;
    }

    public void setActor4(String actor4) {
        this.actor4 = actor4;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getBox() {
        return box;
    }

    public void setBox(Double box) {
        this.box = box;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor1 + '\'' + actor2 + '\'' +
                  actor3 + '\'' + actor4 + '\'' +
                ", area='" + area + '\'' +
                ", box=" + box +
                ", imgAddress='" + imgAddress + '\'' +
                ", type='" + type + '\'' +
                ", score=" + score +
                '}';
    }
}