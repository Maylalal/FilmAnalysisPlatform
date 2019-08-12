package ssm.pojo;

public class Actor {
    private Integer actorId;

    private String actorName;

    private Double actorWeight;

    private Integer movieCount;

    private String actorMovieRank;

    private Double allBox;

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public Double getActorWeight() {
        return actorWeight;
    }

    public void setActorWeight(Double actorWeight) {
        this.actorWeight = actorWeight;
    }

    public Integer getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(Integer movieCount) {
        this.movieCount = movieCount;
    }

    public String getActorMovieRank() {
        return actorMovieRank;
    }

    public void setActorMovieRank(String actorMovieRank) {
        this.actorMovieRank = actorMovieRank;
    }

    public Double getAllBox() {
        return allBox;
    }

    public void setAllBox(Double allBox) {
        this.allBox = allBox;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", actorName='" + actorName + '\'' +
                ", actorWeight=" + actorWeight +
                ", movieCount=" + movieCount +
                ", actorMovieRank='" + actorMovieRank + '\'' +
                ", allBox=" + allBox +
                '}';
    }
}