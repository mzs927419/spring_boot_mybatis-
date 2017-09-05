package com.mzs.costom.mapper;

import com.mzs.costom.model.Sysrole;
import com.mzs.costom.model.SysroleCriteria;
import java.util.List;

public interface SysroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int deleteByPrimaryKey(Long roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int insert(Sysrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int insertSelective(Sysrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    List<Sysrole> selectByExample(SysroleCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    Sysrole selectByPrimaryKey(Long roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int updateByPrimaryKeySelective(Sysrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrole
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int updateByPrimaryKey(Sysrole record);
}