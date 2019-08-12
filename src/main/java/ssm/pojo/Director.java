package ssm.pojo;

import java.io.Serializable;

public class Director implements Serializable{
    private Integer directorId;

    private String directorName;

    private Double directorWeight;

    private Integer movieCount;

    private Double allBox;

    public Integer getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Integer directorId) {
        this.directorId = directorId;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Double getDirectorWeight() {
        return directorWeight;
    }

    public void setDirectorWeight(Double directorWeight) {
        this.directorWeight = directorWeight;
    }

    public Integer getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(Integer movieCount) {
        this.movieCount = movieCount;
    }

    public Double getAllBox() {
        return allBox;
    }

    public void setAllBox(Double allBox) {
        this.allBox = allBox;
    }

    @Override
    public String toString() {
        return "Director{" +
                "directorId=" + directorId +
                ", directorName='" + directorName + '\'' +
                ", directorWeight=" + directorWeight +
                ", movieCount=" + movieCount +
                ", allBox=" + allBox +
                '}';
    }
}