package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.ActorMapper;
import ssm.mapper.DirectorMapper;
import ssm.mapper.MoviesMapper;
import ssm.pojo.*;

import java.util.List;

@Service
public class AddDataToRedisService {

    @Autowired
    ActorMapper actorMapper;

    @Autowired
    DirectorMapper directorMapper;

    @Autowired
    MoviesMapper moviesMapper;

    @Autowired
    SeeRedisService seeRedisService;

    //获得演员表的所有数据
    public List<Actor> findAllActor(){
        ActorExample actorExample = new ActorExample();
        return actorMapper.selectByExample(actorExample);
    }
    //获得导演表的所有数据
    public List<Director> findAllDirector(){
        DirectorExample directorExample = new DirectorExample();
        return directorMapper.selectByExample(directorExample);
    }
    //获得电影总表的所有数据
    private List<Movies> findAllMovies(){
        MoviesExample moviesExample = new MoviesExample();
        return moviesMapper.selectByExample(moviesExample);
    }

    public void add2redis() {

        List<Actor> actors = findAllActor();
        List<Director> directors = findAllDirector();
        List<Movies> moviesList = findAllMovies();

        int actLen = actors.size();
        int dirLen = directors.size();
        int movLen = moviesList.size();

        //把Actor表添加到redis中
        for (int i = 0 ; i < actLen ; i++){
            String id = String.valueOf(actors.get(i).getActorId());
            seeRedisService.addObj("actor",id,actors.get(i));
        }

        //把Director表添加到redis中
        for (int i = 0 ; i < dirLen ; i++){
            String id = String.valueOf(directors.get(i).getDirectorId());
            seeRedisService.addObj("director",id,directors.get(i));
        }

        //把Movies表添加到redis中
        for (int i = 0 ; i < movLen ; i++){
            String id = String.valueOf(moviesList.get(i).getId());
            seeRedisService.addObj("movies",id,moviesList.get(i));
        }
    }
}
