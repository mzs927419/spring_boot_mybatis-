package com.mzs.costom.mapper;

import com.mzs.costom.model.Sysuser;
import com.mzs.costom.model.SysuserCriteria;
import java.util.List;

public interface SysuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int insert(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int insertSelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    List<Sysuser> selectByExample(SysuserCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    Sysuser selectByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int updateByPrimaryKeySelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int updateByPrimaryKey(Sysuser record);
}