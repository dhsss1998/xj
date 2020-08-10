package jee.support.dao;

import jee.support.entity.Score;
import jee.support.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScoreDao {




     List<Score> findByStudentId(@Param("studentId") long studentId);

}
