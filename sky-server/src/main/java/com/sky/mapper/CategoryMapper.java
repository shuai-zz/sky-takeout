package com.sky.mapper;

import com.sky.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    /**
     * 新增分类
     * @param category
     */
    @Insert("insert into sky_take_out.category (type, name, sort, status, create_time, update_time, create_user, update_user) " +
            "values" +
            "(#{type}, #{name}, #{sort}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void insert(Category category);
}
