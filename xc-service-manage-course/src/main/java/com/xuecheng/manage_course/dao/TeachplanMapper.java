package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mrt on 2018/6/30.
 */
@Mapper
public interface TeachplanMapper {
   //查询课程计划
    public TeachplanNode selectList(String courseId);
}
