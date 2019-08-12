package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.MovieMapper;
import ssm.pojo.Movie;
import ssm.pojo.MovieExample;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieMapper movieMapper;

    public List<Movie> findByArea(String area) {

        MovieExample example = new MovieExample();
        MovieExample.Criteria criteria = example.createCriteria();
        criteria.andMovieAreaEqualTo(area);

        List<Movie> list = movieMapper.selectByExample(example);
        return list;
    }
}
