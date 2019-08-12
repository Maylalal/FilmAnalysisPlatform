package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.pojo.Actor;
import ssm.pojo.Director;

import java.util.List;

@Service
public class PredirectService {

    @Autowired
    DirectorService directorService;

    @Autowired
    ActorService actorService;

    public double forecastBox(String director, String actor1 , String actor2 , String actor3,String actor4 ) {
        List<Director> directorlist = directorService.findByDirectorName(director);
        List<Actor> actorList1 = actorService.findByActorName(actor1);
        List<Actor> actorList2 = actorService.findByActorName(actor2);
        List<Actor> actorList3 = actorService.findByActorName(actor3);
        List<Actor> actorList4 = actorService.findByActorName(actor4);
        double directorWeight = directorlist.get(0).getDirectorWeight();
        double actor1Weight = actorList1.get(0).getActorWeight();
        double actor2Weight = actorList2.get(0).getActorWeight();
        double actor3Weight = actorList3.get(0).getActorWeight();
        double actor4Weight = actorList4.get(0).getActorWeight();

        double box = 612.2899 * (directorWeight + actor1Weight +actor2Weight +actor3Weight +actor4Weight);

        return box;

    }

}
