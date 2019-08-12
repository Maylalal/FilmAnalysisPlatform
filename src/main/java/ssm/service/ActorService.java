package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.ActorMapper;
import ssm.pojo.Actor;
import ssm.pojo.ActorExample;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    ActorMapper actorMapper;

    public List<Actor> showActorList()
    {
        ActorExample example = new ActorExample();
        ActorExample.Criteria criteria= example.createCriteria();
        criteria.andActorIdBetween(0,10000000);

        List<Actor> actorList = actorMapper.selectByExample(example);
        return actorList;
    }


    //用列表输出搜索结果
    //按电影名称查找电影
    public List<Actor> findByActorName(String actorName) {
        ActorExample example = new ActorExample();
        ActorExample.Criteria criteria= example.createCriteria();
        criteria.andActorNameEqualTo(actorName);

        List<Actor> list = actorMapper.selectByExample(example);
        return list;
    }

}
