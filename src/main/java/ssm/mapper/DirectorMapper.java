package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Director;
import ssm.pojo.DirectorExample;

public interface DirectorMapper {
    int countByExample(DirectorExample example);

    int deleteByExample(DirectorExample example);

    int deleteByPrimaryKey(Integer directorId);

    int insert(Director record);

    int insertSelective(Director record);

    int insertList(@Param(value = "list") List<Director> list);

    int updateList(@Param(value = "list") List<Director> list);

    List<Director> selectByExample(DirectorExample example);

    Director selectByPrimaryKey(Integer directorId);

    int updateByExampleSelective(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByExample(@Param("record") Director record, @Param("example") DirectorExample example);

    int updateByPrimaryKeySelective(Director record);

    int updateByPrimaryKey(Director record);
}