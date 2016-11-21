package com.atguigu.jf.console.baseapi.rolefunc;

import com.atguigu.jf.console.rolefunc.bean.pojo.SysroleFunc;
import com.atguigu.jf.console.rolefunc.bean.pojo.SysroleFuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysroleFuncMapper {
    int countByExample(SysroleFuncExample example);

    int deleteByExample(SysroleFuncExample example);

    int deleteByPrimaryKey(Long roleFuncId);

    int insert(SysroleFunc record);

    int insertSelective(SysroleFunc record);

    List<SysroleFunc> selectByExample(SysroleFuncExample example);

    SysroleFunc selectByPrimaryKey(Long roleFuncId);

    int updateByExampleSelective(@Param("record") SysroleFunc record, @Param("example") SysroleFuncExample example);

    int updateByExample(@Param("record") SysroleFunc record, @Param("example") SysroleFuncExample example);

    int updateByPrimaryKeySelective(SysroleFunc record);

    int updateByPrimaryKey(SysroleFunc record);
}