package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.mapper.DirectorMapper;
import ssm.pojo.Director;
import ssm.pojo.DirectorExample;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    DirectorMapper directorMapper;


    public List<Director> showDirectorList()
    {
        DirectorExample example = new DirectorExample();
        DirectorExample.Criteria criteria= example.createCriteria();
        criteria.andDirectorIdBetween(0,10000000);

        List<Director> directorList = directorMapper.selectByExample(example);
        return directorList;
    }


    //用列表输出搜索结果
    //按电影名称查找电影
    public List<Director> findByDirectorName(String directorName) {
        DirectorExample example = new DirectorExample();
        DirectorExample.Criteria criteria= example.createCriteria();
        criteria.andDirectorNameEqualTo(directorName);

        List<Director> list = directorMapper.selectByExample(example);
        return list;
    }

}
