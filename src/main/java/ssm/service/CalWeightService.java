package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.ActorMapper;
import ssm.mapper.DirectorMapper;
import ssm.mapper.MovieMapper;
import ssm.pojo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalWeightService {

    @Autowired
    ActorMapper actorMapper;

    @Autowired
    DirectorMapper directorMapper;

    @Autowired
    MovieMapper moviesMapper;

    public void calActorWeight() {
        ActorExample actorExample = new ActorExample();
        List<Actor> list = actorMapper.selectByExample(actorExample);

        int len = list.size();

        Map<Integer,Double> actMap = new HashMap<>();  //演员Id+演员权值

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0 ; i < len ; i++){

            //===================计算该演员的参演系数==============================
            String rank = list.get(i).getActorMovieRank();
            String [] ranks = rank.split(",");
            int c = ranks.length;    //代表该演员参演的电影数
            double u = 0;            //代表该演员的参演系数
            double tempU = 0;
            for (int j = 0 ; j < c ; j++){
                tempU += Integer.valueOf(ranks[j])/10.0;
            }
            u = 1.1*c - tempU;
            Double act = (list.get(i).getAllBox()+u)*1.0/c ;
            if(act > max){
                max = act;
            }
            if(act < min){
                min = act;
            }
            actMap.put(list.get(i).getActorId(),act);
        }


        Map<Integer,Double> weightMap = new HashMap<>();
        Double d = Math.log(max/min);
        for (int i = 0 ; i < len ; i++){
            Double weight = Math.log(actMap.get(list.get(i).getActorId())*1.0/min)/d;
            weightMap.put(list.get(i).getActorId(),weight);
        }


        updateActor(weightMap);
    }




    private void updateActor(Map<Integer, Double> weightMap) {
        List<Actor> actors = new ArrayList<>();
        for (Map.Entry map : weightMap.entrySet()){
            Actor actor = new Actor();
            actor.setActorId((Integer) map.getKey());
            actor.setActorWeight((Double) map.getValue());
            actors.add(actor);
        }
        actorMapper.updateList(actors);
    }

    public void calDirectorWeight() {
        DirectorExample directorExample = new DirectorExample();
        List<Director> list = directorMapper.selectByExample(directorExample);

        int len = list.size();

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        Map<Integer,Double> dirMap = new HashMap<>();  //导演Id+导演权值

        for (int i = 0 ; i < len ; i++){

            Double dir = list.get(i).getAllBox()*1.0/list.get(i).getMovieCount() ;
            if(dir > max){
                max = dir;
            }
            if(dir < min){
                min = dir;
            }
            dirMap.put(list.get(i).getDirectorId(),dir);
        }
        Map<Integer,Double> weightMap = new HashMap<>();

        Double d = Math.log(max/min);
        for (int i = 0 ; i < len ; i++){
            Double weight = Math.log(dirMap.get(list.get(i).getDirectorId())*1.0/min)/d;
            weightMap.put(list.get(i).getDirectorId(),weight);
        }
        updateDirector(weightMap);
    }

    private void updateDirector(Map<Integer, Double> weightMap) {
        List<Director> directors = new ArrayList<>();
        for (Map.Entry map : weightMap.entrySet()){
            Director director = new Director();
            director.setDirectorId((Integer) map.getKey());
            director.setDirectorWeight((Double) map.getValue());
            directors.add(director);
        }
        directorMapper.updateList(directors);
    }
}
