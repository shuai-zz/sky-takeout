package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealDishIdsBySetmealIds(List<Long> dishIds);

    /**
     * 批量插入菜品进套餐
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据setmeal_id删除数据项
     * @param setmealIds
     */
    void deleteByIds(List<Long> setmealIds);
}
