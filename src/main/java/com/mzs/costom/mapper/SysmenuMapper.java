package com.mzs.costom.mapper;

import com.mzs.costom.model.Sysmenu;
import com.mzs.costom.model.SysmenuCriteria;
import java.util.List;

public interface SysmenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int deleteByPrimaryKey(Long menuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int insert(Sysmenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int insertSelective(Sysmenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    List<Sysmenu> selectByExample(SysmenuCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    Sysmenu selectByPrimaryKey(Long menuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int updateByPrimaryKeySelective(Sysmenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysmenu
     *
     * @mbg.generated Tue Sep 05 14:46:47 CST 2017
     */
    int updateByPrimaryKey(Sysmenu record);
}