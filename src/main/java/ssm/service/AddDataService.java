package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.ActorMapper;
import ssm.mapper.DirectorMapper;
import ssm.mapper.MovieMapper;
import ssm.mapper.MoviesMapper;
import ssm.pojo.*;

import java.util.*;

@Service
public class AddDataService {

    @Autowired
    MovieMapper movieMapper;

    @Autowired
    MoviesMapper moviesMapper;

    @Autowired
    ActorMapper actorMapper;

    @Autowired
    DirectorMapper directorMapper;

    public void update() {
        MoviesExample moviesExample = new MoviesExample();
        List<Movies> list = moviesMapper.selectByExample(moviesExample);
        List<Movie> movies = new ArrayList<>();
        int len = list.size();

        //============movie===================
        /*for (int i = 0; i < list.size(); i++) {
            Movie movieDTO = new Movie();
            int id = list.get(i).getId();
            movieDTO.setMovieId(id);
            movieDTO.setMovieName(list.get(i).getTitle());
            movieDTO.setType(list.get(i).getType());
            movieDTO.setBox(list.get(i).getBox());
            movieDTO.setMovieScore(list.get(i).getScore());
            movieDTO.setMovieDirector(list.get(i).getDirector());
            movieDTO.setMovieActor(list.get(i).getActor1() + "," + list.get(i).getActor2()
                    + "," + list.get(i).getActor3() + "," + list.get(i).getActor4());
            movieDTO.setMovieArea(list.get(i).getArea());
            movieDTO.setMovieTime(list.get(i).getTime());
            movieDTO.setImg(list.get(i).getImgAddress());
            movies.add(movieDTO);
            if (id / 10000 == 1 && id % 10000 == 0) {
                movieMapper.insertList(movies);
                movies.clear();
                id = 10000;
            } else if (id / 10000 == 2 && id % 10000 == 0) {
                movieMapper.insertList(movies);
                movies.clear();
                id = 20000;
            } else if (id / 10000 == 3 && id % 10000 == 0) {
                movieMapper.insertList(movies);
                movies.clear();
                id = 30000;
            }
            id++;
        }
        movieMapper.insertList(movies);



        //===========actor============

       Map<String, ActorMap> map = new HashMap<>();
            List<Actor> actors = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                ActorMap actorMap1 = new ActorMap();
                ActorMap actorMap2 = new ActorMap();
            ActorMap actorMap3 = new ActorMap();
            ActorMap actorMap4 = new ActorMap();
            String name1 = list.get(i).getActor1();
            String name2 = list.get(i).getActor2();
            String name3 = list.get(i).getActor3();
            String name4 = list.get(i).getActor4();

            //如果票房数为0，则按照1000计算
            Double tempBox = list.get(i).getBox();
            if (tempBox == 0.0) {
                tempBox = 1000.0;
            }
            if (map.containsKey(name1)) {
                actorMap1.setCount(map.get(name1).getCount() + 1);
                actorMap1.setRank(map.get(name1).getRank() + ",1");
                actorMap1.setBox(map.get(name1).getBox() + tempBox);
                map.put(name1, actorMap1);
            } else {
                actorMap1.setCount(1);
                actorMap1.setRank("1");
                actorMap1.setBox(list.get(i).getBox());
                map.put(name1, actorMap1);
            }
            if (map.containsKey(name2)) {
                actorMap2.setCount(map.get(name2).getCount() + 1);
                actorMap2.setRank(map.get(name2).getRank() + ",2");
                actorMap2.setBox(map.get(name2).getBox() + tempBox);
                map.put(name2, actorMap2);
            } else {
                actorMap2.setCount(1);
                actorMap2.setRank("2");
                actorMap2.setBox(list.get(i).getBox());
                map.put(name2, actorMap2);
            }
            if (map.containsKey(name3)) {
                actorMap3.setCount(map.get(name3).getCount() + 1);
                actorMap3.setRank(map.get(name3).getRank() + ",3");
                actorMap3.setBox(map.get(name3).getBox() + tempBox);
                map.put(name3, actorMap3);
            } else {
                actorMap3.setCount(1);
                actorMap3.setRank("3");
                actorMap3.setBox(list.get(i).getBox());
                map.put(name3, actorMap3);
            }
            if (map.containsKey(name4)) {
                actorMap4.setCount(map.get(name4).getCount() + 1);
                actorMap4.setRank(map.get(name4).getRank() + ",4");
                actorMap4.setBox(map.get(name4).getBox() + tempBox);
                map.put(name4, actorMap4);
            } else {
                actorMap4.setCount(1);
                actorMap4.setRank("4");
                actorMap4.setBox(list.get(i).getBox());
                map.put(name4, actorMap4);
            }
        }

        int id = 1;
        for (Map.Entry entry : map.entrySet()) {
            Actor actor = new Actor();
            actor.setActorId(id);
            actor.setActorName((String) entry.getKey());
            ActorMap actorMap = (ActorMap) entry.getValue();
            actor.setMovieCount(actorMap.getCount());
            actor.setActorMovieRank(actorMap.getRank());
            actor.setAllBox(actorMap.getBox());
            actors.add(actor);
            if (id / 10000 == 3 && id % 10000 == 0) {
                actorMapper.insertList(actors);
                actors.clear();
                id = 30000;
                System.out.println("id===========" + id);
            }
            id++;
        }
        actorMapper.insertList(actors);*/


        //=================director============
        Map<String,DirectorMap> mapDirector = new HashMap<>();
        List<Director> directors = new ArrayList<>();
        for (int i = 0 ; i < len ; i++) {
            DirectorMap directorMap = new DirectorMap();

            String name = list.get(i).getDirector();

            Double tempBox = list.get(i).getBox();
            if(tempBox == 0.0){
                tempBox = 1000.0;
            }

            if (mapDirector.containsKey(name)) {
                directorMap.setMovieCount(mapDirector.get(name).getMovieCount()+1);
                directorMap.setBox(mapDirector.get(name).getBox()+tempBox);
                mapDirector.put(name, directorMap);
            } else {
                directorMap.setMovieCount(1);
                directorMap.setBox(tempBox);
                mapDirector.put(name, directorMap);
            }

        }
            int idDirector = 1;
            for (Map.Entry entry : mapDirector.entrySet()) {
                Director director = new Director();
                DirectorMap directorMap = (DirectorMap) entry.getValue();
                director.setDirectorId(idDirector);
                director.setDirectorName((String) entry.getKey());
                director.setMovieCount(directorMap.getMovieCount());
                director.setAllBox(directorMap.getBox());
                directors.add(director);
                idDirector++;
            }
            directorMapper.insertList(directors);
    }
}

