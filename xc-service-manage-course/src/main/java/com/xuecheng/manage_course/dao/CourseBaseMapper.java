package com.xuecheng.manage_course.dao;

import com.github.pagehelper.Page;
import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by mrt on 2018/6/30.
 */
@Mapper
public interface CourseBaseMapper {
    CourseBase findCourseBaseById(String id);
    //分页查询课程列表
    Page<CourseInfo> findCourseListPage(CourseListRequest courseListRequest);
}
