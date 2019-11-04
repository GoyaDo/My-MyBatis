package com.cj.app.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author cj
 * @date 2019-11-03 - 17:50
 */
public interface CityDao {
    @Select("select * from city")
    public List<Map<String,Object>> queryAll();
}
