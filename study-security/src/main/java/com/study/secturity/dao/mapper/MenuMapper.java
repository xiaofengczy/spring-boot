package com.study.secturity.dao.mapper;

import com.study.secturity.dao.entity.Menu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zycao
 * @create 2019-09-10
 */
@Mapper
public interface MenuMapper {

  List<Menu> getAllMenus();

}
